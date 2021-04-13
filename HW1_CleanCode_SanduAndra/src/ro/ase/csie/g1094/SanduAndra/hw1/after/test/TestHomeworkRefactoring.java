package ro.ase.csie.g1094.SanduAndra.hw1.after.test;
import ro.ase.csie.g1094.SanduAndra.hw1.after.classes.AccountDetails;
import ro.ase.csie.g1094.SanduAndra.hw1.after.classes.AccountType;
import ro.ase.csie.g1094.SanduAndra.hw1.after.classes.LoanDetails;
import ro.ase.csie.g1094.SanduAndra.hw1.after.exceptions.InvalidInputValueForLoanException;
import ro.ase.csie.g1094.SanduAndra.hw1.after.exceptions.InvalidInputValueForRateException;

public class TestHomeworkRefactoring {
	
	public static void main(String[] args) throws InvalidInputValueForLoanException, InvalidInputValueForRateException {
	
		LoanDetails loanDetailsAccount1 = new LoanDetails(56.5,0.87);
		AccountDetails accountDetails1 = new AccountDetails(5, 
				                           AccountType.BUDGET, loanDetailsAccount1);
				
	    double monthlyRateAccount1 = accountDetails1.getMonthlyRate();

	    System.out.println("The monthly rate is "+ monthlyRateAccount1);
	    System.out.println("The details for account 1 are the next: "+ 
	                                             accountDetails1.getAccountInfo());
	    System.out.println("The loan details for account 1 are the next:"+ 
	                                             loanDetailsAccount1.LoanInfo());
	    
	    
	    LoanDetails loanDetailsAccount2 = new LoanDetails(459.8,3.2);
		AccountDetails accountDetails2 = new AccountDetails(564, AccountType.PREMIUM, loanDetailsAccount2);
		
		//LoanDetails loanDetailsAccount3 = new LoanDetails(200,0.4);
		AccountDetails accountDetails3 = new AccountDetails(679, 
				                           AccountType.SUPER_PREMIUM,  new LoanDetails(577.8,3.9));
	
		AccountDetails[] availableAccounts = new AccountDetails[3];
		
		availableAccounts[0] = accountDetails1;
		availableAccounts[1] = accountDetails2;
		availableAccounts[2] = accountDetails3;

		double totalFee = 0.0;
		totalFee = AccountDetails.calculateTotalFeeFromPremiumTypeAccounts(availableAccounts);	

		System.out.println("The total fee for premium type accounts  "+ totalFee);

	}

}
