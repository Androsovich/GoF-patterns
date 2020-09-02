package ru.mail.dekster.igor.state;

import ru.mail.dekster.igor.state.days.WorkDay;

import java.util.stream.IntStream;

public class StateApp {
    public static void main(String[] args) {
        Electrician electrician = new Electrician();
        electrician.setState(new WorkDay());

        IntStream.range(0, 31).forEach(x -> electrician.doSomething());
    }
}
