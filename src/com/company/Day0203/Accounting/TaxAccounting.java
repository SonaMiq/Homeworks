package com.company.Day0203.Accounting;

public class TaxAccounting extends Accounting {

    TaxAccounting(int countOfEmployers,String departmentName){
        super(countOfEmployers,departmentName);
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

    @Override
    public void account() {
        System.out.println("Tax accounting");
    }
}
