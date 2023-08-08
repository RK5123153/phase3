package com.woniuxy.operate.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.woniuxy.operate.dto.AdminDto;
import com.woniuxy.operate.dto.BookDto;
import com.woniuxy.operate.entity.Admin;
import com.woniuxy.operate.entity.Book;
import com.woniuxy.operate.mapper.AdminMapper;
import com.woniuxy.operate.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Page find2Page(Page pageRequest, AdminDto adminDto) {
        //创建一个条件查询器
        LambdaQueryWrapper<Admin> lqw = new LambdaQueryWrapper<>();
        lqw.likeRight(StringUtils.hasLength(adminDto.getName()),Admin::getName,adminDto.getName());
        lqw.likeRight(StringUtils.hasLength(adminDto.getPhone()),Admin::getPhone,adminDto.getPhone());
        //根据ID进行降序查询
        lqw.orderByDesc(Admin::getAdminId);
        Page page = adminMapper.selectPage(pageRequest, lqw);
        return page;
    }
}
