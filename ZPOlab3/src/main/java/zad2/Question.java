package zad2;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private List<String> answers;

    public Question(String question, String[] answers) {
        this.answers = new ArrayList<String>();
        this.question = question;
        for(String s:answers){
            this.answers.add(s);
        }
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
