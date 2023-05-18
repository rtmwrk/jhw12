package ru.netology;

public class CashbackHackServiceTest {
    // Проведем позитивное функциональное тестирование сервисного класса CashbackHackService.
    // Методики "эквивалентных" и "граничных значений".

    // Позитивный функциональный тест
    // Метод эквивалентных значений:
    // - amount < boundary
    // Тест должен проходить без ошибок
    @org.junit.Test
    public void shouldFuncPositiveTestIfAmountLessBoundary() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(900);
        int expected = 100;

        org.junit.Assert.assertEquals(expected,actual);
    }

    // Позитивный функциональный тест
    // Метод эквивалентных значений:
    // - amount > boundary, но amount < 2*boundary
    // Тест должен проходить без ошибок
    @org.junit.Test
    public void shouldFuncPositiveTestIfAmountMoreBoundary() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1_800);
        int expected = 200;

        org.junit.Assert.assertEquals(expected,actual);
    }

    // Позитивный функциональный тест
    // Метод граничных значений:
    // - amount = boundary - 1
    // Тест должен проходить без ошибок
    @org.junit.Test
    public void shouldFuncPositiveTestIfAmountLessBoundaryByOne() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(999);
        int expected = 1;

        org.junit.Assert.assertEquals(expected,actual);
    }

    // Позитивный функциональный тест
    // Метод граничных значений:
    // - amount = boundary
    // Тест должен проходить без ошибок, но в следствие дефекта
    // тест не проходит
    @org.junit.Test
    public void shouldFuncPositiveTestIfAmountEqualBoundary() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1_000);
        int expected = 0;

        org.junit.Assert.assertEquals(expected,actual);
    }

    // Позитивный функциональный тест
    // Метод граничных значений:
    // - amount = boundary + 1
    // Тест должен проходить без ошибок
    @org.junit.Test
    public void shouldFuncPositiveTestIfAmountMoreBoundaryByOne() {
        CashbackHackService cashback = new CashbackHackService();

        int actual = cashback.remain(1_001);
        int expected = 999;

        org.junit.Assert.assertEquals(expected,actual);
    }

    // В описанных выше тестах мы проверяли логику работы метода "remain" сервисного класса.
    // Также мы фактически протестировали данный метод на положительные значения параметра.
    // Тесты на нулевое и отрицательные значение параметра "amount" проводить не будем,
    // считаем, что в метод может передаваться только положительное значение данного параметра
    // (данная логика по сути и реализована в методе).
}