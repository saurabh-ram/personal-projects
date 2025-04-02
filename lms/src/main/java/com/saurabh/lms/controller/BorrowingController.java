package com.saurabh.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.saurabh.lms.repos.BookRepository;
import com.saurabh.lms.repos.BorrowingRepository;
import com.saurabh.lms.repos.MemberRepository;
import com.saurabh.lms.service.BorroowingService;

@Controller
public class BorrowingController {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private BorrowingRepository borrowingRepository;

	@Autowired
	private BorroowingService borroowingService;

	@GetMapping("/borrow")
	public String showBorrowForm(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		model.addAttribute("members", memberRepository.findAll());
		return "borrow_book";
	}

	@PostMapping("/borrow")
	public String borrowBook(@RequestParam Long bookId, @RequestParam Long memberId, Model model) {
		borroowingService.borrowBook(bookId, memberId);
		model.addAttribute("message", "Book borrowed successfully!!");
		return "borrow_success";
	}

	@GetMapping("/return")
	public String showReturnForm(Model model) {
		model.addAttribute("borrowers", borrowingRepository.findByReturnDate(null));
		return "return_book";
	}

	@PostMapping("/return")
	public String returnBook(@RequestParam Long borrowingId, Model model) {
		borroowingService.returnBook(borrowingId);
		model.addAttribute("message", "Book returned successfully!!");
		return "return_success";
	}

}
