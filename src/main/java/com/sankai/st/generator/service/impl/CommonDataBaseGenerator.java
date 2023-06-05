package com.sankai.st.generator.service.impl;

import com.sankai.st.dto.GenStructFileDto;
import com.sankai.st.generator.service.DataBaseGenerator;

/**
 * 通用数据库生成器
 *
 * @author liuyangyang
 * @since 2023-06-05 23:29
 */
public abstract class CommonDataBaseGenerator implements DataBaseGenerator {
    /**
     * 解析json
     *
     * @param json 数据库的schema信息
     * @return 生成实体文件对应属性dto
     */
    protected abstract GenStructFileDto parseJson(String json);

    /**
     * 生成文件
     *
     * @param json 数据库的schema信息
     */
    @Override
    public void generateFile(String json) {
        GenStructFileDto genStructFileDto = parseJson(json);
        generateFile(genStructFileDto);
    }

    /**
     * 将解析出来的数据结构生成文件
     *
     * @param genStructFileDto 待生成表结构文件实体
     */
    protected void generateFile(GenStructFileDto genStructFileDto) {
        //todo 生成文件
    }
}
