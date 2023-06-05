package com.sankai.st.generator.service;

import com.sankai.st.dto.GenStructFileDto;

/**
 * 实体类文件生成器
 *
 * @author liuyangyang
 * @since 2023-06-05 23:48
 */
public interface DataBaseFileGenerator {

    /**
     * 生成文件
     *
     * @param genStructFileDto 待生成表结构文件实体
     */
    void generateFile(GenStructFileDto genStructFileDto);
}
