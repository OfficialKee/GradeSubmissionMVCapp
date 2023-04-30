package com.ltp;
import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private String role;
    

    public Employee() {
    }

    public Employee(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employee name(String name) {
        setName(name);
        return this;
    }

    public Employee age(int age) {
        setAge(age);
        return this;
    }

    public Employee role(String role) {
        setRole(role);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && age == employee.age && Objects.equals(role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, role);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }
    
}
