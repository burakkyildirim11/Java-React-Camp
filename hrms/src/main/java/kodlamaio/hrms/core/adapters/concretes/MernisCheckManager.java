package kodlamaio.hrms.core.adapters.concretes;

import kodlamaio.hrms.core.adapters.abstracts.PersonCheckService;
import kodlamaio.hrms.entities.concretes.Candidate;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Candidate candidate) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		boolean result = false;
		
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(candidate.getIdentityNumber()), 
											  candidate.getFirstName().toUpperCase(), 
											  candidate.getLastName().toUpperCase(), 
											  candidate.getBirthYear());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}
		
		return result;
	}

}
