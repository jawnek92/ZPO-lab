package zad4;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1994, Calendar.JUNE,21);
        Student student = new Student("Ewelina", "Wykida", calendar, 168);
        list.add(student);
        calendar = Calendar.getInstance();
        calendar.set(1992, Calendar.OCTOBER,9);
        student = new Student("Philip", "Wojturski", calendar, 182);
        list.add(student);
        calendar = Calendar.getInstance();
        calendar.set(1992, Calendar.APRIL,13);
        student = new Student("Boleslaw", "Gato", calendar, 185);
        list.add(student);
        calendar = Calendar.getInstance();
        calendar.set(1994, Calendar.APRIL,13);
        student = new Student("Genowefa", "Smerfetka", calendar, 173);
        list.add(student);
        calendar = Calendar.getInstance();
        calendar.set(1992, Calendar.JULY, 12);
        student = new Student("Kacper", "Wojtkowski", calendar, 181);
        list.add(student);
        calendar = Calendar.getInstance();
        calendar.set(1992, Calendar.JUNE,5);
        student = new Student("Stefan", "Gragatek", calendar, 178);
        list.add(student);
        calendar = Calendar.getInstance();
        calendar.set(1994, Calendar.JUNE,5);
        student = new Student("Stefan", "Woloszyn", calendar, 170);
        list.add(student);
        calendar = Calendar.getInstance();
        calendar.set(1992, Calendar.JUNE,5);
        student = new Student("Stefan", "Wojciechowski", calendar, 190);
        list.add(student);
        calendar = Calendar.getInstance();
        calendar.set(1992, Calendar.JUNE,5);
        student = new Student("Stefan", "Anotonus", calendar, 178);
        list.add(student);



        Collections.sort(list);
        for(Student s: list){
            System.out.println(s.toString());
        }
    }
}
