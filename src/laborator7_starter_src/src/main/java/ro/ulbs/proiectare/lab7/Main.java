package laborator7_starter_src.src.main.java.ro.ulbs.proiectare.lab7;

import laborator7_starter_src.src.main.java.ro.ulbs.proiectare.lab7.forms.*;
import laborator7_starter_src.src.main.java.ro.ulbs.proiectare.lab7.util.*;

public class Main {
    public static void main(String[] args) {

        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");

        System.out.println("Area = " + tri.getArea() + " details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        System.out.println("Total instance count is " + Form.getInstanceCount());

        PasswordMaker pm2 = PasswordMaker.getInstance();
        System.out.println("\n7.6.2 a+b) Generated passwords: ");
        System.out.println("1:" + PasswordMaker.getInstance().getPassword());
        System.out.println("2:" + pm2.getPassword());

        System.out.println("\n7.6.2 c) Number of time getInstance() has been called: " + PasswordMaker.getCallingCounts());
    }
}