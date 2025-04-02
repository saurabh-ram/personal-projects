package com.saurabh.lms.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurabh.lms.model.Borrowing;
import com.saurabh.lms.repos.BookRepository;
import com.saurabh.lms.repos.BorrowingRepository;
import com.saurabh.lms.repos.MemberRepository;

@Service
public class BorrowingServiceImpl implements BorroowingService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private BorrowingRepository borrowingRepository;

	@Override
	public Borrowing borrowBook(Long bookId, Long memberId) {
		Borrowing borrowing = new Borrowing();
		borrowing.setBook(bookRepository.findById(bookId).get());
		borrowing.setMember(memberRepository.findById(memberId).get());
		borrowing.setBorrowedDate(new Date());
		return borrowingRepository.save(borrowing);
	}

	@Override
	public Borrowing returnBook(Long borrowingId) {
		Borrowing borrowing = borrowingRepository.findById(borrowingId).get();
		borrowing.setReturnDate(new Date());
		return borrowingRepository.save(borrowing);
	}

}
