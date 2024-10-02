import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balnce = 1234.00;

        System.out.println("The ATM!");

    while (true) {

    System.out.println("Balnce: $" + balnce);
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. Exit");  
    System.out.println("Choose an option");

    int choice = scanner.nextInt();

    if (choice == 1 || choice == 2){
        System.out.print("Enter amount: $");
        double amoumt = scanner.nextDouble();
        
        if(choice == 1 && amoumt > balnce){
            System.out.println("Insufficient funds!");

        } else {
            balnce += (choice == 1) ? -amoumt : amoumt;
            System.out.println("Insuction funds!");
        }
    
    } 

        else if (choice == 3){
            System.out.println("Thank you for using our ATM. Goodbye!");
            break;
        } 
        else{
            System.out.println("Invalid option. Try again.");
            
        }
    }
    scanner.close();
}
}
