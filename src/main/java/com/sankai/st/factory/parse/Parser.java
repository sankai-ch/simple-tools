package com.sankai.st.factory.parse;

/**
 * 解析器
 *
 * @author sankai
 * @since 2023-06-06 22:06:50
 */
public interface Parser<T> {
    /**
     * 具体解析
     * @param jsonStr
     * @return
     */
    T parse(String jsonStr);
}
