package com.github.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Exercise1 {

    private static ArrayList<Employee> initializeObject(ArrayList<List<String>> l)
    {
        ArrayList<Employee> listEmp = new ArrayList<Employee>();

        l.forEach(
                emp -> {
                    listEmp.add(new Employee(emp.get(0),emp.get(1),emp.get(2),emp.get(3), new Float(emp.get(4))));
                }
        );
        return listEmp;
    }

    private static String strOutput(List<Employee> listEmp)
    {
        String str = "Name \t JoiningYear \t Gender \t Address \t Salary \n";
        AtomicReference<String> concatStr = new AtomicReference<>("");
        listEmp.forEach(
                emp -> {
                    concatStr.set(concatStr + "\n" + emp.name + " \t " + emp.year + " \t " + emp.gender
                            + " \t " + emp.address + " \t " + emp.salary + "\n");
                }
        );
        return str + concatStr;
    }

    private static void printOutput(List<Employee> listEmp)
    {

        System.out.format("%30s%30s%30s%30s%30s","Name","JoiningYear","Gender","Address","Salary");
        System.out.println("\n");
        listEmp.forEach(
                emp -> {
                    System.out.format("%30s%30s%30s%30s%30.2f",emp.name,emp.year,emp.gender,emp.address,emp.salary);
                    System.out.println("\n");
                }
        );

    }

    public static void main(String[] args) {
        ArrayList<List<String>>  listStr = new ArrayList<List<String>>();
        listStr.add(Arrays.asList("kelvin", "1993", "M", "Wellington", "160000.01"));
        listStr.add(Arrays.asList("Robert", "1993", "M", "Auckland", "150000"));
        listStr.add(Arrays.asList("Andrew", "1993", "M", "Auckland", "150000"));

        ArrayList<Employee> listEmp = initializeObject(listStr);

//        System.out.println(strOutput(listEmp));
        printOutput(listEmp);

    }

}
