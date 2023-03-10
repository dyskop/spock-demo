package by.skopinau.spock.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTests {

    @Test
    public void givenTwoAndTwo_whenAdding_thenResultIsFour() {
        // Given
        int first = 2;
        int second = 4;

        // When
        int result = 2 + 2;

        // Then
        assertEquals(4, result);
    }

}