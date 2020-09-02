package ru.mail.dekster.igor.state.days;

import ru.mail.dekster.igor.state.Electrician;

public class WorkDay extends Day {

    @Override
    public void doSomething(Electrician context) {
        if (countDays()) {
            System.out.println("Work...");
        } else {
            context.setState(new WeekEnd());
        }
    }
}