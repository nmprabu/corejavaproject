package com.corejavaproject.reflection;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Employee {
    private int employeeId;
    public String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    private void privateMethod(){
        log.info("### Private Method ###");
    }

    public void publicMethod(String str){
        log.info("Public method, str:{}", str);
    }
}