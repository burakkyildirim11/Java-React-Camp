package core.concretes;

import core.abstracts.ValidatorService;

public class ValidatorManager implements ValidatorService {
	@Override
	public void verificationMail() {
		System.out.println("Verification code has been sent. Check your mailbox.");
		
	}
}
