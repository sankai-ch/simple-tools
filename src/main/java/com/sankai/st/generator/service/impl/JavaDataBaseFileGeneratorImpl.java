package com.sankai.st.generator.service.impl;

import com.sankai.st.dto.GenStructFileDto;
import com.sankai.st.generator.service.DataBaseFileGenerator;
import org.springframework.stereotype.Service;

/**
 * Java实体类文件生成器
 *
 * @author liuyangyang
 * @since 2023-06-05 23:57
 */
@Service("javaDataBaseFileGenerator")
public class JavaDataBaseFileGeneratorImpl implements DataBaseFileGenerator {
    /**
     * 生成Java文件
     *
     * @param genStructFileDto 待生成表结构文件实体
     */
    @Override
    public void generateFile(GenStructFileDto genStructFileDto) {
        //todo 生成Java实体类
    }
}
