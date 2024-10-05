package BTVN;
import java.util.Scanner;
public class BTVN2NC {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap so b: ");
        int b = scanner.nextInt();
        int c= a>b && a%2==0 ? a+b :a-b;
        System.out.print("Ket qua la: ");
        System.out.println(c);
    }
}
