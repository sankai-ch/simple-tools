package com.sankai.st.generator2;

import com.sankai.st.dto.GenStructFileDto;

/**
 * @author liuyangyang
 * @since 2023-06-06 22:42
 */
public abstract class AbstractDataBaseEntityGenerator implements DataBaseEntityGenerator {


    /**
     * @param json
     */
    @Override
    public void generateEntityFile(String json) {
        GenStructFileDto genStructFileDto = parseJson(json);
        generateFile(genStructFileDto);
    }

    protected abstract void generateFile(GenStructFileDto genStructFileDto);

    protected abstract GenStructFileDto parseJson(String json);
}
