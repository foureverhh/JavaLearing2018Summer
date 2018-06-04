package Youtube;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //String immutable 180604
        String s = "localhost";

        StringBuilder sb = new StringBuilder();
        sb.append("localhost");

        s.concat("//8080");
        sb.append("//8080");
        s = "//8080";
        System.out.println(s);
        System.out.println(sb.toString());
        /*
        //String builder learning 180601
        String info = "";
        info += "My name is Li";
        info += " ";
        info += "I am learning Java";

        System.out.println(info);

        StringBuilder sb = new StringBuilder();
        sb.append("My name is Li").append(" ");
        sb.append("I am learning java");
        System.out.println(sb.toString());
        sb.insert(3,"real ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //test /t /n
        System.out.println("Here is a test of \'\t'"+"Here is a test of '\'\n'"+"\n new line" );
        //%d
        System.out.printf("Total cost is %-10d; and quantity is %10d\n", 5,120);

        for(int i = 0; i < 20; i++){
            System.out.printf("%2d: %s\n",i,"use %s to write text");
            System.out.printf("%-2d: some text here\n",i);
        }
        System.out.printf("Total value is %5.2f",5.676);
        System.out.println();
        System.out.printf("Total value is %-5.2f",5.676);*/

        /* 180601
        //Practise String methods 180531
        String s = "word";
        String s1 = "wordierword";
        System.out.println(s.toUpperCase());
        char[] stringToChar = s.toCharArray();
        for(int i=0;i<stringToChar.length;i++){
            if(stringToChar[i]=='r')
                stringToChar[i] = 'R';
        }
        //Convert a char array to a string
        String s2 = new String(stringToChar);
        System.out.println(s2);
        if(s1.startsWith("word") && s1.endsWith("word")){
            System.out.println("s1 starts with word");
        }
        if(s.equalsIgnoreCase(s1)){
            System.out.println("s has same letters as s1");
        }

        System.out.println("Show each letter in s:");
        for(int i=0;i<s.length();i++){
        char textCharAt = s.charAt(i);
        System.out.println("The letter in "+(i+1)+" is "+textCharAt);
        }

        //.concat() concatenate connect two string
        String s3 = s.concat(s1);
        System.out.println(s3);

        //text indexOf series
        String s4 = "abcdabcdabcd";
        int index = s4.indexOf("c",3); //3 is offset which means to check "c" position after the first d,and get index of 6
        System.out.println("Index is "+String.valueOf(index));
        int lastIndex = s4.lastIndexOf("d",6);
        System.out.println("Last index is "+String.valueOf(lastIndex));
        //Compare two letters in alphabet
        char char1 = s4.charAt(3);
        char char2 = s4.charAt(0);
        String char1ToString = Character.toString(char1);
        String char2ToString = Character.toString(char2);
        int comparison = char1ToString.compareTo(char2ToString);
        System.out.println(String.valueOf(comparison));
        //Replace
        String replacedS1 = s1.replace('w','m');
        System.out.println(s1 +" "+ replacedS1);


        //homework 2.3 180601
        System.out.println("Write your sentence below:");
        Scanner scanner180601 = new Scanner(System.in);
        String originInput = scanner180601.nextLine();
        String trimmedInput = originInput.trim();
        System.out.println(trimmedInput);
        int firstSpace = trimmedInput.indexOf(' ');
        System.out.println(firstSpace);
        int lastSpace = trimmedInput.lastIndexOf(' ');
        System.out.println(lastSpace);
        String firstWord = trimmedInput.substring(0,firstSpace);
        String finalWord = trimmedInput.substring(lastSpace);
        int allNumber = originInput.length();
        System.out.print("Here are totally "+String.valueOf(allNumber)+" symbols"+"\n"+
                         "The first word is "+firstWord+"\n"+
                         "The final word is "+finalWord);
        */

        /*
        //Practise Scanner 180531
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
        }*/
    }
}
