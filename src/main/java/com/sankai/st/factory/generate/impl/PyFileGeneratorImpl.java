package com.sankai.st.factory.generate.impl;

import org.springframework.stereotype.Service;

import com.sankai.st.dto.GenStructFileDto;
import com.sankai.st.factory.generate.FileGenerator;

/**
 * java文件生成器
 *
 * @author sankai
 * @since 2023-06-06 23:06:16
 */
@Service
public class PyFileGeneratorImpl implements FileGenerator {


    @Override
    public void generateFile(GenStructFileDto genStructFileDto) {
        System.out.println("py 文件生成");
    }
}
