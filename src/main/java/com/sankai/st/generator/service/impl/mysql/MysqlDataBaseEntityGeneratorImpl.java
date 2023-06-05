package com.sankai.st.generator.service.impl.mysql;

import com.sankai.st.dto.GenStructFileDto;
import com.sankai.st.generator.service.impl.CommonDataBaseEntityGenerator;
import org.springframework.stereotype.Service;

/**
 * mysql数据库实体生成器
 *
 * @author liuyangyang
 * @since 2023-06-05 23:28
 */
@Service("mysqlDataBaseGenerator")
public class MysqlDataBaseEntityGeneratorImpl extends CommonDataBaseEntityGenerator {


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


}
