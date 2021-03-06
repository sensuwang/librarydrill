package com.ssm.service;

import com.ssm.entity.BookInfo;

import java.sql.SQLOutput;
import java.util.List;

public interface BookService {
    /*
    * 查询所有图书信息
    * */
    List<BookInfo> findAllBookInfo();

    /*
    * 根据id查询单条信息
    *
    * */
    BookInfo findBookById(int id);

    /*
    * 根据name模糊查询信息
    * */
    List<BookInfo> findBookByName(String bookName);
    List<BookInfo> findOderByPrice();

    List<BookInfo> findBetweenAnd(String high,String low);


}
