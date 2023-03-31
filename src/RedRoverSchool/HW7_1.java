package RedRoverSchool;

import java.lang.reflect.Array;

public class HW7_1 {
    public static void main(String[] args) {
        //Задача №1 Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
        HW7_1_1_Person olya = new HW7_1_1_Person();
        olya.name = "Olya";
        olya.age = 42;
        olya.gender = "female";
        System.out.println(olya.getName());

        //Задача №2 Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
        // Класс должен иметь метод isSameName(Employee employee) который возвращает true,
        // если у сотрудника у которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.
        HW7_1_2_Employee employee1 = new HW7_1_2_Employee();
        employee1.name = "Hanna";
        employee1.salary = 2000;
        HW7_1_2_Employee employee2 = new HW7_1_2_Employee();
        employee2.name = "Hanna";
        employee2.salary = 3000;
        System.out.println(employee1.isSameName(employee2));

        //Задача №3 Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
        // метод должен возвращать сумму зарплат всех сотрудников из массива переданного в качестве аргумента вызова метода.
        HW7_1_2_Employee[] employeeArray = {employee1, employee2};
        HW7_1_3_Salary salary = new HW7_1_3_Salary();
        System.out.println(salary.getSum(employeeArray));
    }
}
