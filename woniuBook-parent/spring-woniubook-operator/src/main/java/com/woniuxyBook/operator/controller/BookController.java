package com.woniuxyBook.operator.controller;

import entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.woniuxyBook.operator.service.IBookService;
import org.springframework.web.bind.annotation.RestController;
import result.Result;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author woniuxy
 * @since 2023-08-05
 */
@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {

    private final IBookService bookServiceImpl;

    public BookController(IBookService bookServiceImpl) {
        this.bookServiceImpl = bookServiceImpl;
    }

    @GetMapping("/findAll")
    public Result findAll() {
        List<Book> list = bookServiceImpl.list();
        log.info("BookController-findAll()接收的参数：{}",list);
        return Result.ok(list);
    }

    @GetMapping("/get/{id}")
    public Result getById(@PathVariable("id") int id) {
        log.info("BookController-getById()接收的参数：{}",id);
        Book book = bookServiceImpl.getById(id);
        return Result.ok(book);
    }

    @PostMapping("/save")
    public Result save(@RequestBody Book book) {
        log.info("BookController-save()接收的参数：{}",book);
        bookServiceImpl.save(book);
        return Result.ok();
    }

    @PutMapping("/update")
    public Result update(@RequestBody Book book) {
        log.info("BookController-update()接收的参数：{}",book);
        bookServiceImpl.updateById(book);
        return Result.ok();
    }

    @DeleteMapping("/remove")
    public Result remove(@RequestBody Book book) {
        log.info("BookController-remove()接收的参数：{}",book);
        bookServiceImpl.removeById(book);
        return Result.ok();
    }


}
