package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {

    @Test //Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
    //переданное число в интервал (25;100)
    void numberInInterval() {
        assertEquals(Interval.numberInInterval(24), false);
        assertEquals(Interval.numberInInterval(101), false);
        assertEquals(Interval.numberInInterval(-5), false);
        assertEquals(Interval.numberInInterval(50), true);
    }
}