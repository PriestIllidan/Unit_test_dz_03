package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenTest {

    @Test //Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
    //переданное число четным или нечетным.
    void evenOddNumber() {
        Even result = new Even();
        boolean resTrue = result.evenOddNumber(2);
        boolean resFalse = result.evenOddNumber(1);
        assertEquals(true, resTrue);
        assertEquals(false, resFalse);
    }
}