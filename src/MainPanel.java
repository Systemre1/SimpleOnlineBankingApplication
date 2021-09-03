import java.util.Scanner;
public class MainPanel {
    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        Scanner input=new Scanner(System.in);
        int select=0;
        do {
            System.out.println("********** WELCOME TO ONLİNE BANKİNG **********");
            System.out.println("1-Signup");
            System.out.println("0-Exit");
            System.out.print("Choose: ");
            select=input.nextInt();
            if (select==1) {
                User u1=new User();
                System.out.println("\n****************** SINGUP (Do not press the space while writing!) ******************");
                System.out.print("Please enter your name: ");
                u1.setName(input.next());
                System.out.print("Please enter your surname: ");
                u1.setSurname(input.next());
                System.out.print("Please enter customer number: ");
                u1.setCustomerNumber(input.nextLong());
                System.out.print("Please enter your e-mail: ");
                u1.setMail(input.next());
                System.out.print("Please enter your password: ");
                u1.setPassword(input.next());
                System.out.print("Please enter your telephone number: ");
                u1.setTelephoneNumber(input.nextLong());
                System.out.print("Please enter your bank accounts: ");
                u1.setBankAccounts(new long[]{input.nextLong()});

                System.out.println("**** Login ****");
                System.out.print("E-mail: ");
                String mailEnter=input.next();
                for (;;) {
                    if (!(u1.getMail().equals(mailEnter))) {
                        System.out.println("There is no such e-mail. Try again.");
                        System.out.println("E-mail: ");
                        mailEnter=input.next();
                    }
                    else {
                        break;
                    }
                }
                System.out.print("Password: ");
                String passwordEnter=input.next();
                for (;;) {
                    if (!(u1.getPassword().equals(passwordEnter))) {
                        System.out.println("There is no such password. Try again.");
                        System.out.println("Password: ");
                        passwordEnter=input.next();
                    }
                    else {
                        System.out.println("\t\t*** Welcome "+u1.getName()+" "+u1.getSurname()+" ***");
                        break;
                    }
                }
                addAccount();
                addCreditCard();
                System.out.println("*************************************\n****Thank you for using our bank!****\n*************************************");
                break;


            }else{
                System.out.println("*************************************\n****Thank you for using our bank!****\n*************************************");
            }




        }while (select!=0);

    }

    private static void addAccount(){
        Scanner input=new Scanner(System.in);
        for(;;) {
            System.out.print("Choose numbers from 1 to 5! How many accounts would you like to create? (You can create a maximum of 5) : ");
            int userInput = input.nextInt();
            if (userInput == 1) {
                Account a1 = new Account();
                System.out.print("How much will you deposit into your first account: ");
                a1.setBalance(input.nextInt());
                System.out.println("First account was created. \nYour balance: "+a1.getBalance()+"  Minimum Balance Limit: "+a1.getMinimumBalanceLimit()
                        +"  Account number: "+a1.getAccountNumber()+"  Iban number: "+a1.getIbanNumber());
                System.out.println("***********************\nYou cannot eft with a single account.\n***********************");
                break;
            } else if (userInput == 2) {
                Account a1 = new Account();
                System.out.print("How much will you deposit into your first account: ");
                a1.setBalance(input.nextInt());
                System.out.println("First account was created. \nYour balance: "+a1.getBalance()+"  Minimum Balance Limit: "+a1.getMinimumBalanceLimit()
                        +"  Account number: "+a1.getAccountNumber()+"  Iban number: "+a1.getIbanNumber());
                Account a2 = new Account();
                System.out.print("How much will you deposit into your second account: ");
                a2.setBalance(input.nextInt());
                System.out.println("Second account was created. \nYour balance: "+a2.getBalance()+"  Minimum Balance Limit: "+a2.getMinimumBalanceLimit()
                        +"  Account number: "+a2.getAccountNumber()+"  Iban number: "+a2.getIbanNumber());
                for(;;) {
                    System.out.print("If you want to do eft, select the account you want to use 1-2, if you do not,press 0 twice : ");
                    int eftSelect = input.nextInt();
                    System.out.print("Please select an account other than the currently used account. Which account do you want to Eft: ");
                    int eftTo = input.nextInt();
                    if (eftSelect == 0){
                        break;
                    }
                    else if (eftSelect==1){
                        if (eftTo==2){
                            a1.doEft(a2);
                            break;
                        } else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }
                    else if (eftSelect==2){
                        if (eftTo==1){
                            a2.doEft(a1);
                            break;
                        }
                        else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else{
                        System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                    }
                }
                break;
            } else if (userInput == 3) {
                Account a1 = new Account();
                System.out.print("How much will you deposit into your first account: ");
                a1.setBalance(input.nextInt());
                System.out.println("First account was created. \nYour balance: "+a1.getBalance()+"  Minimum Balance Limit: "+a1.getMinimumBalanceLimit()
                        +"  Account number: "+a1.getAccountNumber()+"  Iban number: "+a1.getIbanNumber());
                Account a2 = new Account();
                System.out.print("How much will you deposit into your second account: ");
                a2.setBalance(input.nextInt());
                System.out.println("Second account was created. \nYour balance: "+a2.getBalance()+"  Minimum Balance Limit: "+a2.getMinimumBalanceLimit()
                        +"  Account number: "+a2.getAccountNumber()+"  Iban number: "+a2.getIbanNumber());
                Account a3 = new Account();
                System.out.print("How much will you deposit into your third account: ");
                a3.setBalance(input.nextInt());
                System.out.println("Third account was created. \nYour balance: "+a3.getBalance()+"  Minimum Balance Limit: "+a3.getMinimumBalanceLimit()
                        +"  Account number: "+a3.getAccountNumber()+"  Iban number: "+a3.getIbanNumber());
                for(;;) {
                    System.out.print("If you want to do eft, select the account you want to use 1-3, if you do not, press 0 twice : ");
                    int eftSelect = input.nextInt();
                    System.out.print("Please select an account other than the currently used account. Which account do you want to Eft: ");
                    int eftTo = input.nextInt();
                    if (eftSelect == 0){
                        break;
                    }
                    else if (eftSelect==1){
                        if (eftTo==2){
                            a1.doEft(a2);
                            break;
                        } else if (eftTo==3){
                            a1.doEft(a3);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }
                    else if (eftSelect==2){
                        if (eftTo==1){
                            a2.doEft(a1);
                            break;
                        }else if (eftTo==3){
                            a2.doEft(a3);
                            break;
                        }
                        else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else if (eftSelect==3){
                        if (eftTo==1){
                            a3.doEft(a1);
                            break;
                        }else if (eftTo==2){
                            a3.doEft(a2);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else{
                        System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                    }
                }
                break;
            } else if (userInput == 4) {
                Account a1 = new Account();
                System.out.print("How much will you deposit into your first account: ");
                a1.setBalance(input.nextInt());
                System.out.println("First account was created. \nYour balance: "+a1.getBalance()+"  Minimum Balance Limit: "+a1.getMinimumBalanceLimit()
                        +"  Account number: "+a1.getAccountNumber()+"  Iban number: "+a1.getIbanNumber());
                Account a2 = new Account();
                System.out.print("How much will you deposit into your second account: ");
                a2.setBalance(input.nextInt());
                System.out.println("Second account was created. \nYour balance: "+a2.getBalance()+"  Minimum Balance Limit: "+a2.getMinimumBalanceLimit()
                        +"  Account number: "+a2.getAccountNumber()+"  Iban number: "+a2.getIbanNumber());
                Account a3 = new Account();
                System.out.print("How much will you deposit into your third account: ");
                a3.setBalance(input.nextInt());
                System.out.println("Third account was created. \nYour balance: "+a3.getBalance()+"  Minimum Balance Limit: "+a3.getMinimumBalanceLimit()
                        +"  Account number: "+a3.getAccountNumber()+"  Iban number: "+a3.getIbanNumber());
                Account a4 = new Account();
                System.out.print("How much will you deposit into your fourth account: ");
                a4.setBalance(input.nextInt());
                System.out.println("Fourth account was created. \nYour balance: "+a4.getBalance()+"  Minimum Balance Limit: "+a4.getMinimumBalanceLimit()
                        +"  Account number: "+a4.getAccountNumber()+"  Iban number: "+a4.getIbanNumber());
                for(;;) {
                    System.out.print("If you want to do eft, select the account you want to use 1-4, if you do not, press 0 twice : ");
                    int eftSelect = input.nextInt();
                    System.out.print("Please select an account other than the currently used account. Which account do you want to Eft: ");
                    int eftTo = input.nextInt();
                    if (eftSelect == 0){
                        break;
                    }
                    else if (eftSelect==1){
                        if (eftTo==2){
                            a1.doEft(a2);
                            break;
                        } else if (eftTo==3){
                            a1.doEft(a3);
                            break;
                        }else if (eftTo==4){
                            a1.doEft(a4);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }
                    else if (eftSelect==2){
                        if (eftTo==1){
                            a2.doEft(a1);
                            break;
                        }else if (eftTo==3){
                            a2.doEft(a3);
                            break;
                        }else if (eftTo==4){
                            a2.doEft(a4);
                            break;
                        }
                        else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else if (eftSelect==3){
                        if (eftTo==1){
                            a3.doEft(a1);
                            break;
                        }else if (eftTo==2){
                            a3.doEft(a2);
                            break;
                        }else if (eftTo==4){
                            a3.doEft(a4);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else if (eftSelect==4){
                        if (eftTo==1){
                            a4.doEft(a1);
                            break;
                        }else if (eftTo==2){
                            a4.doEft(a2);
                            break;
                        }else if (eftTo==3){
                            a4.doEft(a3);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else{
                        System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                    }
                }
                break;
            } else if (userInput == 5) {
                Account a1 = new Account();
                System.out.print("How much will you deposit into your first account: ");
                a1.setBalance(input.nextInt());
                System.out.println("First account was created. \nYour balance: "+a1.getBalance()+"  Minimum Balance Limit: "+a1.getMinimumBalanceLimit()
                        +"  Account number: "+a1.getAccountNumber()+"  Iban number: "+a1.getIbanNumber());
                Account a2 = new Account();
                System.out.print("How much will you deposit into your second account: ");
                a2.setBalance(input.nextInt());
                System.out.println("Second account was created. \nYour balance: "+a2.getBalance()+"  Minimum Balance Limit: "+a2.getMinimumBalanceLimit()
                        +"  Account number: "+a2.getAccountNumber()+"  Iban number: "+a2.getIbanNumber());
                Account a3 = new Account();
                System.out.print("How much will you deposit into your third account: ");
                a3.setBalance(input.nextInt());
                System.out.println("Third account was created. \nYour balance: "+a3.getBalance()+"  Minimum Balance Limit: "+a3.getMinimumBalanceLimit()
                        +"  Account number: "+a3.getAccountNumber()+"  Iban number: "+a3.getIbanNumber());
                Account a4 = new Account();
                System.out.print("How much will you deposit into your fourth account: ");
                a4.setBalance(input.nextInt());
                System.out.println("Fourth account was created. \nYour balance: "+a4.getBalance()+"  Minimum Balance Limit: "+a4.getMinimumBalanceLimit()
                        +"  Account number: "+a4.getAccountNumber()+"  Iban number: "+a4.getIbanNumber());
                Account a5 = new Account();
                System.out.print("How much will you deposit into your fifth account: ");
                a5.setBalance(input.nextInt());
                System.out.println("Fifth account was created. \nYour balance: "+a5.getBalance()+"  Minimum Balance Limit: "+a5.getMinimumBalanceLimit()
                        +"  Account number: "+a5.getAccountNumber()+"  Iban number: "+a5.getIbanNumber());
                for(;;) {
                    System.out.print("If you want to do eft, select the account you want to use 1-5, if you do not, press 0 twice : ");
                    int eftSelect = input.nextInt();
                    System.out.print("Please select an account other than the currently used account. Which account do you want to Eft: ");
                    int eftTo = input.nextInt();
                    if (eftSelect == 0){
                        break;
                    }
                    else if (eftSelect==1){
                        if (eftTo==2){
                            a1.doEft(a2);
                            break;
                        } else if (eftTo==3){
                            a1.doEft(a3);
                            break;
                        }else if (eftTo==4){
                            a1.doEft(a4);
                            break;
                        }else if (eftTo==5){
                            a1.doEft(a5);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }
                    else if (eftSelect==2){
                        if (eftTo==1){
                            a2.doEft(a1);
                            break;
                        }else if (eftTo==3){
                            a2.doEft(a3);
                            break;
                        }else if (eftTo==4){
                            a2.doEft(a4);
                            break;
                        }else if (eftTo==5){
                            a2.doEft(a5);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else if (eftSelect==3){
                        if (eftTo==1){
                            a3.doEft(a1);
                            break;
                        }else if (eftTo==2){
                            a3.doEft(a2);
                            break;
                        }else if (eftTo==4){
                            a3.doEft(a4);
                            break;
                        }else if (eftTo==5){
                            a3.doEft(a5);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else if (eftSelect==4){
                        if (eftTo==1){
                            a4.doEft(a1);
                            break;
                        }else if (eftTo==2){
                            a4.doEft(a2);
                            break;
                        }else if (eftTo==3){
                            a4.doEft(a3);
                            break;
                        }else if (eftTo==5){
                            a4.doEft(a5);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else if (eftSelect==5){
                        if (eftTo==1){
                            a5.doEft(a1);
                            break;
                        }else if (eftTo==2){
                            a5.doEft(a2);
                            break;
                        }else if (eftTo==3){
                            a5.doEft(a3);
                            break;
                        }else if (eftTo==4){
                            a5.doEft(a4);
                            break;
                        }else{
                            System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                        }
                    }else{
                        System.out.println("You have entered the account that does not exist or are currently using. Re-enter.");
                    }

                }
                break;
            }

        }


    }

    private static void addCreditCard() {
        Scanner input = new Scanner(System.in);
        for (; ; ) {
            System.out.print("Choose numbers from 0 to 2! How many credit cards would you like to have? (Can be a maximum of 2) : ");
            int userInput = input.nextInt();
            if (userInput==0){
                System.out.println("You did not receive a credit card.");
                break;
            }
            else if (userInput == 1) {
                CreditCard c1 = new CreditCard();
                System.out.print("How much limit do you want your first card to have: ");
                c1.setLimit(input.nextInt());
                System.out.println("Here is your first card. \nLimiti: "+c1.getLimit()+"  Credit Card Number: "+c1.getCreditCardNumber()
                        +"  Total dept: "+c1.getTotalDept()+"  Minimum Dept Information: "+c1.getMinimumDeptInformation());
                break;
            } else if (userInput == 2) {
                CreditCard c1 = new CreditCard();
                System.out.print("How much limit do you want your first card to have: ");
                c1.setLimit(input.nextInt());
                System.out.println("Here is your first card. \nLimiti: "+c1.getLimit()+"  Credit Card Number: "+c1.getCreditCardNumber()
                        +"  Total dept: "+c1.getTotalDept()+"  Minimum Dept Information: "+c1.getMinimumDeptInformation());
                CreditCard c2 = new CreditCard();
                System.out.print("How much limit do you want your second card to have: ");
                c1.setLimit(input.nextInt());
                System.out.println("Here is your second card. \nLimiti: "+c2.getLimit()+"  Credit Card Number: "+c2.getCreditCardNumber()
                        +"  Total dept: "+c2.getTotalDept()+"  Minimum Dept Information: "+c2.getMinimumDeptInformation());
                break;
            } else {
                System.out.println("You entered an incorrect number. Re-enter.");
            }
        }
    }


}




