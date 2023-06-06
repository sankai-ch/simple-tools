package com.sankai.st.factory;

import org.springframework.stereotype.Component;

import com.sankai.st.common.util.SpringContextHolder;
import com.sankai.st.factory.generate.FileGenerator;
import com.sankai.st.factory.parse.Parser;

/**
 * 公共生成工厂
 *
 * @author sankai
 * @since 2023-06-06 23:06:05
 */
@Component
public class CommonGeneratorFactory extends AbstractGeneratorFactory {
    /**
     * 解析器
     */
    private Parser parser;
    /**
     * 文件生成器
     */
    private FileGenerator fileGenerator;

    @Override
    protected Parser createParse(String serviceName) {
        return SpringContextHolder.getBean(serviceName);
    }

    @Override
    protected FileGenerator createFileGenerator(String serviceName) {
        return SpringContextHolder.getBean(serviceName);
    }
}
