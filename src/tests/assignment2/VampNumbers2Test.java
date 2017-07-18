package assignment2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jay Dadhania on 13/7/17.
 */
public class VampNumbers2Test {
    VampNumbers testvp =new VampNumbers();
    @Test
    public void getFangs() throws Exception {
        assertTrue(testvp.getFangs(1260,1000));
    }

    @Test
    public void checkIfVampFangs() throws Exception {
    }

}