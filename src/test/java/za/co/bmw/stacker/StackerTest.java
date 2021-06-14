package za.co.bmw.stacker;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

/**
 *
 * @author hlulani.mhlongo
 */
public class StackerTest {

    public StackerTest() {
    }

    @Test
    public void testInit() {
        // Invoke SUT
        Stacker<Integer> instance = new Stacker<>();

        // Evaluate Results
        assertEquals(0, instance.count());
        assertTrue(instance.empty());
    }

    @Test
    public void testPushIncreasedSize() {

        // Prepare Data
        Stacker<Integer> instance = new Stacker<>();

        // Invoke SUT
        instance.push(15);
        instance.push(10);
        instance.push(6);

        // Evaluate Results
        assertEquals(3, instance.count());
    }

    @Test
    public void testPop() {
        // Prepare Data
        Stacker<Integer> instance = new Stacker<>();

        // Invoke SUT
        instance.push(15);
        instance.push(10);
        instance.push(6);

        Integer actualPopped = instance.pop();

        // Evaluate Results
        assertEquals(2, instance.count());
        assertEquals(6, actualPopped);
    }

    @Test
    public void testPopOnEmpty() {
        // Prepare Data
        Stacker<Integer> instance = new Stacker<>();

        // Invoke SUT
        Integer actualPopped = instance.pop();

        // Evaluate Results
        assertNull(actualPopped);
        assertEquals(0, instance.count());
        assertTrue(instance.empty());
    }
}
