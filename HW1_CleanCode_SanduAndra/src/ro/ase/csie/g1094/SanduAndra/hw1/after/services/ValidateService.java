package ro.ase.csie.g1094.SanduAndra.hw1.after.services;

import ro.ase.csie.g1094.SanduAndra.hw1.after.exceptions.InvalidInputValueForLoanException;
import ro.ase.csie.g1094.SanduAndra.hw1.after.exceptions.InvalidInputValueForRateException;

public class ValidateService implements ValidatorServiceInterface {

	@Override
	public void checkValidationLoanValue(double loanValue) throws InvalidInputValueForLoanException {
		if(loanValue < 0) {
			throw new InvalidInputValueForLoanException();
		}	
	}

	@Override
	public void checkValidationRateValue(double rateValue) throws InvalidInputValueForRateException {
		if(rateValue < 0) {
			throw new InvalidInputValueForRateException();
		}		
	}
}
