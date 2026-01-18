import javax.xml.transform.Source;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int score;
        score = random.nextInt ( 101);
        System.out.println( "The score that was generated is;");

        if (score>= 60) {
            System.out.println("You have passed the exam;");

        }
        else{
            System.out.println( (" you have  failed ");

        }

    }
}