import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ServerTest {

    private Server server1;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;
    private Drink mountainDew;
    private Drink pepsi;

    @BeforeEach
    public void setUp() {
        server1 = new Server(18, 0, '£', new ArrayList<>());
        guest1 = new Guest("John", 100, 20, 50, '£', true);
        guest2 = new Guest("Mark", 0, 100, 100, '£', false);
        guest3 = new Guest("Sheikh", 100, 20, 50, '$', true);
        guest4 = new Guest("Tom", 1, 12, 1, '$', false);
        guest5 = new Guest("Tom", 1, 1, 1, '$', false);
        mountainDew = new Drink("Mountain Dew", 5);
    }

    // TODO: test that guest can only get served if over 18

    @Test
    //If all requirements are met  (expected true) this  ifGuestCanBeServedOverall is a quick way of getting
    public void ifGuestCanBeServedOverall() {
        assertThat(server1.canServeGuest(guest1)).isEqualTo(false);
        assertThat(server1.canServeGuest(guest2)).isEqualTo(true);
        assertThat(server1.canServeGuest(guest5)).isEqualTo(false);
    }

    @Test
    public void isGuestNotLegalAge() {
        //Guest is  not old enough

        int guest4Age = guest4.getAge();
        assertThat(guest4Age > server1.getCheckAge()).isEqualTo(false);


    }

    @Test
    public void isGuestLegalAge() {
        //Guest is  old enough

        int guest1Age = guest1.getAge();
        int serverCheck = server1.getCheckAge();
        assertThat(guest1Age > server1.getCheckAge()).isEqualTo(true);


    }

    @Test

    //Test to see if the currency matches
    public void ifCurrencyMatches() {
        //can is of the legal but is too drunk
        char currency1=guest1.getWalletCurrency();
        char currency2 = guest4.getWalletCurrency();
        char serverCurrency= server1.getPoundSign();

        assertThat(currency1).isEqualTo(serverCurrency);
    }
    @Test
    //Test to see if the currency does matches
    public void ifCurrencyDoesNotMatches() {
        //can is of the legal but is too drunk
        char currency2 = guest4.getWalletCurrency();
        char serverCurrency= server1.getPoundSign();
        assertThat(currency2 == serverCurrency).isEqualTo(false);
    }
    @Test
    public void isSoberlevelsHigh() {
        //Guest is  sober
        assertThat(guest1.checkIfGuestIsDrunk(guest1)).isEqualTo(true);


    }
    @Test
    public void isSoberlevelslow() {
        //Guest is  drunk
        assertThat(guest4.checkIfGuestIsDrunk(guest4)).isEqualTo(false);


    }






    // : test that guest can only get served if has enough money to buy a drink (every drink is £5)

        //  test that guest can only get served if sober enough (set sobriety level on guest)

        // test that guest can only get served if guest is not banned from the pub

        // : test that guest can only get served if guest can pay in local currency (add £ char as currency)

        // EXTENSIONS

        // TODO: test that guest can only get served if server can make favourite drink
        //  (give server a list of drinks (strings) it can make)

    }