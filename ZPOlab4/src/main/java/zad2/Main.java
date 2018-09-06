package zad2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("asdawdascawd");
        list.add("kmdlaskmdLSJDNLJASNDL");
        list.add("kmdlajSMkwmda");

        replaceUsingIterator(list);
        for(String s: list){
            System.out.println(s);
        }

        list = new ArrayList<>();
        list.add("asdawdascawd");
        list.add("kmdlaskmdLSJDNLJASNDL");
        list.add("kmdlajSMkwmda");
        replaceUsingForLoop(list);

        for(String s: list){
            System.out.println(s);
        }
        list = new ArrayList<>();
        list.add("asdawdascawd");
        list.add("kmdlaskmdLSJDNLJASNDL");
        list.add("kmdlajSMkwmda");

        replaceUsingReplaceAllMethod(list);

        for(String s: list){
            System.out.println(s);
        }
    }

    public static void replaceUsingIterator(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String string = iterator.next();
            iterator.set(string.toUpperCase());
        }
    }
    public static void replaceUsingForLoop(List<String> list){
        for(int i=0; i<list.size(); i++){
            String toReplace = list.get(i);
            list.set(i, toReplace.toUpperCase());
        }
    }
    public static void replaceUsingReplaceAllMethod(List<String> list){
        list.replaceAll(String::toUpperCase);
    }
}
