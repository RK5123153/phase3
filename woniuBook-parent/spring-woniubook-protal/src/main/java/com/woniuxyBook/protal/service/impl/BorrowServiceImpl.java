package com.woniuxyBook.protal.service.impl;

import com.woniuxyBook.protal.mapper.BorrowMapper;
import com.woniuxyBook.protal.service.IBorrowService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Borrow;
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
public class BorrowServiceImpl extends ServiceImpl<BorrowMapper, Borrow> implements IBorrowService {

    private final BorrowMapper borrowMapper;

    @Autowired
    public BorrowServiceImpl(BorrowMapper borrowMapper){
        this.borrowMapper = borrowMapper;
    }

}
