package com.sankai.st.factory.parse.impl;


import com.sankai.st.factory.parse.Parser;

/**
 * mysql 解析
 *
 * @author sankai
 * @since 2023-06-06 23:06:18
 */
public class MysqlParseImpl implements Parser {
    @Override
    public Object parse(String jsonStr) {
        return "mysql 解析内容";
    }
}
