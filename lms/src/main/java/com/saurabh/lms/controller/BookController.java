package com.saurabh.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.saurabh.lms.model.Book;
import com.saurabh.lms.repos.BookRepository;

@Controller
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/")
	public String listBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books";
	}

	@GetMapping("/book/new")
	public String showCreateForm(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "create_book";
	}

	@PostMapping("/books")
	public String saveBook(Book book) {
		bookRepository.save(book);
		return "redirect:/";
	}

	@GetMapping("/book/delete/{id}")
	public String showDeleteConfirmationPage(@PathVariable("id") Long bookId, Model model) {
		Book book = bookRepository.findById(bookId).get();
		model.addAttribute("book", book);
		return "delete_book";
	}

	@PostMapping("/book/delete/{id}")
	public String deleteBook(@PathVariable("id") Long bookId, Model model) {
		bookRepository.deleteById(bookId);
		model.addAttribute("message", "Book deleted successfully!!");
		return "delete_success";
	}

	@GetMapping("/book/update/{id}")
	public String showUpdateForm(@PathVariable("id") Long bookId, Model model) {
		Book book = bookRepository.findById(bookId).get();
		model.addAttribute("book", book);
		return "update_book";
	}

	@PostMapping("/book/update")
	public String updateBook(Book book) {
		bookRepository.save(book);
		return "redirect:/";
	}

}
