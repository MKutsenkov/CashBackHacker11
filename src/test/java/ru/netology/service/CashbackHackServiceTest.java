package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashbackHackServiceTest {

    @Test
   public void shouldReturn100IfAmountIs900() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        // выполнение целевого действия
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
   public void shouldReturn0IfAmountIs1000() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected =  0;

        // выполнение целевого действия
        int actual = service.remain(amount);

        // сравнение ОР и ФР
        assertEquals(actual,expected);
    }

}