package com.sankai.st.factory.parse.impl;


import org.springframework.stereotype.Service;

import com.sankai.st.dto.GenStructFileDto;
import com.sankai.st.factory.parse.Parser;

/**
 * mysql 解析
 *
 * @author sankai
 * @since 2023-06-06 23:06:18
 */
@Service
public class OracleParseImpl implements Parser {
    @Override
    public GenStructFileDto parse(String jsonStr) {
        GenStructFileDto genStructFileDto = new GenStructFileDto();
        genStructFileDto.setTableName("oracle 解析内容");
        return genStructFileDto;
    }
}
