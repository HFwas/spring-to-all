package com.hfwas.ioc.java.beans;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyEditorSupport;
import java.util.stream.Stream;

/**
 * @ClassName BeanInfoDemo
 * @Description
 * {@link java.beans.BeanInfo } 示例
 * @Author <a href="hfwas1024@gmail.com">HFwas</a>
 * @Date: 5:16 下午
 * @Version: 1.0
 **/
public class BeanInfoDemo {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Person.class, Object.class);
        Stream.of(beanInfo.getPropertyDescriptors())
                .forEach(propertyDescriptor -> {

                    // PropertyDescriptor 允许添加属性编辑器 - PropertyEditor
                    // GUI -> text -> PropertyType
                    // name -> string
                    // age -> integer
                    Class<?> propertyType = propertyDescriptor.getPropertyType();
                    String propertyName = propertyDescriptor.getName();
                    if ("age".equals(propertyName)) { // 为"age"字段/属性添加 PropertyEditor
                        // string -> integer
                        propertyDescriptor.setPropertyEditorClass(StringToIntegerPropertyEditor.class);

                    }

                });
    }

    static class StringToIntegerPropertyEditor extends PropertyEditorSupport {

        public void setAsText(String text) throws java.lang.IllegalArgumentException {
            Integer value = Integer.valueOf(text);
            setValue(value);
        }

    }

}
