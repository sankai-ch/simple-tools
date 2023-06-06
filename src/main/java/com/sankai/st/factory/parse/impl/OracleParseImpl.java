package com.sankai.st.factory.parse.impl;


import com.sankai.st.factory.parse.Parser;

/**
 * mysql 解析
 *
 * @author sankai
 * @since 2023-06-06 23:06:18
 */
public class OracleParseImpl implements Parser<String> {
    @Override
    public String parse(String jsonStr) {
        return "oracle 解析内容";
    }
}
