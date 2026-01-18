import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      String name;
        System.out.println(" Enter your name");
        name = scanner.nextLine();

        int length = name.length();
        System.out.println( "Lenght of name "  + length);

        char middleChar;
        if ( length % 2 == 0) {
            middleChar = name.charAt(length / 2 - 1);
        }else {
            middleChar = name.charAt(length / 2);

        }
        System.out.println( );
        );
        }

    }
}