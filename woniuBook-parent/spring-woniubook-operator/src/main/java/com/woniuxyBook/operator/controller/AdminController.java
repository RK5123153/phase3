package com.woniuxyBook.operator.controller;


import entity.Book;
import org.springframework.web.bind.annotation.*;
import com.woniuxyBook.operator.service.IAdminService;
import org.springframework.web.bind.annotation.RestController;
import result.Result;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author woniuxy
 * @since 2023-08-05
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    private final IAdminService adminServiceImpl;

    public AdminController(IAdminService adminServiceImpl) {
        this.adminServiceImpl = adminServiceImpl;
    }




}
