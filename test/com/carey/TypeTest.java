/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carey;

import java.util.regex.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ReginaldCarey
 */
public class TypeTest {

    public TypeTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of values method, of class Type.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Type[] expResult = null;
        Type[] result = Type.values();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valueOf method, of class Type.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        String name = "";
        Type expResult = null;
        Type result = Type.valueOf(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatcher method, of class Type.
     */
    @Test
    public void testGetMatcher() {
        System.out.println("getMatcher");
        CharSequence charSequence = null;
        Type instance = null;
        Matcher expResult = null;
        Matcher result = instance.getMatcher(charSequence);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
