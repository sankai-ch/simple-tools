package com.sankai.st.factory;

import com.sankai.st.factory.generate.FileGenerator;
import com.sankai.st.factory.parse.Parser;

/**
 * 生成器抽象工厂
 *
 * @author sankai
 * @since 2023-06-06 22:06:10
 */
public abstract class AbstractGeneratorFactory {

    /**
     * 具体解析器
     * @return 工厂对象
     */
    protected abstract Parser createParse(String serviceName);

    /**
     * 创建文件生成器
     * @return  工厂对象
     */
    protected abstract FileGenerator createFileGenerator(String serviceName);

}
