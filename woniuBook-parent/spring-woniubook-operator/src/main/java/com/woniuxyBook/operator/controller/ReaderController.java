package com.woniuxyBook.operator.controller;


import org.springframework.web.bind.annotation.*;

import com.woniuxyBook.operator.service.IReaderService;
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
    public ReaderController(IReaderService readerServiceImpl){
        this.readerServiceImpl = readerServiceImpl;
    }

}
