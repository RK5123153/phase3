package com.woniuxyBook.protal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.woniuxyBook.protal.service.IReaderService;
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
@RequestMapping("/reader")
public class ReaderController {

    private final IReaderService readerServiceImpl;

    @Autowired
    public ReaderController(IReaderService readerServiceImpl){
        this.readerServiceImpl = readerServiceImpl;
    }

}
