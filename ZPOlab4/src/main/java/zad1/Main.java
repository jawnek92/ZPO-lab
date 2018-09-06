package zad1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("dane.txt"))){
            String line = null;
            while((line =br.readLine())!=null) {
                String[] split = line.split(" ");
                Person person = new Person(split[0], split[1], split[2], Integer.valueOf(split[3]));
                personList.add(person);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

//        for(Person p : personList){
//            System.out.println(p);
//        }

//        System.out.println("===========================");


        int maxResult = sumEarnings(maxEaringsPersons(personList, 2), 2);
        int minResult = sumEarnings(minEaringsPersons(personList,2),2);

        System.out.println("Sum of 2 lowest earnings in PL: "+minResult+
                "\nSum of 2 highest  earnings in PL: "+maxResult);


    }

    public static List<Person> maxEaringsPersons(List<Person> list, int numberOfPeople){
        List<Person> tempList = list;
        List<Person> maxEarningPersons = new ArrayList<>();
        for(int i=0; i<numberOfPeople; i++) {
            Person maxEarningPerson = list.stream()
                    .filter(person -> person.getCountry().equalsIgnoreCase("PL"))
                    .max((p1, p2) -> Integer.valueOf(p1.getEarnings()).compareTo(Integer.valueOf(p2.getEarnings())))
                    .get();
            maxEarningPersons.add(maxEarningPerson);
            list.remove(maxEarningPerson);
        }
        return maxEarningPersons;
    }
    public static int sumEarnings(List<Person> list, int numberOfPeople){
        int sum = 0;
        for(Person p : list){
            sum+=p.getEarnings();
        }
        return sum;
    }
    public static List<Person> minEaringsPersons(List<Person> list, int numberOfPeople) {
        List<Person> tempList = list;
        List<Person> minEarningPersons = new ArrayList<>();
        for (int i = 0; i < numberOfPeople; i++) {
            Person minEarningPerson = list.stream()
                    .filter(person -> person.getCountry().equalsIgnoreCase("PL"))
                    .min((p1, p2) -> Integer.valueOf(p1.getEarnings()).compareTo(Integer.valueOf(p2.getEarnings())))
                    .get();
            minEarningPersons.add(minEarningPerson);
            list.remove(minEarningPerson);
        }
        return minEarningPersons;
    }
}
