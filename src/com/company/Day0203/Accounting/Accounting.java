package com.company.Day0203.Accounting;

import com.company.Day0203.ITCompany.ITCompany;

public class Accounting extends ITCompany {

    Accounting(int countOfEmployers,String departmentName){
        super(countOfEmployers,departmentName);
    }

    @Override
    public void account() {
        System.out.println("account");
    }

    @Override
    public int getCountOfEmployers() {
        return super.getCountOfEmployers();
    }

    @Override
    public String getDepartmentName() {
        return super.getDepartmentName();
    }

    @Override
    public void setCountOfEmployers(int countOfEmployers) {
        super.setCountOfEmployers(countOfEmployers);
    }

    @Override
    public void setDepartmentName(String departmentName) {
        super.setDepartmentName(departmentName);
    }
}
