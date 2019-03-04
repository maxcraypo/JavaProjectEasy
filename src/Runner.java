
import java.util.Scanner;


public class Runner {

    Scanner sc=new Scanner(System.in);


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Quiz a=new Quiz();
        int count=0;
        for(int i =0; i < a.questions.length;i++){
            System.out.println(a.questions[i]);
            a.responses[i] =sc.nextLine();
            a.responses[i]=a.responses[i].toLowerCase();
            a.check(i);
            if(a.responses[i].equals(a.answers[i])) {
                count++;
            }
        }
        System.out.println("your score is " + count +"/10");
        System.out.println(" the correct answers are " + a.toString());


    }
}
