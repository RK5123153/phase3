package com.woniuxyBook.operator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxyBook.operator.mapper.BookMapper;
import com.woniuxyBook.operator.service.IBookService;
import entity.Book;
import org.springframework.stereotype.Service;

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
    public BookServiceImpl(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }

}
