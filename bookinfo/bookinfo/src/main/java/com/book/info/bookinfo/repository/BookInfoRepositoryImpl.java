package com.book.info.bookinfo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.book.info.bookinfo.entity.Book;

@Repository
public class BookInfoRepositoryImpl implements BookInfoRepository {

	List<Book> list = new ArrayList<>();

	@Override
	public void saveDetail(Book book) {

		// book id = random number between 1000 to 9999 and hashCode() of book name
		int max = 9999, min = 1000;
		String id = String.valueOf((int) Math.random() * (max - min - 1)) + book.getName().hashCode();
		book.setId(id);
		list.add(book);

	}

	@Override
	public Object findDetailById(String id) {
		Book book = null;
		for (Book b : list) {
			if (b.getId().equals(id))
				book = b;
		}
		return book == null ? "Record with id " + id + " not found." : book;

	}

	@Override
	public List<Book> findDetail() {
		return list;

	}

	@Override
	public String deleteDetail(String id) {
		for (Book book : list) {
			if (book.getId().equals(id)) {
				list.remove(book);
				return "Record with id " + id + " has been deleted successfully.";
			}
		}
		return "Record with id " + id + " not found.";
	}

}
