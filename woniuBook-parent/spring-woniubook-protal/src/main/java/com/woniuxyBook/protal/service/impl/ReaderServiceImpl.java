package com.woniuxyBook.protal.service.impl;

import com.woniuxyBook.protal.mapper.ReaderMapper;
import com.woniuxyBook.protal.service.IReaderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Reader;
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
public class ReaderServiceImpl extends ServiceImpl<ReaderMapper, Reader> implements IReaderService {

    private final ReaderMapper readerMapper;

    @Autowired
    public ReaderServiceImpl(ReaderMapper readerMapper){
        this.readerMapper = readerMapper;
    }

}
