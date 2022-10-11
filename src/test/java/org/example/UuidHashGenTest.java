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
    }
}