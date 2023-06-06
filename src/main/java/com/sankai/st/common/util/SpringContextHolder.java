package com.sankai.st.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * springcontext辅助类
 *
 * @author sankai
 * @since 2023-06-06 23:06:14
 */
@Component
public class SpringContextHolder implements ApplicationContextAware {
    private static ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
    }

    /**
     * 返回bean实例
     * @param beanName
     * @return
     * @param <T>
     */
    public static <T> T getBean(String beanName) {
        return null == applicationContext ? null : (T) applicationContext.getBean(beanName);
    }
}
