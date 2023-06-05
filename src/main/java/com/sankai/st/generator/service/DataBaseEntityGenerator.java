package com.sankai.st.generator.service;

/**
 * 实体类生成器
 *
 * @author liuyangyang
 * @since 2023-06-05 23:27
 */
public interface DataBaseEntityGenerator {

    /**
     * 生成json对应的实体类文件
     *
     * @param json 数据库的schema信息
     */
    void generateFile(String json);
}
