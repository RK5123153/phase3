package com.woniuxyBook.protal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.woniuxyBook.protal.service.IBorrowService;
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
@RequestMapping("/borrow")
public class BorrowController {

    private final IBorrowService borrowServiceImpl;

    @Autowired
    public BorrowController(IBorrowService borrowServiceImpl){
        this.borrowServiceImpl = borrowServiceImpl;
    }

}
