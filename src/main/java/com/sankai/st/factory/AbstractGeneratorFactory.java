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
     * 根据服务名称创建对应解析器
     *
     * @param serviceName 服务名称
     * @return  具体解析那个工厂
     */
    protected abstract Parser createParse(String serviceName);

    /**
     * 根据服务名称创建创建文件生成器
     * @param serviceName   服务名称
     * @return
     */
    protected abstract FileGenerator createFileGenerator(String serviceName);

    /**
     * 开始生成
     * @param parseServiceName  解析器服务名
     * @param fileServiceName   文件生成服务名
     */
    protected abstract void doGen(String parseServiceName, String fileServiceName);
}
