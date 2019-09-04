package com.ssm.dao;

import com.ssm.Base;
import com.ssm.entity.BookInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class SensuDaoTest extends Base {

    @Autowired
    SensuDao sensuDao;
    @Test
    public void getAllBookInfo() {

        List<BookInfo> bookInfos = sensuDao.getAllBookInfo();
        System.out.println(bookInfos);
    }
}