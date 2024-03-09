package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
    @Test
    public void testTestcase() {

        String course="Desktop";
        String price="29";
        Main b=new Main();
        String result=b.Browser(course);
        assertEquals(price,result );
        
    }
}
