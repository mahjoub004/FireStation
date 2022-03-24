package com.fireStation.model2;

import java.util.Arrays;

public class EmployeeParent {
    private EmpInfo empInfo;
    private Skills[] skills;

    public EmployeeParent() {
    }

    public EmployeeParent(EmpInfo empInfo, Skills[] skills) {
        this.empInfo = empInfo;
        this.skills = skills;
    }

    public EmpInfo getEmpInfo() {
        return empInfo;
    }

    public void setEmpInfo(EmpInfo empInfo) {
        this.empInfo = empInfo;
    }

    public Skills[] getSkills() {
        return skills;
    }

    public void setSkills(Skills[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "EmployeeParent{" +
                "empInfo=" + empInfo +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
