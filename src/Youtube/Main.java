package Youtube;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean getANumber = true;
        while (getANumber){
        try {
            System.out.println("Enter some number:");
            //Two ways to parse from scanner
            int userInput = Integer.parseInt(scanner.next()); //int userInput = scanner.nextInt();
            getANumber =false;

            System.out.println("User entered: "+String.valueOf(userInput));
        }catch (Exception e){
            System.out.println("Input a number,please!"+"\n"+"Problem is: ");
            e.printStackTrace();
        }
        }
    }
}
