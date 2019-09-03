package GroceryShop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FruitStockTests
{
    @Test
    public void checkFruitIsInStock()
    {
        Fruit fruit = new Fruit(1);

        int numberOfFruitInStock = fruit.getNumberOfFruit();

        assertTrue( numberOfFruitInStock > 0 );
    }

    @Test
    public void stockTakeFruit()
    {
        int controlFruit = 5;

        Fruit fruit = new Fruit(5);

        int numberOfFruitInStock = fruit.getNumberOfFruit();

        assertEquals(controlFruit, numberOfFruitInStock);

    }

    @Test
    public void stockTakeDoneBeforeStockChecked()
    {
        Fruit fruit = new Fruit(5);

        int numberOfFruitInStock = fruit.getNumberOfFruit();

        assertTrue( numberOfFruitInStock > 0 );
    }
}
