package com.sankai.st.factory.generate;

/**
 * 文件生成器
 *
 * @author sankai
 * @since 2023-06-06 22:06:14
 */
public interface FileGenerator<GenStructFileDto> {

    /**
     * 文件生成方法
     * @param genStructFileDto
     */
    void generateFile(GenStructFileDto genStructFileDto);
}
