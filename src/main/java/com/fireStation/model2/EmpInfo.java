package com.fireStation.model2;

public class EmpInfo {
    private String name;
    private String position;
    private String salary;
    private String age;

    public EmpInfo() {
    }

    public EmpInfo(String name, String position, String salary, String age) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmpInfo{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
