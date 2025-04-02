package com.saurabh.lms.service;

import com.saurabh.lms.model.Borrowing;

public interface BorroowingService {

	Borrowing borrowBook(Long bookId, Long memberId);

	Borrowing returnBook(Long borrowingId);

}
