package kodlamaio.hrms.core.adapters.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.core.adapters.abstracts.VerificationCodeService;

public class VerificationCodeManager implements VerificationCodeService{

	
	private VerificationCodeManager verificationCodeManager;
	
	
	@Autowired
	public VerificationCodeManager(VerificationCodeManager verificationCodeManager) {
		this.verificationCodeManager = verificationCodeManager;
	}
	
	
	@Override
	public boolean sendValidationCode(String email) {
		return verificationCodeManager.sendValidationCode(email);
	}

}
