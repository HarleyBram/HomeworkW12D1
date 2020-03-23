import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ManagerTest{
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Keith", "123", 20000, "Sales");
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(20100, manager.raiseSalary(100.00));
    }

    @Test
    public void canGiveBonus(){
        assertEquals(200, manager.giveBonus());
    }
}

