package GroceryShop;

public class Fruit
{
    private int numberOfFruit;
    private double priceOfFruit = 1.99;
    private double fruitProfit = 0.09;

    public Fruit(int numberOfFruit) {
        this.numberOfFruit = numberOfFruit;
    }

    public double getFruitProfit() {
        return fruitProfit;
    }

    public void setFruitProfit(double fruitProfit) {
        this.fruitProfit = fruitProfit;
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
