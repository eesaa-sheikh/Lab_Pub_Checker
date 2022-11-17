import java.util.ArrayList;

public class Guest {

    private String name;
    private double wallet;
    private int age;
    private int soberLvl;
    private char walletCurrency;
    private ArrayList<Drink> insideStomach;
    private boolean bannedFromPub;

    //Constructor
    public Guest(String name, double wallet, int age, int soberLvl, char walletCurrency, boolean bannedFromPub) {

        //Checkpoints
        this.name = name;
        this.wallet = wallet;
        this.age = age;
        this.soberLvl = soberLvl;
        this.walletCurrency = walletCurrency;
        this.insideStomach = new ArrayList<>();
        this.bannedFromPub = bannedFromPub;
    }

        //before buying. It's best to understand a few things. Is the guest drunk?

        //is the guest old enough. something like ".checkAge". The first two should be in the Server

        // Does the guest have enough money?
        public boolean checkBuyDrink(Drink drink){
            if (drink.getDrinkPrice() <= this.wallet){
                return true;
            }
            return false;
        }
        //check if guest is drunk
        public boolean checkIfGuestIsDrunk(Guest guest){
        if (guest.getSoberLvl() < 50){
            return false; //guest is drunk
        } return true;
        }

    public void buyDrink(Drink drink, Guest guest) {
        if (!(!guest.checkBuyDrink(drink))) {
            this.wallet -= drink.getDrinkPrice(); //price is deducted
            this.insideStomach.add(drink); // the guest drinks the drink
        }
    }

    public boolean checkBan(Guest bannedFromPub ){
        if (bannedFromPub.getisBannedFromPub() == true){
            return false;
        }
        return true;
    }

        //this just represents the customer is drinking the
        public int getInsideStomach(){
        return this.insideStomach.size();
        }

        // Does the customers currency line up to the currency of the server side




    //setters and getters

    //Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //Wallet
    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }



    //Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //Sober level
    public int getSoberLvl() {
        return soberLvl;
    }

    public void setSoberLvl(int soberLvl) {
        this.soberLvl = soberLvl;
    }
    // wallet currency
    public void setWalletCurrency(char walletCurrency) {
        this.walletCurrency = walletCurrency;
    }

    public char getWalletCurrency() {
        return walletCurrency;
    }

    public boolean getisBannedFromPub() {
        return bannedFromPub;
    }

    public void setBannedFromPub(boolean bannedFromPub) {
    }
}
