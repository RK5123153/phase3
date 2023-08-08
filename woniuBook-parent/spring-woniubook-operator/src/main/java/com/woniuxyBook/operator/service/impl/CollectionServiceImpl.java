package com.woniuxyBook.operator.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxyBook.operator.mapper.CollectionMapper;
import com.woniuxyBook.operator.service.ICollectionService;
import entity.Collection;
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
public class CollectionServiceImpl extends ServiceImpl<CollectionMapper, Collection> implements ICollectionService {

    private final CollectionMapper collectionMapper;
    public CollectionServiceImpl(CollectionMapper collectionMapper){
        this.collectionMapper = collectionMapper;
    }

}
