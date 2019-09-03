package GroceryShop;

public class Fruit
{
    private int numberOfFruit;
    private double priceOfFruit = 1.99;

    public Fruit(int numberOfFruit) {
        this.numberOfFruit = numberOfFruit;
    }

    public double getPriceOfFruit() {
        return priceOfFruit;
    }

    public void setPriceOfFruit(double priceOfFruit) {
        this.priceOfFruit = priceOfFruit;
    }

    public int getNumberOfFruit() {
        return numberOfFruit;
    }

}
