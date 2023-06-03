package com.sankai.st.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.sankai.st.dto.GenStructFileDto;

/**
 * 数据库实体文件生成器抽象类
 *
 * @author sankai
 * @since 2023-06-03 13:06:41
 */
@Component
public abstract class AbstractDataBaseDOGenerator<GenStructFileDto> {
    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractDataBaseDOGenerator.class);

    /**
     * 1、json解析
     * 2、文件输出
     * @param json 包含数据库信息
     * @return true or false
     */
    public boolean doGen(String json) {
        try {
            // 解析出不同数据库的实体
            GenStructFileDto parse = parse(json);

            // 生成文件
            return genFile(parse);
        } catch (Exception e) {
            LOGGER.error("生成文件异常", e);

            return false;
        }
    }

    /**
     * 解析出数据表信息实体
     * @param json  数据库涵盖的基本信息
     * @return  表基本数据
     */
    protected abstract GenStructFileDto parse(String json);

    /**
     * 生成实体文件、后续有需要在具体的子类中自行实现其他语言的实体格式文件
     * @param genStructFileDto 待生成表结构文件实体
     * @return
     */
    protected abstract boolean genFile(GenStructFileDto genStructFileDto);
}
