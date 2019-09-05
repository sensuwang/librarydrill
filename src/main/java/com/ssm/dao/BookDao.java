package com.ssm.dao;

import com.ssm.entity.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface BookDao {
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
    * 根据书名模糊查询
    * */
    List<BookInfo> findBookByName(String bookName);

    List<BookInfo> findOderByPrice();

    List<BookInfo> findBetweenAnd(String high,String low);


}
