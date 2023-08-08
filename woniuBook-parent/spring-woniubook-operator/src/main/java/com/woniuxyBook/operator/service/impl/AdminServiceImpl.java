package com.woniuxyBook.operator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxyBook.operator.mapper.AdminMapper;
import com.woniuxyBook.operator.service.IAdminService;
import entity.Admin;
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
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

    private final AdminMapper adminMapper;
    public AdminServiceImpl(AdminMapper adminMapper){
        this.adminMapper = adminMapper;
    }

}
