
package controller;


public class String_J2 {
    public static void main(String[] args) {
        // Các phương thức làm việc với string 
       String d="jdsdfj";
       d.length();// trả về đọ dài chuỗi
       d.charAt(0);//trả về ký tự tại vị trí index
      String e= d.substring(0,3);// trả về chuỗi con beginIndex- endIndex
    // Lưu ý :subString sẽ từ beginIndex->endIndex-1,nếu chỉ lấy 1 chỉ số thì nó sẽ là beginIndẽx -> end
      // String f=d+e;
      //StringBuilder
      String f=d.concat(e);
      String thu_hai="so 1";
      d.indexOf(thu_hai);// Tìm vị trí đầu tiên của chuỗi con
      d.lastIndexOf(thu_hai);//tìm vị trí cuối cùng của chuỗi  con
      String name="vuduc";
      String cut ="u";
        System.out.println(name.indexOf(cut));
        System.out.println(name.lastIndexOf(cut));
       d.equals(name);// so sanh hai chuoi
       d.equalsIgnoreCase(thu_hai);// so sanh hai chuoi khong viet hoa
       String a="vuduc";
       String b="Vuduc";
        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));
         d.compareTo(a);//so sanh 2 chuoi theo ma ASCII
         d.trim();//loai toan bo khoang trang
         d.toLowerCase();//su dung de bien chuoi thanh chu thuong
         d.toUpperCase();//su dung de bien chuoi thanh chuw hoa
         d.replace('A', 'b');//thay the ki tu (car old, char new)
         d.startsWith(a);//chuoi co bat dau bang chuoi con khong kieu boolean
         d.endsWith(a);//chuoi co ket thuc bang chuoi con  khong
         //Split:Tach chuoi thanh mang dua tren bieu thuc chinh quy
         String chuoi="Dung,Khai,Huong,Huy";
         String[] mang=chuoi.split(",");// chuoi.split("\\W) chuoi.split("[;,-]")
         
         for(String str : mang)
         {
             System.out.println(str);
         }
         //StringBuilder(hoac StringBuffer):
         //day la cac lop cho phep tao cac chuoi co the thay doi duoc
         // cac chuoi co the thay doi duoc-> chuoi bien thien
         //luu ys voi Concat(+): nos se tao ra nhieu string trong qua trinh ghep
         //trinh tu noi chuoi-> tao ra bay nhieu chuoi nhung co the lay ra khi chua noi het
         //{a,b,c,d}
         //abcd doi voi con cat tao ra 4 string bản sao a1=a a2=ab a3=abc a4=abcd
         // dối với StringBuilder: String sb ="abcd" chuỗi biến thiên
         
    StringBuilder sb =new StringBuilder();
    sb.append(b).append(d);
    String result1 =sb.toString();
        System.out.println(result1);
        d.isEmpty();//kiem tra  xem chuoi co rong hay khong
        String.valueOf(sb);//chuyen doi gia tri bat ki thanh chuoi
     boolean t=   d.contains(sb);//tim xem chuoi co gia tri nay khong
     //tao lớp student có các thuộc tính int id str name int tuổi str chuyên ngành(mảjor)
     //-> id()int phải là duy nhất private static biến tĩnh
     //trong Cóntructor khi khởi tạo id =count++
     //int count
     //Tạo lớp studentMânger bao gồm các student bao gồm nhiều hs
     // tạo menu siwtch case gồm các tác vụ :xem ds hs;thêm hs;xóa hs;sửa hs người dùng sửa thuộc tính không sửa id;tìm theo tên;thoát;
    }
}
