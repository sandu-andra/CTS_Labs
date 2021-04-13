package ro.ase.csie.g1094.SanduAndra.hw1.after.classes;
import ro.ase.csie.g1094.SanduAndra.hw1.after.interfaces.MonthlyRateComputingInterface;
import ro.ase.csie.g1094.SanduAndra.hw1.before.classes.Account;

public class AccountDetails implements MonthlyRateComputingInterface {
		
	private int activeDaysAccount;
	private AccountType accountType;
	private LoanDetails loanDetails;
	
	private static final int daysPerYear = 365;
    private static final float brokerFee = 0.0125f;
    
	public AccountDetails(int activeDaysAccount, AccountType accountType, LoanDetails loanDetails) {
		this.activeDaysAccount = activeDaysAccount;
		this.accountType = accountType;
		this.loanDetails = loanDetails;
	}

	public String getAccountInfo() {
		return "AccountDetails [accountType=" + accountType +
				", loanDetails: { loan: " + loanDetails.getLoanValue() + 
				", rate: " + loanDetails.getRateValue() + "}"+
				", activeDaysAccount=" + activeDaysAccount + "]";
	}
	
	@Override
	 public double getMonthlyRate() {
	    return loanDetails.getRateValue()*loanDetails.getLoanValue();    
	}
		
	public static double computeInterestForAccount(AccountDetails accountDetails) {
		return Math.pow((accountDetails.loanDetails.getRateValue()), 
				           (accountDetails.activeDaysAccount/daysPerYear));
	}

	public static double computeInterestValueMultipliedByLoanForAccount(AccountDetails accountDetails) {
		return accountDetails.loanDetails.getLoanValue()*
				           computeInterestForAccount(accountDetails);
	}
	
	public static double computeTheDifferenceBetweenInterestAndPrincipalForAccount(AccountDetails accountDetails) {
		return computeInterestValueMultipliedByLoanForAccount(accountDetails)-
				accountDetails.loanDetails.getLoanValue();
	}
	
	public static double calculateTotalFeeFromPremiumTypeAccounts(AccountDetails[] accountsDetails){
	    double totalFeeFromPremiumAccounts = 0.0;
	    
	    for	(int i=0; i < accountsDetails.length; i++)	{
	    	 if(accountsDetails[i].accountType == AccountType.PREMIUM || 
	    			          accountsDetails[i].accountType == AccountType.SUPER_PREMIUM) {
	    		totalFeeFromPremiumAccounts += brokerFee * computeTheDifferenceBetweenInterestAndPrincipalForAccount(accountsDetails[i]);	    		
	    	}
	    }
	    
	    return	totalFeeFromPremiumAccounts;
	}		
	
}
