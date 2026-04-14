package lab1;


import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        String alfabet = "";

        for (char c = 'a'; c <= 'z'; c++) {
            alfabet = alfabet + c;
        }

        System.out.println(alfabet.toLowerCase());
        System.out.println(alfabet.toUpperCase());

        String[] array = new String[10];
        int index = 0;
        String grup = "";

        for (int i = 0; i < alfabet.length(); i++) {
            char litera = alfabet.charAt(i);

            if (litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u') {
                if (!grup.equals("")) {
                    array[index] = grup;
                    index++;
                }
                grup = "" + litera;
            } else {
                grup = grup + litera;
            }
        }

        if (!grup.equals("")) {
            array[index] = grup;
        }

        for (int i = 0; i <= index; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
