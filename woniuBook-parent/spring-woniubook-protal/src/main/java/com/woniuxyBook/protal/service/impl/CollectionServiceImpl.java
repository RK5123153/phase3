package com.woniuxyBook.protal.service.impl;

import com.woniuxyBook.protal.mapper.CollectionMapper;
import com.woniuxyBook.protal.service.ICollectionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Collection;
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
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Collection> implements ICollectionService {

    private final CollectionMapper collectionMapper;

    @Autowired
    public CollectionServiceImpl(CollectionMapper collectionMapper){
        this.collectionMapper = collectionMapper;
    }

}
