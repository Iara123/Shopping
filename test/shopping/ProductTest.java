package shopping;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    private Product prod1;

    public ProductTest() {
    }

    @Before
    public void setUp() throws Exception {
        prod1 = new Product("P001", "Plasma TV LG 32", "Plasma TV whit TDT Decod. and high resolution Screen", 46999.99);
    }

    @After
    public void tearDown() {
        prod1 = null;
    }

    @Test
    public void testGetCode() {
        System.out.println("getCode");
        String expResult = "P001";
        String result = prod1.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Plasma TV LG 32";
        String result = prod1.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "Plasma TV whit TDT Decod. and high resolution Screen";
        String result = prod1.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Double expResult = 46999.99;
        Double result = prod1.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

}
