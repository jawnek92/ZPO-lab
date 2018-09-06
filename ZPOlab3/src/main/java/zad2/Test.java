package zad2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {
    private static List<Question> testQuestions;
    private final int nrOfQuestions;


    public Test(int nrOfQuestions) {
        this.nrOfQuestions = nrOfQuestions;
        testQuestions = new ArrayList<>();
    }

    private List<Question> getDataFromJson(){
        Gson gson = new Gson();
        String jsonString = null;
        List<Question> list = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("PolAngTest.json"))){
            jsonString = br.readLine();
            Type type = new TypeToken<List<Question>>(){}.getType();
            list = gson.fromJson(jsonString, type);
        }catch(IOException e){
            e.printStackTrace();
        }
        return list;
    }

    public void startQuiz(){
        this.testQuestions = getDataFromJson();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Question question = null;
        int counter = 0;
        int score = 0;
        String answer = null;
        int randomInt;
        int reverseIter = 10;
        System.out.println("Test veryficing knowledge of the polish word in english: ");
        while(counter<5){
            randomInt = random.nextInt(reverseIter);
            question = this.testQuestions.get(randomInt);
            System.out.println("Question " + (counter+1) + " : " + question.getQuestion());
            System.out.print("answer is: ");
            answer = scanner.nextLine();
            for(String s: question.getAnswers()) {
                if (s.equalsIgnoreCase(answer)) {
                    score++;
                }
            }
            this.testQuestions.remove(question);
            reverseIter--;
            counter++;
        }
        System.out.println("Your score in quiz is: "+score);
    }


    public static void saveDataToJson(){
        Question question = new Question("programowanie", new String[]{"programming"});
        testQuestions.add(question);
        question = new Question("siatkowka", new String[]{"volleyball"});
        testQuestions.add(question);
        question = new Question("pilka nozna", new String[]{"soccer", "football"});
        testQuestions.add(question);
        question = new Question("kajakowanie", new String[]{"kayaking"});
        testQuestions.add(question);
        question = new Question("krzyczec", new String[]{"shout", "cry", "scream"});
        testQuestions.add(question);
        question = new Question("jazda na nartach", new String[]{"skiing"});
        testQuestions.add(question);
        question = new Question("jazda na desce", new String[]{"snowboarding"});
        testQuestions.add(question);
        question = new Question("skakanie na spadochronie", new String[]{"skydiving"});
        testQuestions.add(question);
        question = new Question("plywanie", new String[]{"swimming"});
        testQuestions.add(question);
        question = new Question("krzyczec", new String[]{"shout", "cry", "scream"});
        testQuestions.add(question);

        Gson gson = new Gson();
        String jsonObject = gson.toJson(testQuestions);

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("PolAngTest.json"))){
            bw.write(jsonObject);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
