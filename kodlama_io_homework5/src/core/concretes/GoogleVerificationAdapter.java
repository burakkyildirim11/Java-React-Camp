package core.concretes;

import core.abstracts.VerificationService;
import entities.concretes.User;
import googleValidationService.GoogleVerificationService;

public class GoogleVerificationAdapter implements VerificationService {
	@Override
	public boolean isValid(User user) {
		GoogleVerificationService googleUserValid= new GoogleVerificationService();
		return googleUserValid.isValidGoogle();
	}
}
