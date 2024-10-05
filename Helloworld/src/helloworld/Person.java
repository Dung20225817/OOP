
package helloworld;

public final class Person {
   String namez; 
   int age;
   float height;
   public Person(String namez, float height, int age)
   {this.namez=namez;
   this.age=age;
   this.height=height;
   this.getinfo();
   }
   public void getinfo(){
   System.out.print("name :"+this.namez+"\n");
   System.out.print("age :"+this.age+"\n");
   System.out.print("height :"+this.height);}
}
