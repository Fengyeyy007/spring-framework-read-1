package com.huifer.source.spring;

import com.huifer.source.spring.bean.Apple;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyEditorSourceCode {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ProertyEditor.xml");
        Apple bean = context.getBean(Apple.class);
        System.out.println(bean.getDate());
    }
}
