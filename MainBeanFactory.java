package com.melhamra;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Application {
    public static void main(String[] args) {
        Resource res = new ClassPathResource("Beans.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        MyClass myClass = (MyClass) factory.getBean("myClass");
        System.out.println(myClass.getMyField());
    }
}
