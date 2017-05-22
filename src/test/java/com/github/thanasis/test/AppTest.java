package com.github.thanasis.test;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testApp()
    {
        assertTrue( true );
    }


    @Test
    public void testApp2()
    {
        assertEquals(4, 4 );
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5, App.sum(2, 3));
    }
}
