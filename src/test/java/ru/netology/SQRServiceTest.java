package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    public void shouldOccurrenceOfCount() {

        int minRange = 200;
        int maxRange = 300;

        SQRService counter = new SQRService();
        int actual = counter.occurrenceOfCount(minRange, maxRange);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldOccurrenceOfDifferentCount() {

        int minRange = 10;
        int maxRange = 300;

        SQRService counter = new SQRService();
        int actual = counter.occurrenceOfCount(minRange, maxRange);
        int expected = 8;
        assertEquals(expected, actual);
    }
}
