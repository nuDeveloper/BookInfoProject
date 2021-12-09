package com.book.info.bookinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.info.bookinfo.entity.Book;
import com.book.info.bookinfo.service.BookInfoService;

@RestController
@RequestMapping("/book")
public class BookInfoController {

	@Autowired
	BookInfoService service;

	@PostMapping("/save")
	public Book saveBookDetail(@RequestBody Book book) {
		service.saveDetail(book);
		return book;
	}

	@GetMapping("/get/{id}")
	public Object findBookDetailById(@PathVariable("id") String id) {
		return service.findDetailById(id);
	}

	@GetMapping("/get")
	public List<Book> findBooksDetail() {
		return service.findDetail();
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBookDetailById(@PathVariable("id") String id) {
		return service.deleteDetail(id);
	}

}
