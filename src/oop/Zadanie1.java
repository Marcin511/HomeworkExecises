package oop;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Zadanie1 {
    public static void main(String[] args) {
        Function<String, Employee> toEmployee = (String userline) -> {
            String[] data = userline.split(",");
            Employee employee = new Employee(data[0], data[1], data[2], Integer.parseInt(data[3]));

            return employee;
        };
        Consumer<Employee> employeeConsumer = (String) -> {
            System.out.println();
        };
        Supplier<int[]> array = () -> {
            Random r = new Random();

            int[] a = new int[6];
            for (int i = 0; i < a.length; i++) {
                a[i] = r.nextInt(0, 100);
            }
            return a;
        };
    }
        static class Employee {
            private String name;
            private String lastName;
            private String departament;
            private int yearOfStart;

            public String getName() {
                return name;
            }

            public String getLastName() {
                return lastName;
            }

            public String getDepartament() {
                return departament;
            }

            public int getYearOfStart() {
                return yearOfStart;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public void setDepartament(String departament) {
                this.departament = departament;
            }

            public void setYearOfStart(int yearOfStart) {
                this.yearOfStart = yearOfStart;
            }

            public Employee(String name, String lastName, String departament, int yearOfStart) {
                this.name = name;
                this.lastName = lastName;
                this.departament = departament;
                this.yearOfStart = yearOfStart;

            }
        }

    }


