package com.sankai.st.factory.parse;

import com.sankai.st.dto.GenStructFileDto;

/**
 * 解析器
 *
 * @author sankai
 * @since 2023-06-06 22:06:50
 */
public interface Parser {
    /**
     * 具体解析
     * @param jsonStr
     * @return
     */
    GenStructFileDto parse(String jsonStr);
}
