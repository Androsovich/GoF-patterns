package ru.mail.dekster.igor.memento;

import java.time.LocalDateTime;

public class Save {
    private final String version;
    private final LocalDateTime date;

    public Save(String version) {
        this.version = version;
        date = LocalDateTime.now();
    }

    public String getVersion() {
        return version;
    }

    public LocalDateTime getDate() {
        return date;
    }
}