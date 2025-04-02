package com.saurabh.lms.model;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Borrowing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "book_id", referencedColumnName = "id")
	private Book book;

	@ManyToOne
	@JoinColumn(name = "member_id", referencedColumnName = "id")
	private Member member;
	private Date borrowedDate;
	private Date returnDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Date getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(Date borrowingDate) {
		this.borrowedDate = borrowingDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(book, borrowedDate, id, member, returnDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Borrowing other = (Borrowing) obj;
		return Objects.equals(book, other.book) && Objects.equals(borrowedDate, other.borrowedDate)
				&& Objects.equals(id, other.id) && Objects.equals(member, other.member)
				&& Objects.equals(returnDate, other.returnDate);
	}

	@Override
	public String toString() {
		return "Borrowing [id=" + id + ", book=" + book + ", member=" + member + ", borrowedDate=" + borrowedDate
				+ ", returnDate=" + returnDate + "]";
	}

}
