package ru.otus;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloOtusTest {

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach");
    }

    @Test
    void main() {
        System.out.println("@Test");
        System.out.println("hashCode " + hashCode());
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach");
    }
}