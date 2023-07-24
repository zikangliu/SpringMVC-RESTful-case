package com.lzk.controller;

import com.lzk.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save ======>" + book);
        return "{'module' : 'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        System.out.println("Book getAll is running....");
        List<Book> bookList = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setName("底层逻辑");
        book1.setType("商业");
        book1.setDescription("关于商业的底层逻辑");
        bookList.add(book1);

        Book book2 = new Book();
        book2.setName("不二");
        book2.setType("小说");
        book2.setDescription("初唐年间不二和鱼玄机的故事");
        bookList.add(book2);

        Book book3 = new Book();
        book3.setName("软技能");
        book3.setType("通识读物");
        book3.setDescription("三十封信");
        bookList.add(book3);

        return bookList;
    }
}
