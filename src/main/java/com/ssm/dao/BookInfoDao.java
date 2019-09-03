package com.ssm.dao;

import com.ssm.entity.BookInfo;

import java.util.List;

/**
 * @ClassName LibraryDrillDao
 * @Author sensu
 * @Date 2019/9/3 18:50
 **/
public interface BookInfoDao {
    List<BookInfo> listBookInfo();
}
