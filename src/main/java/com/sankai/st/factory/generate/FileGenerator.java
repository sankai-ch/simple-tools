package com.sankai.st.factory.generate;

import com.sankai.st.dto.GenStructFileDto;

/**
 * 文件生成器
 *
 * @author sankai
 * @since 2023-06-06 22:06:14
 */
public interface FileGenerator {

    /**
     * 文件生成方法
     * @param genStructFileDto
     */
    void generateFile(GenStructFileDto genStructFileDto);
}
