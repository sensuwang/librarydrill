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
        List<BookInfo> ls = bookService.findBookByName(bookName);
        System.out.println(ls);
        mav.addObject("ls",ls);
        //mav.setViewName("index.jsp");
        return mav;
    }
    //价格升序进行排序
    @RequestMapping("findorderbyprice")
    public ModelAndView findOrderByPrice() {
        ModelAndView mav = new ModelAndView("bookInfo");
        List<BookInfo> ls = bookService.findOderByPrice();
        mav.addObject("ls",ls);
        System.out.println(ls);
        //mav.setViewName("index.jsp");
        return mav;
    }
    /*
    * 按价格区间进行查询
    * */
    @RequestMapping("findbetweenand")
    public ModelAndView findBetweenAnd(HttpServletRequest request) {
        String low = request.getParameter("low");
        String high = request.getParameter("high");
        ModelAndView mav = new ModelAndView("bookInfo");
        List<BookInfo> ls = bookService.findBetweenAnd(high,low);
        mav.addObject("ls",ls);
        //mav.setViewName("index.jsp");
        return mav;
    }




}
