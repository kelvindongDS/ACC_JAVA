package com.github.day2;


import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Employee {


    String name;
    String year;
    String gender;
    String address;
    Float salary;

    public  Employee(String _name, String _year, String _gender, String _address , Float _salary)
    {
        name = _name;
        year= _year;
        gender = _gender;
        address = _address;
        salary = _salary;
    }


}
