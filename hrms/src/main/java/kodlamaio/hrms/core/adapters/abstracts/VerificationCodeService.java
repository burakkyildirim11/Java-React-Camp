package kodlamaio.hrms.core.adapters.abstracts;

public interface VerificationCodeService {

	boolean sendValidationCode(String email);
}
