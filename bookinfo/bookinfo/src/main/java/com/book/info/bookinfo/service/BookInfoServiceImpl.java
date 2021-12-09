package com.book.info.bookinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.info.bookinfo.entity.Book;
import com.book.info.bookinfo.repository.BookInfoRepository;

@Service
public class BookInfoServiceImpl implements BookInfoService {

	@Autowired
	BookInfoRepository repo;

	@Override
	public void saveDetail(Book book) {
		repo.saveDetail(book);

	}

	@Override
	public Object findDetailById(String id) {
		return repo.findDetailById(id);
	}

	@Override
	public List<Book> findDetail() {
		return repo.findDetail();
	}

	@Override
	public String deleteDetail(String id) {
		return repo.deleteDetail(id);
	}

}
