package HackerRankSolutions.JavaReflectionAttributes;

import java.lang.reflect.*;
import java.util.*;

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void ahqym() {}
    public void amftc() {}
    public void anotherfunction() {}
    public void atcks() {}
    public void bwkbd() {}
    public void cfwyc() {}
    public void cmkxa() {}
    public void dnpym() {}
    public void dnqvo() {}
    public void dvvwq() {}
    public void ehjdm() {}
    public void elyed() {}
    public void fmyce() {}
    public void ghtlj() {}
    public void hluvb() {}
    public void isqdf() {}
    public void iwhtf() {}
    public void jmopy() {}
    public void jnskt() {}
    public void kbjlt() {}
    public void kgwku() {}
    public void khuag() {}
    public void levtp() {}
    public void mcgme() {}
    public void migyc() {}
    public void moebl() {}
    public void nixhb() {}
    public void odyqp() {}
    public void ogvdl() {}
    public void ormim() {}
    public void piwro() {}
    public void plaob() {}
    public void pnruo() {}
    public void pqfct() {}
    public void ptrup() {}
    public void pvgyp() {}
    public void qthde() {}
    public void rmjig() {}
    public void sumvl() {}
    public void tkbpp() {}
    public void tntpj() {}
    public void toxdp() {}
    public void twyfa() {}
    public void uccfq() {}
    public void ujxei() {}
    public void vhxoi() {}
    public void viwuu() {}
    public void viyog() {}
    public void whjtj() {}
    public void ytijy() {}
}

class Solution {

    public static void main(String[] args){
        //write your code
        //this was possible using java 7 editor otherwise we had to give the additional methods into the student class
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}