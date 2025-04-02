package com.saurabh.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saurabh.lms.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
