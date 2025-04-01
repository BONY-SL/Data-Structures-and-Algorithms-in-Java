package string;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        System.out.print("Enter Word : ");
        String word = new Scanner(System.in).nextLine();

        // A = 65
        // a = 97
        if(StringPalindrome.isPalindrome(word)){
            System.out.println(word+ " is Palindrome...");
        }else{
            System.out.println(word+ " is not Palindrome...");
        }
    }

    public static boolean isPalindrome(String word){

        String lowerCaseString = word.toLowerCase();

        char [] charArray = lowerCaseString.toCharArray();

        int start = 0;
        int end = word.length() - 1;

        while (start < end){

            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }

//        while(start < end){
//
//            int startIndexChar = charArray[start];
//            int endIndexChar =  charArray[end];
//
//            if(startIndexChar != endIndexChar){
//
//                if(startIndexChar > endIndexChar){
//                    int a = startIndexChar-endIndexChar;
//                    if(a != 32)
//                        return false;
//                }else {
//                    int b = endIndexChar-startIndexChar;
//                    if(b != 32)
//                        return false;
//                }
//            }
//            start++;
//            end--;
//        }
        return true;
    }
}
