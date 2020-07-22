/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0056;

/**
 *
 * @author PHONG VU
 */
public class Worker {

    public String id;
    public String name;
    public int age;
    public int salary;
    public String WorkLocation;

    public Worker() {
    }

    public Worker(String id, String name, int age, int salary, String WorkLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.WorkLocation = WorkLocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return WorkLocation;
    }

    public void setWorkLocation(String WorkLocation) {
        this.WorkLocation = WorkLocation;
    }

    @Override
    public String toString() {
        return String.format("%-3s %-5s %-3d %-6d", id, name, age, salary);
    }

}
