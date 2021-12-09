package com.book.info.bookinfo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.book.info.bookinfo.entity.Book;


public interface BookInfoService {
	public void saveDetail(Book book);

	public Object findDetailById(String id);

	public List<Book> findDetail();

	public String deleteDetail(String id);
}
