package ru.mail.dekster.igor.state.days;

import ru.mail.dekster.igor.state.Electrician;

public interface Activity {
    void doSomething(Electrician context);
}