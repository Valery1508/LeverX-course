package ru.leverx.task1;

public class Person {

    private String name;
    private String courseName;

    public Person(String name, String courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    public String getName() {
        return name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void greeting(){
        System.out.println("Hi, " + name + " from " + courseName
                            + ". Have a good day!");
    }
}
