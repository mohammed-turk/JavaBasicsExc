import java.util.Locale;
import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter first age: ");
//        int firstAge = scanner.nextInt();
//        System.out.println("Enter second age: ");
//        int secondAge = scanner.nextInt();
//        if (firstAge >= 15 && secondAge >= 15 )
//            System.out.println("both ages are not children");
//        if (firstAge < 15 && secondAge < 15 )
//            System.out.println("Both ages are children");
//        if (firstAge >= 15 && secondAge < 15)
//            System.out.println("first age is not a child while the second is a child");
//        if (firstAge < 15 && secondAge >= 15)
//            System.out.println("first age is a child while the second is not a child");

//        System.out.println("Enter first number: ");
//        int fnum = scanner.nextInt();
//        System.out.println("Enter second number: ");
//        int snum = scanner.nextInt();
//        System.out.println("Enter third number: ");
//        int tnum = scanner.nextInt();
//
//        if (fnum  > snum){
//            if (fnum > tnum)
//                System.out.println("First number is the largest");
//            else
//                System.out.println("third number is the largest");
//        }
//        else {
//            if (snum > tnum){
//                System.out.println("Second number is the largest");
//            }
//            else {
//                System.out.println("third number is the largest");
//            }
//        }

//        int age,money;
//        boolean acc;
//        System.out.println("Enter your age: ");
//        age = scanner.nextInt();
//        System.out.println("do you have a bank account? (true or false)" );
//        acc =scanner.nextBoolean();
//        System.out.println("Enter the amount of money:");
//        money = scanner.nextInt();
//
//        if (money >= 100000 && acc == true){
//            if (age >= 18){
//                System.out.println("you can take a loan");
//
//            }
//            else
//                System.out.println("you can't take a loan");
//        }
//        else {
//            System.out.println("you can't take a loan");
//
//        }
//        System.out.println("are you student or programmer?");
//        String person = scanner.nextLine();
//        person = person.toLowerCase();
//
//        System.out.println("Enter your level between 1 up to 3? ");
//        int level = scanner.nextInt();
//        if (person.equals("student")){
//            if (level == 1)
//                System.out.println("you are on the fresh level");
//            else if (level == 2)
//                System.out.println("you are on the sophomore level");
//            else{
//                System.out.println("you are ont the senior level");
//            }
//
//        }
//        else if (person.equals("programmer")) {
//            if (level == 1)
//                System.out.println("you are on the junior level");
//            else if (level == 2)
//                System.out.println("you are mid-level");
//            else{
//                System.out.println("you are on the senior level");
//            }
//
//        }
//        else{
//            System.out.println("Enter a valid string ");
//        }

//        System.out.println("Enter the type of meal breakfast, launch, or dinner");
//        String meal = scanner.nextLine();
//
//        switch (meal){
//            case "launch":
//                System.out.println("Launch");
//                break;
//            case "breakfast":
//                System.out.println("Breakfast");
//
//            case "dinner":
//                System.out.println("Dinner");
//
//            default:
//                System.out.println("Enter a valid meal");
//        }
        System.out.println("enter a number");
        int m = scanner.nextInt();
//        if (x%2 == 0)
//            System.out.println("even");
//        else
//            System.out.println("odd");

//        if ( x > 0 && x*2 > 100)
//            System.out.println("large num");
//        else
//            System.out.println("small");
        System.out.println("enter second num");
        int y = scanner.nextInt();

        if ((m + y)% 2 == 0 && (m + y)% 4 ==0 && (m + y) != 4 )
            System.out.println("special sum");
        else if ((m + y)% 2 == 1)
            System.out.println("odd addition");
        else {
            System.out.println("normal sum");
        }







    }
}
