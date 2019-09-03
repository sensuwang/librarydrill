package com.ssm.entity;

import java.util.Date;

/**
 * @ClassName LibraryDrill
 * @Author sensu
 * @Date 2019/9/3 18:51
 **/
public class BookInfo {
    private Integer id;
    private String bookName;
    private String bookImg;
    private String bookNowPrice;
    private String bookPrePrice;
    private String bookDiscount;
    private String bookAuthor;
    private String bookPublish;
    private Date bookPublishData;
    private String bookDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public String getBookNowPrice() {
        return bookNowPrice;
    }

    public void setBookNowPrice(String bookNowPrice) {
        this.bookNowPrice = bookNowPrice;
    }

    public String getBookPrePrice() {
        return bookPrePrice;
    }

    public void setBookPrePrice(String bookPrePrice) {
        this.bookPrePrice = bookPrePrice;
    }

    public String getBookDiscount() {
        return bookDiscount;
    }

    public void setBookDiscount(String bookDiscount) {
        this.bookDiscount = bookDiscount;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublish() {
        return bookPublish;
    }

    public void setBookPublish(String bookPublish) {
        this.bookPublish = bookPublish;
    }

    public Date getBookPublishData() {
        return bookPublishData;
    }

    public void setBookPublishData(Date bookPublishData) {
        this.bookPublishData = bookPublishData;
    }

    public String getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail;
    }
}
