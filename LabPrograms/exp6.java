/*
Create a Java program that models electronic devices (e.g., smartphones, laptops, and 
tablets) using a common interface for power management. The program should allow 
users to interact with the devices and control their power state.
*/
package LabPrograms;
interface PowerManagement{
    public void powerOn();
    public void powerOff();
    public boolean isPowerOn();
}
class Smartphone implements PowerManagement{
    boolean flag = false;
    public void powerOn(){
        flag = true;
        System.out.println("Smartphone is powered on");
    }
    public void powerOff(){
        flag = false;
        System.out.println("Smartphone is powered off");
    }
    public boolean isPowerOn(){
        return flag;
    }
    public void dail(){
        if(flag){
            System.out.println("Making call through phone");
        }
        System.out.println("Smart phone can't make a call");
    }
}
class Laptop implements PowerManagement{
    boolean flag = true;
    public void powerOn(){
        flag = false;
        System.out.println("Laptop are powered on");
    }
    public void powerOff(){
        flag = false;
        System.out.println("Laptop is powered off");
    }
    public boolean isPowerOn(){
        return flag;
    }
    public void dail(){
        if(flag){
            System.out.println("Internet access through laptop");
        }
        System.out.println("Internet can't be access through laptop");
    }
}
class Tablets implements PowerManagement{
    boolean flag;
    public void powerOn(){
        flag = false;
        System.out.println("Tablet is powered on");
    }
    public void powerOff(){
        flag = false;
        System.out.println("Tablet is powered off");
    }
    public boolean isPowerOn(){
        return flag;
    }
    public void photo(){
        if(flag){
            System.out.println("Photo is taken from tablet");
        }
        System.out.println("Photo can't be taken from tablet");
    }
}
public class exp6 {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        Laptop l = new Laptop();
        Tablets t = new Tablets();
        s.powerOn();
        s.powerOff();
        System.out.println(s.isPowerOn());
        s.dail();
        System.out.println("------------------------------------");
        l.powerOn();
        l.powerOff();
        l.dail();
        System.out.println(l.isPowerOn());
        System.out.println("------------------------------------");
        t.powerOn();
        t.powerOff();
        t.photo();
        System.out.println(t.isPowerOn());
        System.out.println("------------------------------------");
    }
}
