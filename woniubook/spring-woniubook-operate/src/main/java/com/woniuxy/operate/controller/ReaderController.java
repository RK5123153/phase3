package com.woniuxy.operate.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.woniuxy.operate.dto.AdminDto;
import com.woniuxy.operate.dto.ReaderDto;
import com.woniuxy.operate.entity.Reader;
import com.woniuxy.operate.entity.Reader;
import com.woniuxy.operate.exception.BusinessEnum;
import com.woniuxy.operate.pojos.ResponseResult;
import com.woniuxy.operate.service.IReaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author woniuxy
 * @since 2023-08-05
 */
@Slf4j
@RestController
@RequestMapping("/reader")
public class ReaderController {
    private final IReaderService readerServiceImpl;

    public ReaderController(IReaderService readerServiceImpl) {
        this.readerServiceImpl = readerServiceImpl;
    }

    @PostMapping("/add")
    public ResponseResult add(@RequestBody Reader reader){
        log.info("BookController-add()接收的参数：{}",reader);
        readerServiceImpl.save(reader);
        return ResponseResult.ok();
    }
    @PostMapping("/update")
    public ResponseResult update(@RequestBody Reader reader){
        log.info("BookController-update()接收的参数：{}",reader);

        //System.out.println("b = "+b);
        return readerServiceImpl.updateById(reader)? ResponseResult.ok():ResponseResult.fail(BusinessEnum.SYSTEM_BUSY);
    }
    @PostMapping("/delete")
    public ResponseResult delete(@RequestBody Reader reader){
        log.info("BookController-delete()接收的参数：{}",reader);

        return readerServiceImpl.removeById(reader)? ResponseResult.ok():ResponseResult.fail();
    }
    //log：运行日志 -> File，数据日志（登录日志，操作日志）-->DB
    @GetMapping("/{id}")
    public ResponseResult getById(@PathVariable("id") int id){
        log.info("BookController-getById()接收的参数：{}",id);
        Reader book = readerServiceImpl.getById(id);
        return ResponseResult.ok(book);
    }
    @GetMapping("/findAll")
    public ResponseResult findAll(){
        List<Reader> list = readerServiceImpl.list();
        return ResponseResult.ok(list);
    }

    @GetMapping("/page")
    public ResponseResult find2Page(Integer pageSize,Integer pageNum, ReaderDto readerDto){
        Page<Object> pageRequest = Page.of(pageNum, pageSize);
        Page page = readerServiceImpl.find2Page(pageRequest,readerDto);
        return ResponseResult.ok(page);
    }
}
