
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class GuestTest {

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Drink mountainDew;
    private Drink coke;

    @BeforeEach

    public void setUp() {
        guest2 = new Guest("John", 100, 20, 50, '£', false);
        guest1 = new Guest("Mark", 1, 15, 100, '£', true);
        guest3 = new Guest("Sheikh", 100, 20, 50, '$', true);
        guest4 = new Guest("Tom", 69, 12, 1, '$', false);
        mountainDew = new Drink("Mountain Dew", 5);
        coke = new Drink("Coke", 5);

    }

    @Test
    //Test to see if the name and age works
    public void hasNameandAge() {
        String name = guest1.getName();
        String name2 = guest2.getName();
        int age = guest1.getAge();
        int age2 = guest2.getAge();
        //John's name
        Assertions.assertThat(name).isEqualTo("Mark");
        //Mark's name
        Assertions.assertThat(name2).isEqualTo("John");
        //John's age
        Assertions.assertThat(age).isEqualTo(15);
        //Mark's age
        Assertions.assertThat(age2).isEqualTo(20);

    }

    @Test
    //Test to see if wallet can afford drink
    public void canAffordDrink() {
        //can afford one or the other so true expected
        assertThat(guest2.checkBuyDrink(mountainDew)).isEqualTo(true);




    }


    @Test
    //Test to see if wallet can afford drink
    public void cannotAffordDrink() {
        //can't afford so false expected
        assertThat(guest1.checkBuyDrink(coke)).isEqualTo(false);

    }

    @Test
    //Test to see if wallet amount can be deducted
    public void willBuyDrink() {
        //someone with a higher wallet
        guest2.buyDrink(mountainDew, guest2);
        assertThat(guest2.getWallet()).isEqualTo(95);

        //someone with a lower wallet
        guest4.buyDrink(coke,guest4);
        assertThat(guest4.getWallet()).isEqualTo(64);
    }

        @Test
        public void testGuestIsBan() {
            //Guest is banned
            assertThat(guest3.getisBannedFromPub()).isEqualTo(true);

        }
        @Test
        public void testGuestIsNotBan () {
            //Guest is not banned
            assertThat(guest1.getisBannedFromPub()).isEqualTo(false);

        }


    }
