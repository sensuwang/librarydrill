package com.ssm.web;

import com.ssm.entity.BookInfo;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BookController {
    @Autowired
    BookService bookService;
    // 查询所有图书信息
    @RequestMapping("findAll")
    public ModelAndView findAll() {
        ModelAndView mav = new ModelAndView("bookInfo");
        List<BookInfo> ls = bookService.findAllBookInfo();
        mav.addObject("ls",ls);
        //mav.setViewName("index.jsp");
        return mav;
    }
    /*
    * 根据id查询信息
    * */
    @RequestMapping("findbyid")
    public ModelAndView findById(int id) {
        ModelAndView mav = new ModelAndView("bookdetail");
        BookInfo bookInfo = bookService.findBookById(id);
        mav.addObject("bookInfo",bookInfo);
        //mav.setViewName("index.jsp");
        return mav;
    }

    /*
     * 根据name模糊查询信息
     * */
    @RequestMapping("findbyname")
    public ModelAndView findByName(HttpServletRequest request) {
        String bookName = request.getParameter("bookName");
        System.out.println("bookname----"+bookName);
        ModelAndView mav = new ModelAndView("bookInfo");
        List<BookInfo> bookInfo = bookService.findBookByName(bookName);
        System.out.println(bookInfo);
        mav.addObject("bookInfo",bookInfo);
        //mav.setViewName("index.jsp");
        return mav;
    }




}
