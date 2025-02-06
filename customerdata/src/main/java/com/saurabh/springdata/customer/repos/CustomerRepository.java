package com.saurabh.springdata.customer.repos;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.saurabh.springdata.customer.entities.Customer;

//Before Spring Boot 3.0 our repositories only needed to extend the "PagingAndSortingRepository<T, ID>" interface.
//But starting Spring Boot 3.0 and above we will have to extend both the "CrudRepository<T, ID>" and "PagingAndSortingRepository<T, ID>" interfaces.
public interface CustomerRepository extends CrudRepository<Customer, Integer>, PagingAndSortingRepository<Customer, Integer> {

	Customer findByName(String name);

	Customer findByEmail(String email);

	Customer findByNameAndEmail(String name, String email);

	List<Customer> findByEmailContains(String email);

	List<Customer> findByEmailLike(String email);

	List<Customer> findByIdIn(List<Integer> ids, Pageable pageable);

	@Modifying
	@Query("update Customer set email=:emailId where id=:id")
	void updateCustomerEmailById(@Param("emailId") String email, @Param("id") Integer id);

}
