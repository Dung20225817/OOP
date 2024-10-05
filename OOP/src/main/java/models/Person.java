/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Scanner;
public class Person {
    private String name;
    private int age;
    private String phone;

    public Person() {
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<18){
            
            System.out.println("Phai nhap tren 18 tuoi");  
        }else{
            this.age=age;
        }
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
     public String toString() {
        return "Ten: " + name + "\nTuoi: " + age + "\nSo đien thoai: " + phone;
    }
}

