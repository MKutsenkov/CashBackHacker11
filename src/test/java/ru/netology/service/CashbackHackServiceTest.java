package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
   public void shouldReturn100IfAmountIs900() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 1000;

        // выполнение целевого действия
        int actual = service.remain(amount);

        // сравнение ОР и ФР
        assertEquals(expected,actual);
    }

    @Test
   public void shouldReturn0IfAmountIs1000() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 1000;

        // выполнение целевого действия
        int actual = service.remain(amount);

        // сравнение ОР и ФР
        assertEquals(expected,actual);
    }

}