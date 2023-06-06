package com.sankai.st.generator2;

import com.sankai.st.dto.GenStructFileDto;

/**
 * @author liuyangyang
 * @since 2023-06-06 22:23
 */
public interface SqlJsonParser {
    GenStructFileDto parseJson(String json);
}
