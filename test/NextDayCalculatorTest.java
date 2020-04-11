import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Test 28/02/2018")
    void testFindNextDay1() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = NextDayCalculator.findNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test 28/02/2020")
    void testFindNextDay2() {
        int day = 28;
        int month = 2;
        int year = 2020;
        String expected = "29/2/2020";
        String result = NextDayCalculator.findNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test 31/12/2018")
    void testFindNextDay3() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String result = NextDayCalculator.findNextDay(day, month, year);
        assertEquals(expected, result);
    }
}