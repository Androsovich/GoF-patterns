package ru.mail.dekster.igor.state;

import ru.mail.dekster.igor.state.days.Activity;

public class Electrician {
    private Activity state;

    public void setState(Activity state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}