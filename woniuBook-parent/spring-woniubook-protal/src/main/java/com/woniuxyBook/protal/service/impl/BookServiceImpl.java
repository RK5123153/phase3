package com.woniuxyBook.protal.service.impl;

import com.woniuxyBook.protal.mapper.BookMapper;
import com.woniuxyBook.protal.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author woniuxy
 * @since 2023-08-05
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }

}
