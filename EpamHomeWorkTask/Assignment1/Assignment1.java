package Assignment1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment1 {
    public static void main(String[] args) {
        String input = "Peanut butter and jelly caused the elderly lady to think about her past";
        String randomText = "abcasjdfasabcaasfdaabcafasdfabc";
        String findText = "abc";
        String text = "redivider";
        String oldSubstr = "butter";
        String newSubstr = "jelly";
        String inputWithNumbersAndString = "adilzhan2002rymbayev1409";
        String[] input2 = {"they", "ran", "around", "the", "corner", "to", "find", "that", "they", "had", "traveled", "back", "in", "time."};
        char c = 'a';
        int[] indexes = {1, 9};
        evenAndOdd(input);
        countOfNumber(input);
        sentenceWithoutString(inputWithNumbersAndString);
        removingDuplicateCharacters(input);
        frequencyOfOccurrence(input,c);
        lineReversal(input);
        wordReversal(input);
        alphabeticallySorting(input2);
        shortestWord(input);
        totalCountWords(input);
        addSpace(input, indexes);
        isItPalindrome(text);
        distanceBetweenSubstrings(input, "and", "to");
        replacingSubstring(input, oldSubstr, newSubstr);
        numberOfOccurrences(randomText, findText);

    }
    public static void evenAndOdd(String input){
        char[] sentence = input.toCharArray();
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        for(int i = 0; i < sentence.length; i++){
            if(i % 2 == 0){
                even.append(sentence[i]);
            }
            else{
                odd.append(sentence[i]);
            }
        }
        System.out.println("Even: " + even.toString());
        System.out.println("Odd: " + odd.toString());
    }
    public static void countOfNumber(String input){
        char[] sentence = input.toCharArray();
        int count = 0;
        for(int i = 0; i < sentence.length; i++){
            if(Character.isDigit(sentence[i])){
                count++;
            }
        }
        System.out.println("Count of numbers in String: " + count);
    }
    public static void sentenceWithoutString(String inputWithoutString){
        char[] sentence = inputWithoutString.toCharArray();
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < sentence.length; i++){
            if(Character.isDigit(sentence[i])){
                output.append(sentence[i]);
            }
        }
        System.out.println(output);
    }
    public static void removingDuplicateCharacters(String input){
        Set<Character> output = new HashSet<>();
        for(int i = 0; i < input.length(); i++){
            output.add(input.charAt(i));
        }
        for(int i = 0; i < input.length(); i++){
            if(output.contains(input.charAt(i)) ){
                System.out.print(input.charAt(i));
                output.remove(input.charAt(i));
            }
        }
    }
    public static void frequencyOfOccurrence(String input, char c){
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == c){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void lineReversal(String input){
        StringBuilder output = new StringBuilder(input);
        System.out.println(output.reverse());
    }
    public static void wordReversal(String input){
        String[] arrOfInput = input.split(" ");
        for(int i = 0; i < arrOfInput.length; i++){
            StringBuilder output = new StringBuilder(arrOfInput[i]);
            System.out.print(output.reverse() + " ");
        }
    }
    public static void alphabeticallySorting(String[] input2){
        Arrays.sort(input2);
        System.out.println(Arrays.toString(input2));
    }
    public static void shortestWord(String input){
        String[] strArr = input.split(" ");
        String minLen = strArr[0];
        for (String e : strArr) {
            if (e.length() < minLen.length()) {
                minLen = e;
            }
        }
        System.out.println(minLen.length());
    }
    public static void totalCountWords(String input){
        String[] strArr = input.split(" ");
        System.out.println("Total count words " + strArr.length);
    }
    public static void isItPalindrome(String text){
        text = text.toLowerCase();
        int i = 0;
        int a = 0;
        int j = text.length();
        for(int k = 0; k < j/2; k++){
            if(text.charAt(i) != text.charAt(j-1)){
                System.out.println("is not Palindrome");
                a++;
                break;
            }
            i++;
            j--;
        }if(a == 0){
            System.out.println("is Palindrome");
        }
    }
    public static void addSpace(String input, int[] indexes){
        StringBuilder sb = new StringBuilder(input);
        for(int i: indexes){
            sb.insert(i, " ");
        }
        System.out.println(sb.toString());
    }
    public static void distanceBetweenSubstrings(String str, String firstSubstr, String secondSubstr){
        int firstIndex = str.indexOf(firstSubstr);
        int secondIndex = str.indexOf(secondSubstr);
        System.out.println("Distance between " + firstSubstr + " and " + secondSubstr + " : " + (secondIndex-firstIndex));
    }
    public static void replacingSubstring(String input, String oldSubstr, String newSubstr){
        System.out.println(input.replace(oldSubstr, newSubstr));
    }
    public static void numberOfOccurrences(String randomText, String findText){
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            lastIndex = randomText.indexOf(findText, lastIndex);
            if(lastIndex != -1) {
                count++;
                lastIndex += findText.length();
            }
        }
        System.out.println(count);
    }
}











