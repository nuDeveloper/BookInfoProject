package com.book.info.bookinfo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.book.info.bookinfo.entity.Book;


public interface BookInfoRepository {

	public void saveDetail(Book book);

	public Object findDetailById(String id);

	public List<Book> findDetail();

	public String deleteDetail(String id);
}
