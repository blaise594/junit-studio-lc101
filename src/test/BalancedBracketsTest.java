package test;
import main.BalancedBrackets;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void oddBracketsReturnedFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]someString[]"));
    }
    @Test
    public void assertEqualsExample() {

       assertEquals(false, BalancedBrackets.hasBalancedBrackets("]someString[]"));
    }
    @Test
    public void returnsSpecificString() {
        assertSame(BalancedBrackets.hasBalancedBrackets("[]"), true);

    }
    @Test
    public void notNullExample(){
        assertNotNull(BalancedBrackets.hasBalancedBrackets("]someString[]"));
    }
    @Test
    public void someTest(){
        assertTrue(BalancedBrackets.hasBalancedBracketsAlso("[]"));
    }
}
