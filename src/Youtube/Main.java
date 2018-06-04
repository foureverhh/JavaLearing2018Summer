package Youtube;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


/*
        //Array review 180604
        //Arrays.equals(f,q)   System.copyarray(f,startPosition,q,starPosition,length) Java.util.Arrays.copyOfRange(f,startPosition,endPosition)
        //Declare of an array
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10,12};
        System.out.println("Array a is:");
        for(int i:a){
            System.out.println(i);
        }
        System.out.println("Array b is:");
        for(int i:b){
            System.out.println(i);
        }
        System.arraycopy(a,1,b,2,2);
        System.out.println("After arraycopy array a is:");
        for(int i:a){
            System.out.println(i);
        }
        System.out.println("After arryacopy array b is:");
        for(int i:b){
            System.out.println(i);
        }

        a[0] = b[1];
        System.out.println(a[0]);

        printArray(a);
        System.out.println(Arrays.equals(a,b));

        int [] c = {};
        c = java.util.Arrays.copyOfRange(a,1,4);
        for(int i:c){
            System.out.println(i);
        }*/

        /*char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(new String(copyTo));*/


        /*//String immutable 180604
        String s = "localhost";

        StringBuilder sb = new StringBuilder();
        sb.append("localhost");

        s.concat("//8080");
        sb.append("//8080");
        s = "//8080";
        System.out.println(s);
        System.out.println(sb.toString());*/
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
    private static void printArray(int[] a){
        System.out.println("Print an array through invoking a method");
        for(int i :a)
            System.out.println(i);
    }
}
