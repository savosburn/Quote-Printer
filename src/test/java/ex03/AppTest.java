/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_quote_and_name() {
        App myApp = new App();
        String name = "Obi-Wan Kenobi";
        String quote = "These aren't the droids you're looking for.";

        String expectedOutput = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        String actualOutput = myApp.concatenateOutput(quote, name);

        assertEquals(expectedOutput, actualOutput);
    }
}