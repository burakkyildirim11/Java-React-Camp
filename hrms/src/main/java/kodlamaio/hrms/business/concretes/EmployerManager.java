package kodlamaio.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.adapters.abstracts.VerificationCodeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	
	private List<String> emailList = new ArrayList<String>();
	private List<String> webAdressList = new ArrayList<String>();
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, VerificationCodeService verificationCodeService) {
		super();
		this.employerDao = employerDao;
		//
	}

	
	@Override
	public Result add(Employer employer) {
		if (emailList.contains(employer.getEmail())){
            System.out.println("E-posta adresi mevcut, başka bir adres giriniz.");
        }
		if(emailList.contains(employer.getEmail()) == webAdressList.contains(employer.getWebAdress())) {
			System.out.println("E-posta ve web adresiniz aynı olmak zorunda!");
		}
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Data listed");
	}
	
}
