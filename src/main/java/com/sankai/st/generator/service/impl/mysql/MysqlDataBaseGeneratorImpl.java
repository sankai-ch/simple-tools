package com.sankai.st.generator.service.impl.mysql;

import com.sankai.st.dto.GenStructFileDto;
import com.sankai.st.generator.service.impl.CommonDataBaseGenerator;
import org.springframework.stereotype.Service;

/**
 * mysql数据库实体生成器
 *
 * @author liuyangyang
 * @since 2023-06-05 23:28
 */
@Service("mysqlDataBaseGenerator")
public class MysqlDataBaseGeneratorImpl extends CommonDataBaseGenerator {


    /**
     * 解析json
     *
     * @param json 数据库的schema信息
     * @return 生成实体文件对应属性dto
     */
    @Override
    protected GenStructFileDto parseJson(String json) {
        return null;
    }

    /**
     * 生成文件
     *
     * @param genStructFileDto 待生成表结构文件实体
     */
    @Override
    protected void generateFile(GenStructFileDto genStructFileDto) {
        super.generateFile(genStructFileDto);
    }
}
