package com.woniuxyBook.operator.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxyBook.operator.mapper.ReaderMapper;
import com.woniuxyBook.operator.service.IReaderService;
import entity.Reader;
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
public class ReaderServiceImpl extends ServiceImpl<ReaderMapper, Reader> implements IReaderService {

    private final ReaderMapper readerMapper;
    public ReaderServiceImpl(ReaderMapper readerMapper){
        this.readerMapper = readerMapper;
    }

}
