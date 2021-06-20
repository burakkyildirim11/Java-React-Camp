package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.EmployeeConfirms;

public interface EmployeeConfirmDao extends JpaRepository<EmployeeConfirms, Integer> {

}
