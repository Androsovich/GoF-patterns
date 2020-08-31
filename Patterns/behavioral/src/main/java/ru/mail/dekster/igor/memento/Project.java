package ru.mail.dekster.igor.memento;

import java.time.LocalDateTime;

public class Project {
    private String version;
    private LocalDateTime date;

    public void setVersionAndDate(final String version) {
        this.version = version;
        date = LocalDateTime.now();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        this.version = save.getVersion();
        this.date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project" +
                "\n" + version +
                "\n date : " + date + "\n";
    }
}