package oop;

import java.io.IOException;
import java.nio.file.*;

public class JavaIO2 {
    public static void main(String[] args) {
        try {
            Files.readAllLines(Paths.get("Directory/sample.csv"))
                    .stream()
                    .map((String line)->{
                        String[] data = line.split(",");
                        Employee employee =  new Employee(data[0],data[1],Integer.parseInt(data[2]));
                        return employee;
                    }).forEach((Employee employee) ->{
                        System.out.println(employee);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

     class Employee {
        String name;
        String lastName;
        int startYear;

        public Employee(String name, String lastName, int startYear) {
            this.name = name;
            this.lastName = lastName;
            this.startYear = startYear;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", startYear=" + startYear +
                    '}';
        }
    }

