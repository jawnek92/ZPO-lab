package zad4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<Long>();
        List<Long> list2 = new LinkedList<Long>();


        list.add(Long.valueOf(123));
        list.add(Long.valueOf(321));
        list.add(Long.valueOf(532));
        list.add(Long.valueOf(678));

        for(Long l: list){
            System.out.print(l+"\t");
        }

        System.out.println("\n");
        try{
            CustomSwap.swap(list, 1,3);
        }catch(NoneFreeAccessException e){
            e.printStackTrace();
        }

        for(Long l: list){
            System.out.print(l+"\t");
        }
        System.out.println("\n");System.out.println("\n");

        list2.add(Long.valueOf(123));
        list2.add(Long.valueOf(321));
        list2.add(Long.valueOf(532));
        list2.add(Long.valueOf(678));

        for(Long l: list2){
            System.out.print(l+"\t");
        }
        try{
            CustomSwap.swap(list2, 1,3);
        }catch(NoneFreeAccessException e){
            e.printStackTrace();
        }
        System.out.println("\n");
        for(Long l: list2){
            System.out.print(l+"\t");
        }
    }
}
