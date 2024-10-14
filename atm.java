import java.util.concurrent.atomic.AtomicBoolean;

public class atm {
    private int balance;
    private int pin;

    public atm(int balance ,int pin){
        this.balance=balance;
        this.pin=pin;
    }

    public void displayMenu(){
        System.out.println("======================");
        System.out.println("1. --- Check Balance:---");
        System.out.println("2. ---Deposite:---");
        System.out.println("3. ---Withdraw:---");
        System.out.println("4. ---Change Pin:---");
        System.out.println("5. ---Exit:---");
        System.out.println("======================");
    }
    public void deposite(int amount){
        balance+=amount;   
    }
    public void withdraw(int amount){
        if (balance<amount){
            System.out.println("Enter the pin:");
            return;
        }
            balance-=amount; 
        }
        public int getBalance(){
            return balance;
        }
        public boolean validatePin(int pin){
            return this.pin==pin;
        }
        public void changePin(int newPin){
            pin = newPin;
            System.out.println("Pin changed");
        }
        public static void main(String[] args) {
            atm atm1 = new atm(1000, 1234);
            atm1.displayMenu();
            System.out.println("---Enter the Pin:---");
            int pin =Integer.parseInt(System.console().readLine());
            if(atm1.validatePin(pin)){
                int option =0;
                while(option!=5){
                    atm1.displayMenu();
                    option =Integer.parseInt(System.console().readLine());
                    switch(option) {
                        case 1:System.out.println(":---Balance---:"+atm1.getBalance());
                            break;
                        case 2:
                            System.out.println(":---Enter Amount---:");
                            int amount=Integer.parseInt(System.console().readLine());
                            atm1.deposite(amount);
                            break;
                        case 3:
                            System.out.println(":---Enter Amount---: ");
                            amount=Integer.parseInt(System.console().readLine());
                            atm1.withdraw(amount);
                            break;
                        case 4:
                            System.out.println(":---Enter new Pin---:");
                            int newPin=Integer.parseInt(System.console().readLine());
                            atm1.changePin(newPin);                        
                            break;
                        case 5:
                        System.out.println("===Thank You For Using ATM!===");
                            
                            break;
                        default:
                            break;
                    }
                }
            }
            else{
                System.out.println("You have entred Invalid Pin:");
            }
        }

     }
    


    