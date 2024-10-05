/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Scanner;

public class Student {

    private int id;
    private String name;
    private int age;
    private String major;
    private int count = 1;

    public Student() {
        id = count++;
    }

    public Student(String name, int age, String major) {
        id = count++;
        this.age = age;
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Ten: " + name + "\nTuoi: " + age + "\nChuyen nganh: " + major;
    }

}
