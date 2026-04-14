package lab4;
import java.util.*;

class Tanar{
    private String name;
    private int age;
    private String address;

    public Tanar(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString(){
        return "Nume: " + name + " ,Varsta: " + age + " ,Adresa: " + address;
    }
}
public class AppLab4 {
    public static void main(String[] args) {
        HashMap<String, Integer> varste = new HashMap<>();//implementare a interfetei map bazata pe o tabela hash care accepta doar string pentru chei si integer pentru valori
        varste.put("Ioan", 21);//.put -> metoda de inserare. Calculeaza un cod hash pentru "Ioan" si stocheaza valoarea 21 in bucket
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        Map<String, String> adrese = Map.of("Ioan", "Sibiu", "Maria", "Bucuresti", "Victor",
                "Cluj","Simina", "Alba-Iulia","Marius", "Medias", "Mihai", "Cisnadie","Daniela", "Sibiu");
        //map.of creaza o instanta de tip map care nu suporta operatii de modificare dupa inserare
        System.out.println(varste);
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        System.out.println(varste);

        HashMap<String, Tanar> tineri = new HashMap<>();

        for(String nume : varste.keySet()){//metoda care extrage o colectie de elemente unice care contin toate cheile din map
            Integer varsta = varste.get(nume);
            String adresa = adrese.getOrDefault(nume, "Necunoscuta");
            //incearca extragerea valorii pentru nume; daca rezultatul ar fi null, atunci returneaza automat sirul "Necunoscuta"
            Tanar obiectTanar = new Tanar(nume, varsta, adresa);
            tineri.put(nume, obiectTanar);//maparea numelui catre obiectul complex nou creat in a treia structura de date
        }

        System.out.println(tineri);
    }
}
