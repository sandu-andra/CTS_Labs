package ro.ase.csie.g1094.SanduAndra.hw1.after.services;

import ro.ase.csie.g1094.SanduAndra.hw1.after.exceptions.InvalidInputValueForLoanException;
import ro.ase.csie.g1094.SanduAndra.hw1.after.exceptions.InvalidInputValueForRateException;

public interface ValidatorServiceInterface {

    public void checkValidationLoanValue(double loanValue) throws InvalidInputValueForLoanException;	
	public void checkValidationRateValue(double rateValue) throws InvalidInputValueForRateException;
}
