// 1. Write a program in java that takes a String as input parameter and checks the String's validity on the following criteria:
//- String should only contain alphabets (Caps and Small). No numbers, no special characters etc are allowed.
//- String should not contain only white spaces
//NOTE: Use java Regex

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid string: ");
        String myStr = sc.nextLine();

        int status = 0;
        int count = 0;
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            // regex for capital and small alphabets
            if (Pattern.matches("[a-zA-z]", String.valueOf(c))) {
            }
            // regex for white space
            else if(Pattern.matches("[\\s]", "" + c)){
                count++;
            }
            else {
                status = -1;
                break;
            }
        }
        if (count == myStr.length()) {
            System.out.println("invalid");
        }
        else if (status == -1) {
            System.out.println("invalid");
        } else {
            System.out.println("valid");
        }
    }
}