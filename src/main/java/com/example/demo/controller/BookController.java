package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by sang on 2018/7/11.
 */
@Controller
//@RestController 如果频繁用responbody,
public class BookController {
    @GetMapping("/books")
    @ResponseBody
    public String book(@ModelAttribute("b") Book book, @ModelAttribute("a") Author author) {
        return book.toString() + ">>>" + author.toString();
    }
//    public Book book() {
//        Book book = new Book();
//        book.setAuthor("luoguanzhong");
//        book.setName("sanguo");
//        book.setPrice(30f);
//        book.setPublicationDate(new Date());
//        return book;
//    }
//    public ModelAndView books() {
//        List<Book> books = new ArrayList<>();
//        Book b1 = new Book();
//        b1.setId(1);
//        b1.setAuthor("罗贯中");
//        b1.setName("三国演义");
//        Book b2 = new Book();
//        b2.setId(2);
//        b2.setAuthor("曹雪芹");
//        b2.setName("红楼梦");
//        books.add(b1);
//        books.add(b2);
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("books", books);
//        mv.setViewName("books");
//        return mv;
//    }
}
