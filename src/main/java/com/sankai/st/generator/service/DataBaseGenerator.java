package com.sankai.st.generator.service;

/**
 * 实体生成器
 *
 * @author liuyangyang
 * @since 2023-06-05 23:27
 */
public interface DataBaseGenerator {

    /**
     * 生成文件
     *
     * @param json 数据库的schema信息
     */
    void generateFile(String json);
}
