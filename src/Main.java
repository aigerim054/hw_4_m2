import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listc = new ArrayList<>();
        ArrayList<String> listb = new ArrayList<>();
        System.out.println("введите 5 элементов в лист а");
        for (int i = 0; i < 5; i++) {
            String element = scanner.next();
            lista.add(element);


        }
        System.out.println("введите 5 элементов в лист b");
        for (int i = 0; i < 5; i++) {
            String element = scanner.next();
            listb.add(element);


        }
        listc.addAll(lista);
        listc.add(1,listb.get(4));
        listc.add(3,listb.get(3));
        listc.add(5,listb.get(2));
        listc.add(7,listb.get(1));
        listc.add(9,listb.get(0));

        System.out.println(listc);
        Collections.sort(listc, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(listc);
    }
}