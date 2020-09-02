package ru.mail.dekster.igor.state.days;

abstract class Day implements Activity {
    private int count = 0;

    protected boolean countDays() {
        return count++ < 2;
    }
}