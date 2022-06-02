package atmproject;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int right=3,balance=1400,select=0,price;
        String username,password;
        Scanner input=new Scanner(System.in);
        while(right>0){

            System.out.println("Username: ");
            username= input.next();

            System.out.println("Password: ");
            password= input.next();


            if (username.equals("furkan")&&password.equals("sahan")) {
                System.out.println("Welcome to the my bank habibi");


                do {
                    System.out.println("1-Deposite\n" +
                            "2-Withdraw Money\n" +
                            "3-Balance Inquiry \n" +
                            "4-Logout");
                    System.out.print("Choose : ");
                    select= input.nextInt();
                    switch (select){
                        case 1 : System.out.println("How much you want to deposite?");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2 :
                            System.out.println("How much you want to withdraw?");
                            price = input.nextInt();

                            if (price > balance) {
                                System.out.println("insufficient balance");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3 :
                            System.out.println("Balance Inquiry  : " + balance);
                            break;
                    }

                }while(select!=4);
                System.out.println("See you later");
                break;

            }else {
                right--;
                System.out.println("Wrong password or username");
                System.out.println("right: "+right);
                if (right==0)
                    System.out.println("Just go");

            }

        }
    }
}







