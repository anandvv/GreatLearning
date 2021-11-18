public class AccountDetails extends CurrentAccount {

    double depositAmount;
    double withdrawalAmount;

    AccountDetails(String a, int b, int c, int d, int e){
        super(a, b, c);
        this.depositAmount = d;
        this.withdrawalAmount = e;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Deposit Amount: " + this.depositAmount);
        System.out.println("Withdrawal Amount: " + this.withdrawalAmount);
    }

    public static void main(String[] args) {
        AccountDetails obj = new AccountDetails("Anand", 123, 75000, 2000, 1000);
        obj.display();
    }
}
