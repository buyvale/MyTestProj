package com.buyvalenko.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ArrayListTest {
    private ArrayList arrayWithThreeElements = new ArrayList();

    @Before
    public void before() {
        arrayWithThreeElements.add("A");
        arrayWithThreeElements.add("B");
        arrayWithThreeElements.add("C");
    }

    @Test
    public void testGetByIndex() {

        assertEquals("A", arrayWithThreeElements.get(0));
        assertEquals("B", arrayWithThreeElements.get(1));
        assertEquals("C", arrayWithThreeElements.get(2));
    }

    @Test
    public void testSize() {
        assertEquals(3, arrayWithThreeElements.size());
    }

    @Test
    public void testSet()
    {
        assertEquals("D", arrayWithThreeElements.set("D",1));
        assertEquals("A", arrayWithThreeElements.get(0));
        assertEquals("D", arrayWithThreeElements.get(1));
        assertEquals("C", arrayWithThreeElements.get(2));
    }

    @Test
    public void testAddByIndex()
    {
        arrayWithThreeElements.add("E",2);
        assertEquals("A",arrayWithThreeElements.get(0));
        assertEquals("B",arrayWithThreeElements.get(1));
        assertEquals("E",arrayWithThreeElements.get(2));
        assertEquals("C",arrayWithThreeElements.get(3));

    }

    @Test
    public void testRemoveObject()
    {
        arrayWithThreeElements.remove(1);
        assertEquals("A",arrayWithThreeElements.get(0));
        assertEquals("C",arrayWithThreeElements.get(1));
    }

    @Test
    public void testIsEmpty()
    {
        assertEquals(false,arrayWithThreeElements.isEmpty());
    }

}