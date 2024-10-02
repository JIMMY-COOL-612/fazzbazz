import java.util.Scanner;

public class DayThree {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     /* 
    System.out.println("what is your favorite number"); 
    int numone = scan.nextInt();
    System.out.println("what is your favorite number"); 
    int numTwo = scan.nextInt();
    System.out.println("what is your favorite number"); 
    int numThree = scan.nextInt(); 
    
    int numFour = numone * (numTwo+numThree);

    System.out.println("numFour = " + numFour);
    */
    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("how old are you?");
    int age = scan.nextInt();

    System.out.print("Hello," +name + ", ");
    if(age>=17){
        System.out.print("you can watch NC-17 and R-rated movies");
    }
    else if(age >= 13){
        System.out.print("you can watch PG-13 movies");
     }
     else{
        System.out.print("you can watch Pgng if you are less they 13");
     }
    }
}
