package com.woniuxyBook.protal.service.impl;

import com.woniuxyBook.protal.mapper.AdminMapper;
import com.woniuxyBook.protal.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Admin;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

    private final AdminMapper adminMapper;

    @Autowired
    public AdminServiceImpl(AdminMapper adminMapper){
        this.adminMapper = adminMapper;
    }

}
