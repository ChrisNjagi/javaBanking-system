import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pin = 1234;
        int enterpin;

        boolean islogIn = false;    
        double balance = 1000.00;
        int attempts = 0;

       
        do{
            System.out.print("Enter your pin: ");
            enterpin = input.nextInt();
            attempts++;

            if(enterpin == pin){
                System.out.println("==========Welcome==========");
                islogIn = true;
                break;
            }
            else if(attempts <= 2){
                System.out.println("Wrong pin");
                break;
            }
            else{
                System.out.println("Too many attempts. Your account is locked.");
            }
          }while(attempts < 3);

//menu
if(islogIn){
    int option;
    do{
        System.out.println("1.Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");

        System.out.print("Choose an option: ");
        option = input.nextInt();


        switch(option){
            case 1:
                System.out.println("Your balance is: " + balance);
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = input.nextInt();
                if(depositAmount <= 0){
                    System.out.println("Invalid amount. Please enter a positive number.");
                }
                else{
                balance += depositAmount;
                System.out.println("You have successfully deposited " + depositAmount + ". New balance: " + balance);
                }
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = input.nextInt();
                if(withdrawAmount > balance){
                    System.out.println("Insufficient Amount.Please try a lower amount.");
                }
                else{
                    balance -= withdrawAmount;
                    System.out.println("You have successfully withdrawn " + withdrawAmount + ". New balance: " + balance);
                }
                break;
            case 4:
                System.out.println("Thank you for using our ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }


    }while(option !=4);
}


    }
}
