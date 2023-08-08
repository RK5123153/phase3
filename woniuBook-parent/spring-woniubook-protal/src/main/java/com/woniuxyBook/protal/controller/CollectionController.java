package com.woniuxyBook.protal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.woniuxyBook.protal.service.ICollectionService;
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
@RequestMapping("/collection")
public class CollectionController {

    private final ICollectionService collectionServiceImpl;

    @Autowired
    public CollectionController(ICollectionService collectionServiceImpl){
        this.collectionServiceImpl = collectionServiceImpl;
    }

}
