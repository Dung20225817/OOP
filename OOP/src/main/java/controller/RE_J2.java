/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author User
 */
public class RE_J2 {
    public static void main(String[] args) {
        //rE
        //dung de tim kiem kiem tra thao tac chuoi van ban
        //java.util.regex
        //Matcher ca Pattern
        //.: bat ki ki tu nao
        //*: 0 hoac nhieu laanf lap
        //+: 1 hoac nhieu lan lap
        //?: 0 hoac 1 lan lap
        //^: bat dau mot regex(bieu thuc chinh quy
        //$: ket thuc 1 RE
        // \d: kí tự số từ 0-9
        // \D khong phải kí tự số
        // \w: kí tự số hoặc chữ
        // \W: không phaỉ kí tự chữ hay số
       // \s: khoang trang
       // \S: khong phai khoảng trắng
       //[...]: bất kì kí tự nào trong ngoặc vuông
       // [^...]: không phải kí tự nào trong ngoặc vuông
       // (): nhóm các kí tự ép nó phải có các kí tự như vậy
       // :
       // \\d :phải viết 2 lần \\
       String chuan_email="^[A-Za-z0-9.+_]+@[A-Za-z0-9.-]+$";
       //^ mở đầu RE
       //A-Za-z0-9.+_: cho người dùng dùng các kí tự này
       //+ thứ 2: 1 hoặc nhiều lần lặp dung2109@gmaill.com
       //$ mang nghĩa là kết thúc
       // nếu muốn dùng các kí tự lạ ngoài ngoặc thì phải thêm \\ trừ @;
       String vn_email ="^[A-Za-z0-9-.+_]+@(gmail.com)$";
       String emailRE ="dung2109@gmail.com";
       // tạo đối tượng chính quy
       Pattern pt = Pattern.compile(emailRE);
       // khớp biểu thức chính quy với chuỗi email đầu vào
       Matcher mt = pt.matcher(emailRE);
       if(mt.matches()){
           System.out.println("email hợp lệ");
    }else{
           System.out.println("email không hợp lệ");
    }
    
    }
}
