package com.saurabh.springdata.customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.transaction.annotation.Transactional;

import com.saurabh.springdata.customer.entities.Customer;
import com.saurabh.springdata.customer.repos.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {

	@Autowired
	CustomerRepository repository;

	@Test
	void contextLoads() {
	}

//	@Test
	void testCreate() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Mikasa Ackerman");
		customer.setEmail("mikasa.ackerman@gmail.com");

		repository.save(customer);
	}

	@Test
	void testRead() {
		Customer customer = repository.findById(1).get();
		assertNotNull(customer);
		assertEquals("Mikasa Ackerman", customer.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + customer.getEmail());
	}

//	@Test
	void testUpdate() {
		Customer cutomer = repository.findById(1).get();
		cutomer.setEmail("mikasa.yeager@gmail.com");
		repository.save(cutomer);
	}

//	@Test
	void testDelete() {
		if (repository.existsById(1)) {
			System.out.println("Deleting a Cutomer");
			repository.deleteById(1);
		}
	}

	@Test
	void testCount() {
		System.out.println("Total Records: " + repository.count());
	}

	@Test
	void testCustomAnnotation() {
		Customer customer = new Customer();
//		customer.setId(1);
//		customer.setName("Mikasa Ackerman");
//		customer.setEmail("mikasa.yeager@gmail.com");
//		customer.setId(2);
//		customer.setName("Eren Yeager");
//		customer.setEmail("eren.yeager@gmail.com");

		repository.save(customer);
	}

//	@Test
	void testCustomAnnotationMutipleValues() {
//		Customer customer1 = new Customer();
//		Customer customer2 = new Customer();
//		Customer customer3 = new Customer();
//		Customer customer4 = new Customer();
//		Customer customer5 = new Customer();
//		Customer customer6 = new Customer();
//		Customer customer7 = new Customer();
//		Customer customer8 = new Customer();
//		Customer customer9 = new Customer();
//		Customer customer10 = new Customer();
//		customer1.setId(1);
//		customer1.setName("Mikasa Ackerman");
//		customer1.setEmail("mikasa.yeager@gmail.com");
//		customer2.setId(2);
//		customer2.setName("Eren Yeager");
//		customer2.setEmail("eren.yeager@gmail.com");
//		customer3.setId(3);
//		customer3.setName("Shiki Granbell");
//		customer3.setEmail("shiki.granbell@gmail.com");
//		customer4.setId(4);
//		customer4.setName("Inosuke Hashibira");
//		customer4.setEmail("inosukehashibira4542@gmail.com");
//		customer5.setId(5);
//		customer5.setName("Konoha Sarutobi");
//		customer5.setEmail("konoha.sarutobi@gmail.com");
//		customer6.setId(6);
//		customer6.setName("Naruto Uzumaki");
//		customer6.setEmail("naruto.uzumaki@gmail.com");
//		customer7.setId(7);
//		customer7.setName("Tanjiro Kamado");
//		customer7.setEmail("tanjiro.kamado3371@gmail.com");
//		customer8.setId(8);
//		customer8.setName("Riza Hawkeye");
//		customer8.setEmail("hawkeye.riza7699@gmail.com");
//		customer9.setId(9);
//		customer9.setName("Yukino Yukinoshita");
//		customer9.setEmail("yukinoyukinoshita4204@gmail.com");
//		customer10.setId(10);
//		customer10.setName("Hachiman Hikigaya");
//		customer10.setEmail("hikigayahachiman1499@gmail.com");
//
//		repository.save(customer1);
//		repository.save(customer2);
//		repository.save(customer3);
//		repository.save(customer4);
//		repository.save(customer5);
//		repository.save(customer6);
//		repository.save(customer7);
//		repository.save(customer8);
//		repository.save(customer9);
//		repository.save(customer10);
	}

	@Test
	void testFindByName() {
		System.out.println("Customer found 1: " + repository.findByName("Eren Yeager"));
	}

	@Test
	void testFindByEmail() {
		System.out.println("Customer found 2: " + repository.findByEmail("mikasa.yeager@gmail.com"));
	}

	@Test
	void testFindByNameAndEmail() {
		System.out.println(
				"Customer found 3: " + repository.findByNameAndEmail("Mikasa Ackerman", "mikasa.yeager@gmail.com"));
	}

	@Test
	void testFindByEmailContains() {
		List<Customer> customers = repository.findByEmailContains("yeager");
		customers.forEach(c -> System.out.println("Customer found 4: " + c.getName()));
	}

	@Test
	void testFindByEmailLike() {
		List<Customer> customers = repository.findByEmailLike("%yeager%");
		customers.forEach(c -> System.out.println("Customer found 5: " + c.getName()));
	}

	@Test
	void testFindByIdIn() {
		Pageable pageable1 = PageRequest.of(1, 2, Direction.DESC, "name");
		List<Customer> customersList1 = repository.findByIdIn(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), pageable1);
		customersList1.forEach(c -> System.out.println("Customer found 6: " + c.getName()));

		Pageable pageable2 = PageRequest.of(1, 5, Direction.DESC, "name");
		List<Customer> customersList2 = repository.findByIdIn(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), pageable2);
		customersList2.forEach(c -> System.out.println("Customer found 7: " + c.getName()));
	}

	@Test
	@Transactional
//	Without @Rollback annotation the delete operation will happen and test will get PASS!!
//	But the changes will be rolled back, so DB entries will be as it is.
//	@Rollback(false)
	void testUpdateCustomerEmailById() {
//		repository.updateCustomerEmailById("eren.yeager@gmail.com", 2);
		repository.updateCustomerEmailById("eren.kruger@gmail.com", 2);
	}

}
