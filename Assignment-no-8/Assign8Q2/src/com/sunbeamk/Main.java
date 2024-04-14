package com.sunbeamk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private int roll;
    private String name;
    private String city;
    private double marks;

    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", City: " + city + ", Marks: " + marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        Student[] students = {
                new Student(83529, "Shruti", "Tasgaon", 85.5),
                new Student(83535, "Akshada", "Islampur", 85.9),
                new Student(83510, "Shreyansh", "Abdulat", 86.3),
                new Student(83523, "Athrav", "Pandharpur", 86.6),
                new Student(83524, "JD", "Kolhapur", 87.7)
        };

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Sort by City (Ascending)");
            System.out.println("2. Sort by Marks (Descending)");
            System.out.println("3. Sort by Name (Ascending)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = Scanner.nextInt();

            switch (choice) {
                case 1:
                    Arrays.sort(students, Comparator.comparing(Student::getCity));
                    break;
                case 2:
                    Arrays.sort(students, Comparator.comparing(Student::getMarks).reversed());
                    break;
                case 3:
                    Arrays.sort(students, Comparator.comparing(Student::getName));
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                    continue;
            }

            System.out.println("\nSorted Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}