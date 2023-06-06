package com.sankai.st.factory.generate.impl;

import com.sankai.st.dto.GenStructFileDto;

/**
 * java文件生成器
 *
 * @author sankai
 * @since 2023-06-06 23:06:16
 */
public class JavaFileGenerator implements FileGenerator<GenStructFileDto> {


    @Override
    public void generateFile(GenStructFileDto genStructFileDto) {
        System.out.println("java 文件生成");
    }
}
