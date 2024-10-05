/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import models.coder;

/**
 *
 * @author User
 */
public class cau_truc_du_lieu {
    public static void main(String[] args) {
    ArrayList<coder> alist =new ArrayList<>();
    coder coder1 =new coder("Java","Long",21,"009900");
    coder coder2 =new coder("C","Luat",32,"007700");
    alist.add(coder1);
    alist.add(coder2);
      for (coder c : alist) {
            System.out.println(c);
            System.out.println("-------------");
        }
}
}
