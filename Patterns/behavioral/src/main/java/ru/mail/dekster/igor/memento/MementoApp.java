package ru.mail.dekster.igor.memento;

public class MementoApp {
    public static void main(String[] args) {
        Project project = new Project();
        GithubRepo githubRepo = new GithubRepo();

        System.out.println("Creating new project Version 1.0");
        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        System.out.println("Saving current version to github");
        githubRepo.setSave(project.save());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Updating project to Version 1.1");
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("Something went wrong...");
        System.out.println("Rolling back to Version 1.0");
        project.load(githubRepo.getSave());

        System.out.println("Project after rollback...");
        System.out.println(project);
    }
}