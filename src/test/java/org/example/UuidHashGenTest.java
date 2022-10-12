package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UuidHashGenTest {
    UuidHashGen uuidHashGen;

    @BeforeEach
    void setUp() {
        uuidHashGen = new UuidHashGen();
    }

    @Test
    void genHash() {
        assertEquals("7a064ab307e41dda", uuidHashGen.genHash("445fe383-d645-4436-85ab-8d9afba1d219"), "Sample A");
        assertEquals("0e08fdce5477b9ca", uuidHashGen.genHash("e9cab3f1-59d1-477b-ba2e-86e9640214a0"), "Sample B");
        assertEquals("9fd0cc351d5ce00f", uuidHashGen.genHash("bd83a6da-3b89-4aa8-b1fb-cb119b800f02"), "Sample C");
        assertEquals("00aa16114fed14df", uuidHashGen.genHash("d705d648-7d5b-478b-ae0f-1029f0eb5fd7"), "Sample D");
        assertEquals("8b73926955300510", uuidHashGen.genHash("f90c9158-594c-4e46-b263-53706da8c23f"), "Sample E");
        assertEquals("9902a0cc83964000", uuidHashGen.genHash("2d655f32-1fc2-48a0-90d4-a211f877c326"), "Sample F");
    }
}