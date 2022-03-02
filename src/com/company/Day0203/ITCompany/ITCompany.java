package com.company.Day0203.ITCompany;

import com.company.Day0203.Accounting.Accounting;

public class ITCompany {

    protected int countOfEmployers;
    protected String departmentName;


  protected   ITCompany(int countOfEmployers,String departmentName){
        this.countOfEmployers=countOfEmployers;
        this.departmentName=departmentName;
    }
    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void account(){
        System.out.println("It accounting");
    }
}
