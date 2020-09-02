package ru.mail.dekster.igor.state.days;

import ru.mail.dekster.igor.state.Electrician;

public class WeekEnd extends Day {

    @Override
    public void doSomething(Electrician context) {
        if (countDays()) {
            System.out.println("Rest...");
        } else {
            context.setState(new WorkDay());
        }
    }
}