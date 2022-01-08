public class CurrentAccount extends Account {
    double currentBalance;

    CurrentAccount(String name, int accountNo, double balance){
        super(name, accountNo);
        this.currentBalance = balance;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Current Balance: " + this.currentBalance);
    }

}
