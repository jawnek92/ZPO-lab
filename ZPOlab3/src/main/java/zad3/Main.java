package zad3;

import com.google.common.base.Splitter;
import org.eclipse.jdt.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // write your code here
        String lane = "moasdmawjdnak";
        String laneNull = null;
        ArrayList<String> myList = function(lane, 2);
        for(String s: myList){
            System.out.println(s);
        }
        System.out.println("===================");
        Iterable<String> splitted = Splitter.fixedLength(2).split(lane);
        for(String s : splitted){
            System.out.println(s);
        }
    }


    public static ArrayList<String> function(@NonNull String s, int length) throws IllegalArgumentException{
        if(length <=0 || s==null){
            throw new IllegalArgumentException();
        }
        String myString;
        ArrayList<String> list = new ArrayList<String>();
        int counter = 0;

        while(counter<s.length()){
            if((counter+length)>=s.length()){
                myString = s.substring(counter, s.length());
            }else {
                myString = s.substring(counter, counter + length);
            }
            list.add(myString);
            counter+=length;
        }
        return list;
    }
}

