package com.woniuxyBook.protal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.woniuxyBook.protal.service.IBookService;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author woniuxy
 * @since 2023-08-05
 */
@RestController
@RequestMapping("/book")
public class BookController {

    private final IBookService bookServiceImpl;

    @Autowired
    public BookController(IBookService bookServiceImpl){
        this.bookServiceImpl = bookServiceImpl;
    }

}
