package com.workintech.maps.main;

import com.workintech.maps.model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    LinkedList<Employee> employees = new LinkedList<Employee>();
    employees.add(new Employee(1,"Dogancan","Kınık"));
    employees.add(new Employee(1,"Dogancan","Kınık"));
    employees.add(new Employee(2,"Eray","Yıldız"));
    employees.add(new Employee(2,"Eray","Yıldız"));
    employees.add(new Employee(3,"Ahmet","Hilal"));
    employees.add(new Employee(3,"Ahmeyt","Hilal"));
        //System.out.println(employees);
    Map<Integer,Employee> employeeMap =new HashMap<>();
    List<Employee> removedEmployees = new ArrayList<>();

    Iterator iterator = employees.iterator();
    while (iterator.hasNext()){
        Employee employee = (Employee) iterator.next();
        if(employeeMap.containsKey(employee.getId())){
            removedEmployees.add(employee);

        }else{
            employeeMap.put(employee.getId(),employee);
        }

    }

        for(Employee employee: removedEmployees){
            employees.remove(employee);
        }
        System.out.println(employees);

    }
}