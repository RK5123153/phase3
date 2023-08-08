package com.woniuxy.operate.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

import java.util.Collections;

public class  CodeGenerator {
    public static void main(String[] args) {
        //修改url username password
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/wnbook", "root", "root")
                .globalConfig(builder -> {
                    builder.author("woniuxy") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .dateType(DateType.ONLY_DATE).disableOpenDir().outputDir("E:\\code\\java"); // 指定输出目录
                }).packageConfig(builder -> {
                    builder.parent("com.woniuxy.operate") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\code\\resources\\mapper")); // 设置mapperXml生成路径
                }).strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok();
                    builder.controllerBuilder().enableHyphenStyle().enableRestStyle();
                    builder.addInclude("admin", "book", "borrow", "collection", "reader") // 设置需要生成的表名
                            .addTablePrefix(""); // 设置过滤表前缀
                })
                .execute();
    }
}
