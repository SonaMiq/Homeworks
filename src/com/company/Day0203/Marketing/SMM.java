package com.company.Day0203.Marketing;

public class SMM extends Marketing{

    SMM(int countOfEmployers,String departmentName){
        super(countOfEmployers,departmentName);
    }

    @Override
    public String getDepartmentName() {
        return super.getDepartmentName();
    }

    @Override
    public int getCountOfEmployers() {
        return super.getCountOfEmployers();
    }

    @Override
    public void setDepartmentName(String departmentName) {
        super.setDepartmentName(departmentName);
    }

    @Override
    public void setCountOfEmployers(int countOfEmployers) {
        super.setCountOfEmployers(countOfEmployers);
    }

    @Override
    public void marketing() {
        System.out.println("SMM Marketing");
    }
}
