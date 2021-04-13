package ro.ase.csie.g1094.SanduAndra.hw1.after.classes;

import ro.ase.csie.g1094.SanduAndra.hw1.after.exceptions.InvalidInputValueForLoanException;
import ro.ase.csie.g1094.SanduAndra.hw1.after.exceptions.InvalidInputValueForRateException;
import ro.ase.csie.g1094.SanduAndra.hw1.after.services.ValidateService;
import ro.ase.csie.g1094.SanduAndra.hw1.after.services.ValidatorServiceInterface;

public class LoanDetails {

	private double loanValue, rateValue;
	ValidateService validateService = new ValidateService();
	   
	public LoanDetails() {
		this.loanValue = 0;
		this.rateValue = 0;
	}

	public LoanDetails(double loanValue, double rateValue) throws InvalidInputValueForLoanException, 
	                                                              InvalidInputValueForRateException {
		validateService.checkValidationLoanValue(loanValue);	
		this.loanValue = loanValue;
		validateService.checkValidationRateValue(rateValue);
		this.rateValue = rateValue;
	}
		
	public double getLoanValue() {
		return this.loanValue;
	}
		
	public double getRateValue() {
		return this.rateValue;
	}

	public void setLoanValue(double loanValue) throws InvalidInputValueForLoanException {
		validateService.checkValidationLoanValue(loanValue);	
		this.loanValue = loanValue;
	}

	public void setRateValue(double rateValue) throws InvalidInputValueForRateException {
		validateService.checkValidationRateValue(rateValue);
		this.rateValue = rateValue;
	}

	public String LoanInfo() {
		return " Loan [loanValue is " + loanValue + 
				", while the rateValue is " + rateValue + "]";
	}
	
}
