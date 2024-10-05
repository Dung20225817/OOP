
package models;

import java.util.ArrayList;
public class coder extends Person {
 private String Programming_language;
  ArrayList<Person> listStudent;
    public coder() {
    }

    public coder(String Programming_language, String name, int age, String phone) {
        super(name, age, phone);
        this.Programming_language = Programming_language;
    }

    public String getProgramming_language() {
        return Programming_language;
    }

    public void setProgramming_language(String Programming_language) {
        this.Programming_language = Programming_language;
    }
 
     public String toString() {
        return super.toString() + "\nNgon ngu lap trinh: " + Programming_language;
    }
}
