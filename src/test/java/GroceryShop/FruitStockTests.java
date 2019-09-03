package GroceryShop;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FruitStockTests
{
    @Test
    public void checkFruitIsInStock()
    {
        Fruit fruit = new Fruit();

        int numberOfFruitInStock = fruit.getNumberOfFruit();

        assertTrue( numberOfFruitInStock > 0 );
    }
}
