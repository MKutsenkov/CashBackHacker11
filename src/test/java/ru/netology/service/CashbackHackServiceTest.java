package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
   public void shouldReturn100IfAmountIs900() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        // выполнение целевого действия
        int actual = service.remain(amount);

        // сравнение ОР и ФР
        assertEquals(expected,actual);
    }

    @Test
   public void shouldReturn0IfAmountIs1000() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;

        // выполнение целевого действия
        int actual = service.remain(amount);

        // сравнение ОР и ФР
        assertEquals(expected,actual);
    }

    @Test
    public void shouldBuyMoreFor1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

}