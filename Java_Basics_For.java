/*
#1 Exercise 

public class For {
    public static void main(String[] args) {
        // Write your code here

        //Write a program that prints out the numbers from 1 to 10 using a for loop.
        for(int i=0;i<10;i++){
        System.out.println(i+1);
        }
    }
}

public class For {
    public static void main(String[] args) {
        // Write your code here

        //Write a program that prints out the numbers from 1 to 10 using a for loop.
        for(int i=0;i<10;i++){
        System.out.println(i+1);
        }
    }
}

*/



// #2 Write a program that prompts the user for a positive integer and then prints out all the even numbers between 1 and that integer (inclusive) using a for loop.

/*

//importing scanner class
import java.util.Scanner;

public class Java_Basics_For {
    public static void main(String[] args) {
        // Write your code here

        //Get a postive integer as user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a positive integer:");
        int number = sc.nextInt();

        System.out.print("The even numbers less than or equal to "+number+" are: ");
        for(int i=1;i<=number;i++){

            int j = i%2;
            if(j!=1 && i<(number-1)){

                System.out.print(i+", ");
            }

            else if(j!=1 && i==(number-1)){

                System.out.print(i);
            }

            else if(j!=1 && i==number){

                System.out.print(i);
            }

        }

        
    }
}

*/

/*

//Write a program that prompts the user for a positive integer and then prints out the sum of all the numbers between 1 and that integer (inclusive) using a for loop.

import java.util.Scanner;

public class Java_Basics_For {
    public static void main(String[] args) {
        // Write your code here

        //Get a postive integer as user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter a positive integer:");
        int number = sc.nextInt();
        int Total = 0;

        System.out.print("The even numbers less than or equal to "+number+" are: ");
        for(int i=1;i<=number;i++){

            Total = Total + i;

        }

        System.out.print(Total);

        
    }
}
*/

/*
//Write a program that prints out the multiplication table for a given number between 1 and 10 using a for loop.

import java.util.Scanner;

public class Java_Basics_For{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a positive integer:");
        int number = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }


    }


}
*/


/*
//Write a program that prompts the user for a positive integer and then prints out a triangle of asterisks with the base equal to that integer, using a for loop.

import java.util.Scanner;

public class Java_Basics_For{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a positive integer:");
        int number = sc.nextInt();

        for (int i=1;i<=number;i++){

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
*/

/*
//Write a program that prompts the user for a positive integer and then prints out all the factors of that integer, using a for loop.
import java.util.Scanner;

public class Java_Basics_For{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a postive integer:");
        int number = sc.nextInt();

        System.out.print("The factors of "+number+" are: ");
        for(int i=1;i<=number;i++){
            int j = number%i;
            if(j==0 && i!=number){
                System.out.print(i+", ");
            }
            else if(j==0 && i==number){
                System.out.print(i);
            }
        }

    }
}
*/

//Write a program that prompts the user for a positive integer and then prints out whether that integer is a prime number or not, using a for loop to check all possible factors.
import java.util.Scanner;

public class Java_Basics_For{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a postive integer:");
        int number = sc.nextInt();

        int NumOfFactors = 0;
        for(int i=1;i<=number;i++){
            int j = number%i;

            if(j==0){
                NumOfFactors++;
            }
        }
        if (NumOfFactors==2){
            System.out.print(number+" is a prime number");
        }
        else{
            System.out.print(number+" is not a prime number");
        }

    }
}