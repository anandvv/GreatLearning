package CodingChallenge11;

public class Account {
    String customerName;
    int accountNo;

    Account(String name, int accountNo){
        this.customerName = name;
        this.accountNo = accountNo;
    }

    void display(){
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Account Number: " + this.accountNo);
    }
}
