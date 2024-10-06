package com.corejavaproject.reflection;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Log4j2
public class EmployeeMain {
    public static void main(String[] args) throws Exception {
        Employee employee = new Employee(1, "Rahul");

        Class employeeClass = employee.getClass();

        // access private variable
        Field field = employeeClass.getDeclaredField("employeeId");
        field.setAccessible(true);
        field.set(employee, 54);
        log.info(field.get(employee));

        // access public variable
        Field field1 = employeeClass.getDeclaredField("employeeName");
        field1.set(employee, "Regu");
        log.info("Employee name:{}", field1.get(employee));

        // access private method
        Method method = employeeClass.getDeclaredMethod("privateMethod");
        method.setAccessible(true);
        method.invoke(employee);

        // access public method
        Method method1 = employeeClass.getDeclaredMethod("publicMethod", String.class);
        method1.invoke(employee, "Roja");

        // access the declared fields
        Field[] fields = employeeClass.getDeclaredFields();
        for(Field field2: fields){
            log.info("Fieldname:{}", field2.getName());
        }

        // access declared the methods
        Method[] methods = employeeClass.getDeclaredMethods();
        for (Method method2: methods){
            log.info("Method name:{}", method2.getName());
        }

        //access the constructor
        Constructor[] constructors = employeeClass.getDeclaredConstructors();
        for (Constructor constructor: constructors){
            log.info("Constructor name:{}", constructor.getName());
        }

        log.info("################");
        Class employeeClass1 = Class.forName("com.corejavaproject.reflection.Employee");
        Method[] methods1 = employeeClass1.getDeclaredMethods();
        for (Method method2: methods1){
            log.info("Method name:{}", method2.getName());
        }

    }
}

