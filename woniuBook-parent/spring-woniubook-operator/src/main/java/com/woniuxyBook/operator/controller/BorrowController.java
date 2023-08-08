package com.woniuxyBook.operator.controller;


import org.springframework.web.bind.annotation.*;


import com.woniuxyBook.operator.service.IBorrowService;
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
    public BorrowController(IBorrowService borrowServiceImpl){
        this.borrowServiceImpl = borrowServiceImpl;
    }

}
