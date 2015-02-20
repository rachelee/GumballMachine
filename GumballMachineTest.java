

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GumballMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GumballMachineTest
{
    private GumballMachine m2;

    


    

    /**
     * Default constructor for test class GumballMachineTest
     */
    public GumballMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        m2 = new GumballMachine(5);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


   

    @Test
    public void enoughMoney()
    {
        System.out.println("@Test: enoughMoney");
        m2.insertQuarter();
        m2.insertNickel();
        m2.insertDime();
        m2.insertQuarter();
        m2.turnCrank();
        assertEquals(true, m2.isGumballInSlot());
        m2.takeGumballFromSlot();
        assertEquals(false, m2.isGumballInSlot());
    }

    @Test
    public void notEnoughMoney()
    {
        System.out.println("@Test: notEnoughMoney");
        m2.insertQuarter();
        m2.insertNickel();
        m2.insertDime();
        m2.turnCrank();
        assertEquals(false, m2.isGumballInSlot());
    }

    @Test
    public void twoGumballInSlot()
    {
        System.out.println("@Test: twoGumballInSlot");
        m2.insertQuarter();
        m2.insertQuarter();
        m2.turnCrank();
        m2.insertQuarter();
        m2.insertDime();
        m2.insertQuarter();
        m2.turnCrank();
        assertEquals(true, m2.isGumballInSlot());
        m2.takeGumballFromSlot();
        assertEquals(false, m2.isGumballInSlot());
    }

    @Test
    public void soldOut()
    {
        System.out.println("@Test: soldOut");
        m2.insertQuarter();
        m2.insertQuarter();
        m2.turnCrank();
        m2.insertQuarter();
        m2.insertQuarter();
        m2.turnCrank();
        m2.insertQuarter();
        m2.insertQuarter();
        m2.turnCrank();
        m2.insertQuarter();
        m2.insertQuarter();
        m2.turnCrank();
        m2.insertQuarter();
        m2.insertQuarter();
        m2.turnCrank();
        m2.insertQuarter();
        m2.takeGumballFromSlot();
        m2.refill(5);
        m2.toString();
    }

    @Test
    public void ejectMoney()
    {
        System.out.println("@Test: ejectMoney");
        m2.insertQuarter();
        m2.insertNickel();
        m2.eject();
        m2.turnCrank();
        assertEquals(false, m2.isGumballInSlot());
    }
}










