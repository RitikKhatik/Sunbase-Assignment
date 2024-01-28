package sunbase.ty.SunbaseCustApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sunbase.ty.SunbaseCustApp.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
