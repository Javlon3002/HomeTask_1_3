package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestDivision {

    @Test
    @DisplayName("Test division calculations")
    public void testDivide() {
        // Capture the output of the divide method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Test cases for divide method
        Division.divide(13, 4);  // Expected output: "3.25"
        assertEquals("3.25", outputStream.toString().trim());
        outputStream.reset(); // Clear output stream

        Division.divide(1, 3);   // Expected output: "0.33"
        assertEquals("0.33", outputStream.toString().trim());
        outputStream.reset(); // Clear output stream

        Division.divide(2, 3);   // Expected output: "0.67"
        assertEquals("0.67", outputStream.toString().trim());

        Division.divide(1, 1);   // Expected output: "0.33"
        assertEquals("0.33", outputStream.toString().trim());

        // Reset the output
        System.setOut(originalOut);
    }
}
