/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import jakarta.servlet.jsp.tagext.TryCatchFinally;
import java.util.ArrayList;
import java.util.Scanner;
import models.Person;
import models.coder;

public class OOP {
    public static void main(String[] args) {
        coder coder1=new coder();
        coder coder2=new coder();
        Scanner sc=new Scanner(System.in);
        System.out.println("yeu cau nguoi dung nhap ten: ");
        String name=sc.nextLine();
        coder1.setName(name);
        System.out.println("yeu cau nhap tuoi: ");
        int age;
        do{
        age=sc.nextInt();
        coder1.setAge(age);
        }while(age<18);
        sc.nextLine();
        System.out.println("yeu cau nhap so dien thoai : ");
        String phone =sc.nextLine();
        coder1.setPhone(phone);
        System.out.println("yeu cau nhap ngon ngu : ");
        String lan =sc.nextLine();
        coder1.setProgramming_language(lan);
        System.out.println("ten: "+coder1.getName()+
                "\n tuoi "+coder1.getAge()+
                "\n"+"phone: "+coder1.getPhone()+
                "\n"+"lan: "+coder1.getProgramming_language());
       
     
      
    }
    
}
