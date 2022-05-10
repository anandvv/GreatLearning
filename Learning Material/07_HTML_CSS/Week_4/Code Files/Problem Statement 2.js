
var option="0";
var bankBalance=1000;
do {


    console.log("-----------------------------------------------");
    console.log("Enter the operation that you want to perform");
    console.log("1. Deposit");
    console.log("2. Withdrawl");
    console.log("3. Transfer");
    console.log("0. Logout");
    console.log("-----------------------------------------------");
   
  
    

    option=window.prompt("Enter the opertion")
    console.log("Selected option is",option)
    
    switch (option) {

    case "0":
        option = "0";
        break;
    case "1": {
        var amount;
		console.log("enter the amount you want to deposit");
        amount=Number.parseInt(window.prompt("Enter the amount to deposit"));
		if (amount > 0) {
			console.log("amount " + amount + " deposit successfully");
			bankBalance = bankBalance + amount;
			console.log("Remaining Bank balance is " + bankBalance);
		} else
			console.log("enter a correct amount");

    }
    break;
    case "2": {
        //banking.withdrawl();
        var amount;
		console.log("enter the amount you want to withdrawl");
        amount=Number.parseInt(window.prompt("Enter the amount to withdrawl"));
		if (bankBalance-amount > 0) {
			console.log("amount " + amount + " withdrawl successfully");
			bankBalance = bankBalance - amount;
			console.log("Remaining Bank balance is " + bankBalance);
		} else
			console.log("Insufficient funds");

    }
    break;
    case "3": {
        //banking.transfer();
        var amount;
		
		var bankAccountNo;
		
			console.log(" enter the amount and BankAccount no to which you want to transfer");
			amount=Number.parseInt(window.prompt("Enter the amount to transfer"));
			bankAccountNo = Number.parseInt(window.prompt("Enter the Bank Account Number"));

			if (bankBalance - amount >= 0) {
				console.log("amount " + amount + " transferred successful to bankAccount " + bankAccountNo);
				bankBalance = bankBalance - amount;
				console.log("Remaining Bank balance is " + bankBalance);
			} else
				console.log("insufficient funds");

		

    }
    break;
    default:
        console.log("enter valid option");
    }

} while (option != "0");


