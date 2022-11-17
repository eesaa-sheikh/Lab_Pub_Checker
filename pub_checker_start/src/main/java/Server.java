import java.util.ArrayList;

public class Server {
     private int checkAge;
     private double cashReg;
    private ArrayList<Drink> stock;
    private char poundSign;
    private boolean banned;

    public Server (int checkAge, double cashReg, char poundSign, ArrayList stock){

        this.checkAge =checkAge;
        this.cashReg=0;
        this.poundSign=poundSign;
        this.stock=new ArrayList<>();
    }

    //Check if the guest is the legal age limit and is not drunk
    public boolean canServeGuest(Guest guest) {
        if (guest.getAge() > this.checkAge && guest.getSoberLvl() > 50
                && guest.getWalletCurrency() == getPoundSign() && guest.getisBannedFromPub() == false) {
            return true;
        }
        return false;
    }






        // selling the drink if in steps would mean to reduce
        // stock by 1,
        // give that drink to the customer
        //in the cashReg the value of the wallet left should be locoated here here.

    public void canSellDrink (Guest guest, Drink drink){
            guest.buyDrink(drink,guest);
            this.stock.remove(drink);
            setCashReg(this.cashReg + drink.getDrinkPrice());
        }







    //setters and getters

    //CheckingAge


    public int getCheckAge() {
        return checkAge;
    }

    public void setCheckAge(int checkAge) {
        this.checkAge = checkAge;
    }

    //cash register
    public double getCashReg() {
        return cashReg;
    }

    public void setCashReg(double cashReg) {
        this.cashReg = cashReg;
    }

    //Currency of drink
    public char getPoundSign() {
        return poundSign;
    }

    public void setPoundSign(char poundSign) {
        this.poundSign = poundSign;
    }

    public ArrayList<Drink> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Drink> stock) {
        this.stock = stock;
    }
}
