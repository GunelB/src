package Selfwork_task;

import java.util.Scanner;

public class Claas_hall_chat {

        public static final Scanner scanner=new Scanner(System.in);
        public static final String USERNAME="user1";
        public static final String PASSWORD ="password123";

        public static double balance=0;
        public static int wrongAttempt=3;

        public static void main(String[] args) {
            String message="Enter q to quit\n" +
                    "Enter 1 to make deposit\n" +
                    "Enter 2 to take out money";
            while (wrongAttempt>0){
                if(login()){
                    while(true){
                        System.out.println(message);
                        char choice=scanner.next().charAt(0);
                        switch (choice){
                            case 'q':
                                System.out.println("quiting from your account");
                                return;
                            case '1':
                                deposit();
                                break;
                            case '2':
                                withdraw();
                                break;
                            default:
                                System.out.println("Enter correct input");
                                break;
                        }
                    }
                }
            }
        }

        private static void withdraw() {
            System.out.println("Enter the amount you want to take out");
            double amount= scanner.nextDouble();
            if(amount>balance){
                System.out.println("You dont have enough money on your bak account your balance is : " + balance);
            }else {
                balance-=amount;
                System.out.println("Your new balance is : "+ balance);
            }

        }

        private static void deposit() {
            System.out.println("Enter the amount you want to make deposit");
            double amount = scanner.nextDouble();
            balance+=amount;
            System.out.println("Your new balance is : "+ balance);
        }

        private static boolean login() {
            System.out.println("Enter username");
            String username=scanner.nextLine();
            System.out.println("Enter password");
            String password=scanner.nextLine();
            if(password.equals(PASSWORD)&&username.equals(USERNAME)){
                System.out.println("You have succesfully login");
                return  true;
            }
            wrongAttempt-=1;
            System.out.println("Wrons password or username you have "+wrongAttempt+" chances to try");
            if(wrongAttempt<=0){
                System.out.println("You have reached maximum login attempt try again later");
            }
            return false;
        }

}
