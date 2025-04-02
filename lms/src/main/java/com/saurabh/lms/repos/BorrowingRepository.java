package com.saurabh.lms.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saurabh.lms.model.Borrowing;

@Repository
public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {

	List<Borrowing> findByReturnDate(Date date);

}
