package sy3.no6;

import java.util.Arrays;

public class MulitQuestion2  extends Question{
    String [] answer;

    public MulitQuestion2(String[] answer,String title,String[] options) {
        this.answer = answer;
        this.setOptions(options);
        this.setTitle(title);
    }



    @Override
    protected boolean check(String[] answers) {
        Arrays.sort(answers);
        return  Arrays.equals(answers,answer);
    }
}
