package com.woniuxyBook.protal.mapper;

import entity.Book;
import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author woniuxy
 * @since 2023-08-05
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
