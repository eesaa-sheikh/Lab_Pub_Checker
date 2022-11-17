public class Drink {

    private final String drinkName;
    private final double drinkPrice;


    public Drink(String drinkName, double drinkPrice) {
        this.drinkPrice = drinkPrice;
        this.drinkName = drinkName;

    }

    // Getters

    public String getDrinkName() { //For Drink Name
        return drinkName;
    }

    public void setDrinkName() {
        return;
    }

    public double getDrinkPrice() { // For Drink price
        return drinkPrice;
    }

    public void setDrinkPrice() {
        return;
    }
}



