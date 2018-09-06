package zad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.Collator;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        // write your code
        URL url = new URL("http://szgrabowski.kis.p.lodz.pl/zpo17/dane.txt");

        List<String> lista = new ArrayList<>();

        String[] names = {"Łukasz", "Ścibor", "Stefania", "Bolek", "Agnieszka",
                "Zyta", "Órszula"};
        String input;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        while((input = bufferedReader.readLine()) != null){
//            System.out.println(input);
            lista.add(input);
        }
        bufferedReader.close();

        String[] arrayList = new String[lista.size()];
        for(int i=0; i<lista.size(); i++){
            arrayList[i] = lista.get(i);
        }

        for(int j = 0; j<names.length; j++){
            System.out.println(names[j]);
        }

//        Arrays.sort(names, Collator.getInstance(Locale.getDefault()));


//        sortStrings(Collator.getInstance(new Locale("pl", "PL")), names);


//        fastSortStrings(Collator.getInstance(new Locale("pl", "PL")), names);

        fastSortStrings2(Collator.getInstance(new Locale("pl", "PL")), names);
        System.out.println("===========================================");
        for(int j = 0; j<names.length; j++){
            System.out.println(names[j]);
        }

        System.out.println(System.nanoTime());

    }

    public static void sortStrings(Collator collator, String[] words){
        String temp;
        int zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            for(int i=0; i<words.length-1; i++){
                if((collator.compare(words[i],words[i+1])) > 0){
                    temp = words[i+1];
                    words[i+1] = words[i];
                    words[i] = temp;
                    zmiana++;
                }
            }
        }
    }

    public static void fastSortStrings(Collator collator, String[] words){
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return collator.compare(o1, o2);
            }
        });
    }

    public static void fastSortStrings2(Collator collator, String[] words){
        Arrays.sort(words, (o1, o2) -> collator.compare(o1,o2));
    }
}


