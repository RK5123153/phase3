package com.woniuxyBook.operator.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxyBook.operator.mapper.BorrowMapper;
import com.woniuxyBook.operator.service.IBorrowService;
import entity.Borrow;
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
public class BorrowServiceImpl extends ServiceImpl<BorrowMapper, Borrow> implements IBorrowService {

    private final BorrowMapper borrowMapper;
    public BorrowServiceImpl(BorrowMapper borrowMapper){
        this.borrowMapper = borrowMapper;
    }

}
