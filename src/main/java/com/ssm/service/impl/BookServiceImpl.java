package com.ssm.service.impl;

import com.ssm.dao.BookDao;
import com.ssm.entity.BookInfo;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl  implements BookService {
    @Autowired
    BookDao bookDao;
    @Override
    public List<BookInfo> findAllBookInfo() {
        return bookDao.findAllBookInfo();
    }

    @Override
    public BookInfo findBookById(int id) {
        return bookDao.findBookById(id);
    }

    @Override
    public List<BookInfo> findBookByName(String bookName) {
        return bookDao.findBookByName(bookName);
    }

    @Override
    public List<BookInfo> findOderByPrice() {
        return bookDao.findOderByPrice();
    }

    @Override
    public List<BookInfo> findBetweenAnd(String high, String low) {
        System.out.println("service");
        return bookDao.findBetweenAnd(high,low);
    }


}
