import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 /*
  1. Develop a program that takes the weight (in kilograms) and height (in meters)
     as input and calculates the BMI, then prints it.
     • Input: Weight (kg) = 70, Height (m) = 1.75
     • Expected Output: BMI = 22.86
  */
        System.out.println("--BMI calculator--");
        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        double bmi = weight / height / height * 10000;

        System.out.printf("Your BMI is: %.2f%n" , bmi);
        System.out.println("----------------------------------");


/*
2.  Write a program that takes the obtained marks and total marks as input and
    calculates the percentage, then prints it.
    • Input: Obtained Marks = 85, Total Marks = 100
    • Expected Output: Percentage = 85.0%
*/

        System.out.println("--Marks percentage calculator--");
        System.out.println("Enter the total marks: ");
        int totalMarks = scanner.nextInt();

        System.out.println("Enter the obtained marks: ");
        int obtainedMarks = scanner.nextInt();

        System.out.println("Percentage = " + (totalMarks * obtainedMarks / 100 + "%"));
        System.out.println("----------------------------------");

/*
3.  Create a program that takes an amount in one currency and an exchange rate
    as input, then converts and prints the amount in another currency.
    • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
    • Expected Output: Amount in EUR = 85.0
*/

        System.out.println("--Exchanging money from Dollars to Euro--");
        System.out.println("Enter the money amount in USD: ");
        double amount = scanner.nextDouble();

        System.out.println("Enter the exchange rate from USD to EUR: ");
        double exchangeRate = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Amount in EUR = " + (amount * exchangeRate));
        System.out.println("----------------------------------");


/*
4.
    Create a program that takes a string as input, calculates its length, and then
    reverses the string using the StringBuilder class, finally printing both the length and
    reversed string.
    • Input: "Hello, World!"
    • Expected Output: Length of the string: 13 And Reversed string: "!dlroW
    ,olleH"


*/
        System.out.println("--Reversing a string--");
        System.out.println("Enter a string to be reversed: ");
        String string = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.reverse();
        System.out.println("Length of the string: " + string.length() + " And Reversed string: " + sb);
        System.out.println("----------------------------------");

/*
5.  Develop a program that takes a sentence as input and extracts a substring from
    it, then prints the extracted substring.
    • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
    = 10, End Index = 20
    • Expected Output: "brown fox"
 */
        System.out.println("--Collecting a substring--");
        System.out.println("Enter a string to create a substring: ");
        String subString = scanner.nextLine();

        System.out.println("Enter the first index in the substring");
        int firstIndex = scanner.nextInt();

        System.out.println("Enter the last index in the substring");
        int lastIndex = scanner.nextInt();
        scanner.nextLine();
        System.out.println(subString.substring(firstIndex, lastIndex));

/*
6.  Write a program that takes a sentence and a keyword as input, then check if
    the keyword is present in the sentence and prints the result.
    • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
    "jumps"
    • Expected Output: Keyword "jumps" is present in the sentence.
 */

        System.out.println("--checking for a word--");
        System.out.println("Enter a sentence to be validated: ");
        String sentence = scanner.nextLine();

        System.out.println("Enter the keyword to be checked: ");
        String keyWord = scanner.nextLine();
        System.out.println("is " + keyWord + " present in the sentence? " + sentence.contains(keyWord));
        System.out.println("----------------------------------");

/*
7.  Develop a program that takes a sentence and a word to replace as input, then
    replace all occurrences of the word with another word and prints the modified
    sentence.
*/
        System.out.println("Replacing a word in a sentence: ");
        String sentenceReplacment = scanner.nextLine();

        System.out.println("Enter the word to replace: ");
        String replacingWord = scanner.nextLine();

        System.out.println("Enter the new word: ");
        String newWord = scanner.nextLine();

        System.out.println(sentenceReplacment.replace(replacingWord, newWord));
        System.out.println("----------------------------------");
/*
8.  Write a program that takes two strings as input and check if they are equal,
    ignoring the case, then prints whether they are equal or not.
    • Input: String 1 = "Hello", String 2 = "hello"
    • Expected Output: Strings are equal (ignoring case).
*/
        System.out.println("--Equating two strings--");
        System.out.println("Enter first string to be equated: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter second string");
        String string2 = scanner.nextLine();
        System.out.println("Strings are equal? " + (string1.equalsIgnoreCase(string2)));
    }
}