package com.company.Day0203.Marketing;

import com.company.Day0203.ITCompany.ITCompany;

 public class Marketing extends ITCompany {

    protected Marketing(int countOfEmployers,String departmentName){
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

     public void marketing() {
        System.out.println("marketing");
    }
}
