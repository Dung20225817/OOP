package BTVN;
import java.util.Scanner;
public class BTVN3 {
    // ham cong
    public static void cong(int a, int b){
        System.out.print("ket qua la: ");
        System.out.println(a+b);
    }
    // ham tru
    public static void tru(int a, int b){
        System.out.print("ket qua la: ");
        System.out.println(a-b);
    }
    // ham nhan
    public static void nhan(int a, int b){
        System.out.print("ket qua la: ");
        System.out.println(a*b);
    }
    // ham chia
    public static void chia(int a, int b){
        if (b != 0){
            double chia = (double)a/b;
            System.out.print("ket qua la: ");
            System.out.println(chia);
        }
        else
        {
            System.out.println("ERROL");
        }
    }
    // ham thoat
    public static void exit(){
         System.exit(0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = sc.nextInt();
        System.out.println("Nhap so b:");
        int b = sc.nextInt();
        while(true){
        System.out.println("1.cong");
        System.out.println("2.tru");
        System.out.println("3.nhan");
        System.out.println("4.chia");
        System.out.println("5.exit");
        System.out.println("Hay chon 1 so tu 1 den 5: ");
        int choice = sc.nextInt();
            switch(choice){
                case 1:
                    cong(a,b);
                    break;
                case 2:
                    tru(a,b);
                    break;
                case 3:
                    nhan(a,b);
                    break;
                case 4:
                    chia(a,b);
                    break;
                case 5:
                    exit();
            }
        }
    }
}
