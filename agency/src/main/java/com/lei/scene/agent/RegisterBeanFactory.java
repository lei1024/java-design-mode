package com.lei.scene.agent;

import com.lei.scene.IUserDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * 注册工厂
 *
 * @author leijiahao
 * @date 2023-11-30
 */
public class RegisterBeanFactory implements BeanDefinitionRegistryPostProcessor {
    /**
     * @param beanDefinitionRegistry
     * @throws BeansException
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(MapperFactoryBean.class);
        genericBeanDefinition.setScope("singleton");
        genericBeanDefinition.getConstructorArgumentValues()
                             .addGenericArgumentValue(IUserDao.class);
        BeanDefinitionHolder beanDefinitionHolder = new BeanDefinitionHolder(genericBeanDefinition, "userDao");
        BeanDefinitionReaderUtils.registerBeanDefinition(beanDefinitionHolder, beanDefinitionRegistry);
    }

    /**
     * @param configurableListableBeanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

    }
}
