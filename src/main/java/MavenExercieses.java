import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercieses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();

        //check if the user entered a number
        System.out.println("You entered: " + userInput);
        if(StringUtils.isNumeric(userInput)){
            System.out.println("This is a number");
        }else {
            System.out.println("This is not a number");
        }
    }
}