package com.woniuxyBook.protal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.woniuxyBook.protal.service.IAdminService;
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
@RequestMapping("/admin")
public class AdminController {

    private final IAdminService adminServiceImpl;

    @Autowired
    public AdminController(IAdminService adminServiceImpl){
        this.adminServiceImpl = adminServiceImpl;
    }

}
