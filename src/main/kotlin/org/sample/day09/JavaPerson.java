package org.sample.day09;

public class JavaPerson {

    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
        if (this.age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
    }

    public JavaPerson(String name) {
        this(name, 1);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 20;
    }
}
