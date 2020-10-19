package com.tanxin;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class CalculaterTest {

    private static Calculater cal=new Calculater();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("@BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("@AfterClass");
    }

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @org.junit.Test
    public void add() {
        cal.add(2,2);
        assertEquals(4,cal.getResult());
        //fail("Not yet implemented");
    }

    @org.junit.Test
    public void subtract() {
        cal.subtract(4,2);
        assertEquals(2, cal.getResult());
    }

    @org.junit.Test
    public void multipe() {
        cal.multipe(10,10);
        assertEquals(100, cal.getResult());
    }

    @org.junit.Ignore
    public void divide() {
        fail("Not yet implemented");
    }

}