package practice;

import java.util.Scanner;

abstract class Employee {
    private String name;
    private int id;
    protected double salary;

    private static int employee_count = 0;
    private static final double MIN_SALARY = 5000;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        employee_count++;
    }

    public abstract double calculateBonus();

    void display() {
        System.out.println(this.name + " " + this.id + " : " + this.salary);
    }

    public final void clockIn() {
        System.out.println("this is the time now ");
    }

    private void log(String message) {
        System.out.println("[log]" + message);
    }
}

class Developer extends Employee {

    private String programmingLanguage;
    private int projectsCompleted;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.programmingLanguage = language;
        this.projectsCompleted = 0;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20 + (projectsCompleted * 1000);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Writing code in " + programmingLanguage);
    }

    public void completeProject() {
        projectsCompleted++;
        System.out.println("Project completed! Total: " + projectsCompleted);
    }
}

public class Abspr1 {

    public static void main(String[] args) {

        Employee[] e = new Employee[2];

        e[0] = new Developer("Umair", 123, 7000, "Java");
        e[1] = new Developer("Moni", 124, 6000, "Python");

        for (Employee i : e) {
            i.display();
            System.out.println("Bonus: " + i.calculateBonus());
        }
    }
}