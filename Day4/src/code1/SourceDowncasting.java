package code1;

public class SourceDowncasting {



public static void main(String[] args) {

// TODO Auto-generated method stub

DowncastingParent p=new DowncastingChild();

p.name="John";

DowncastingChild c=(DowncastingChild)p;

c.age=18;

System.out.println(c.name);

System.out.println(c.age);

c.showMessage();

}



}
