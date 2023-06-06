package com.sankai.st.generator2;

import com.sankai.st.dto.GenStructFileDto;

/**
 * @author liuyangyang
 * @since 2023-06-06 22:21
 */
public class CommonDataBaseEntityGenerator extends AbstractDataBaseEntityGenerator {

    private SqlJsonParser sqlJsonParser;

    private FileGenerator fileGenerator;


    protected GenStructFileDto parseJson(String json) {
        return sqlJsonParser.parseJson(json);
    }

    protected void generateFile(GenStructFileDto genStructFileDto) {
        fileGenerator.generateFile(genStructFileDto);
    }

    /**
     * @param json
     */
    @Override
    public void generateEntityFile(String json) {
        GenStructFileDto genStructFileDto = parseJson(json);
        generateFile(genStructFileDto);
    }
}
