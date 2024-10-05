
package controller;

import java.util.ArrayList;
import models.Student;
import java.util.Scanner;

public class studentManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> listSt = new ArrayList<>();;
        String types;
        do {
            System.out.println("Nhap lua chon ban muon:\n 1: Them hoc sinh\n 2:Xoa hoc sinh\n 3: Sua hoc sinh\n 4: Tim theo ten\n 5: Thoat\n");
            types = sc.nextLine();
            switch (types) {
                case "1":
                    System.out.println("Nhap thong tin hoc sinh: ");
                    String name = sc.nextLine();
                    int age = sc.nextInt();
                    sc.nextLine();
                    String major = sc.nextLine();
                    Student newStudent = new Student(name, age, major);
                    listSt.add(newStudent);
                    System.out.println("Ok");
                    break;
                case "2":
                    System.out.println("Nhap ten hoc sinh muon xoa:");
                    String dname = sc.nextLine();
                    for (Student student : listSt) {
                        if (student.getName().equals(dname)) {
                            listSt.remove(student);
                            System.out.println("Ok");
                            break;
                        }
                    }
                    break;
                case "3":
                    System.out.println("Nhap ten hoc sinh can sua thong tin");
                    String cname = sc.nextLine();
                    for (Student student : listSt) {
                        if (student.getName().equals(cname)) {
                            System.out.println("Nhap thong tin can chinh");
                            System.out.println("name: ");
                            String newname = sc.nextLine();
                            student.setName(newname);
                            System.out.println("age: ");
                            int newage = sc.nextInt();
                            sc.nextLine();
                            student.setAge(newage);
                            System.out.println("major: ");
                            String newmajor = sc.nextLine();
                            student.setMajor(newmajor);
                            System.out.println("Ok");
                            break;
                        }
                    }
                    break;
                case "4":
                    System.out.println("Nhap ten hoc sinh: ");
                    String sname = sc.nextLine();
                    for (Student student : listSt) {
                        if (student.getName().equals(sname)) {
                            System.out.println("id: " + student.getId() + " name: " + student.getName() + " age: " + student.getAge() + " major: " + student.getMajor());
                            break;
                        }
                    }
                    break;
                case "5":
                    System.out.println("end program");
                    break;

                default:
                    System.out.println("Nhap sai lua chon, hay nhap lai!");
                    break;
            }

        } while (!types.equals("5"));
    }
}
