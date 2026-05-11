package lab9;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    interface IsZero{
        Boolean test (int n);
    }
    interface concat{
        String test2 (String a, String b);
    }
    public static void main(String[] args) {
        IsZero verificare = (n) ->n==0;
        concat Verificare2 = (a, b)->a+" "+b;

        System.out.println(verificare.test(0));
        System.out.println(Verificare2.test2("Java","Lambda"));

        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("C++");
        lista.add("Python");

        lista.forEach(l-> System.out.println("Limbajele sunt: "+l));
    }
}
