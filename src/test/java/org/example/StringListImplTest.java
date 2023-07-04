package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    StringListImpl stringListService = new StringListImpl();


    @BeforeEach
    public void setUp() {
       // System.out.println("stringListService.size() = " + stringListService.size());
        stringListService.add(1, "bub");
    }

    @Test
    void add() {
        System.out.println("stringListService.size() = " + stringListService.size());
        var actual = stringListService.add(0, "ddd");
        System.out.println(actual);
        var expected = "ddd";

        assertEquals(actual, expected);
    }

    @Test
    void testAdd() {
    }

    @Test
    void set() {
    }

    @Test
    void remove() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void contains() {
    }

    @Test
    void indexOf() {
    }

    @Test
    void lastIndexOf() {
    }

    @Test
    void get() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void clear() {
    }

    @Test
    void toArray() {
    }
}