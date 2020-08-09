package ru.mail.dekster.igor.templateMethod;

public class TemplateMethodApp {
    public static void main(String[] args) {
    Parent firstChild = new FirstChild("Pasha", 25);
    Parent secondChild = new SecondChild("Fedor");

    firstChild.templateMethod();
    secondChild.templateMethod();
    }
}

abstract class Parent {
    private final String name;

    public Parent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //template method
    void templateMethod() {
        final String PARENT_SAY = "The Parent class has a child who named : ";
        System.out.print(PARENT_SAY);
        System.out.println(getDescriptionChild());
    }

    abstract String getDescriptionChild();
}

class FirstChild extends Parent{
    private final int age;

    public FirstChild(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    String getDescriptionChild() {
        return String.join(" ", getClass().getSimpleName(), getName(), String.valueOf(age));
    }
}

class SecondChild extends Parent{

    public SecondChild(String name) {
        super(name);
    }

    @Override
    String getDescriptionChild() {
        return String.join(" ", getClass().getSimpleName(), getName());
    }
}