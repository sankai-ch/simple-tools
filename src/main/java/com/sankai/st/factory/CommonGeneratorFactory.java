package com.sankai.st.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sankai.st.dto.GenStructFileDto;
import com.sankai.st.factory.generate.FileGenerator;
import com.sankai.st.factory.parse.Parser;
import com.sankai.st.generator.service.DataBaseEntityGenerator;

/**
 * 公共生成工厂
 *
 * @author sankai
 * @since 2023-06-06 23:06:05
 */
@Component
public class CommonGeneratorFactory extends AbstractGeneratorFactory {

    private Map<String, Parser> parseMap = new ConcurrentHashMap<>();

    private Map<String, FileGenerator> fileGeneratorMap = new ConcurrentHashMap<>();
    @Autowired
    public void setServiceMap(Map<String, Parser> parseMap, Map<String, FileGenerator> fileGeneratorMap) {
        this.parseMap = parseMap;
        this.fileGeneratorMap = fileGeneratorMap;
    }

    @Override
    public Parser createParse(String serviceName) {
        return parseMap.get(serviceName);
    }

    @Override
    public FileGenerator createFileGenerator(String serviceName) {
        return fileGeneratorMap.get(serviceName);
    }

    @Override
    public void doGen(String parseServiceName, String fileServiceName) {
        GenStructFileDto parse = createParse("mysqlParseImpl").parse("11");
        createFileGenerator("javaFileGeneratorImpl").generateFile(parse);
    }

}
