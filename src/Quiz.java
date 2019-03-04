import java.util.Arrays;

public class Quiz {
    public String[] answers = new String[10];
    public String[] questions = new String[10];
    public String[] responses = new String[10];

    public Quiz() {
        makeQuestions();
        makeAnswers();

    }

    public void makeQuestions() {
        questions[0] = "what was the name of the zebra in the movie madagascar?";
        questions[1] = "what battle is considered the turning point of the eastern front in WW2";
        questions[2] = " how tall is Mr Albinson?";
        questions[3] = "assistant to the regional manager at dunder mifflen-scranton ";
        questions[4] = "who made sicko mode?";
        questions[5] = " what year is it in the Jewish calender?";
        questions[6] = "hit or miss...? ";
        questions[7] = "last monarch of russia before the 1917 revolution?";
        questions[8] = "what is the biggest state";
        questions[9] = " what country was the 2018 world cup winner";


    }

    public void makeAnswers() {
        answers[0] = "marty";
        answers[1] = "stalingrad";
        answers[2] = "5'5";
        answers[3] = "dwight";
        answers[4] = "travis scott";
        answers[5] = "5779";
        answers[6] = "i guess they never miss huh";
        answers[7] = "tzar nicholas";
        answers[8] = "alaska";
        answers[9] = "france";
    }

    public void check(int x) {
        int count = 0;
        for (int i = 0; i < questions.length; i++) {

            if (answers[x].equals(responses[x])) {
                System.out.println("correct");
                count++;
            } else {
                System.out.println("wrong");

            }
            break;

        }
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "answers=" + Arrays.toString(answers) +
                '}';
    }
}







