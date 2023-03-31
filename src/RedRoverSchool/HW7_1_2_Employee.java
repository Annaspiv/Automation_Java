package RedRoverSchool;

public class HW7_1_2_Employee {
    String name;
    int age;
    String gender;
    int salary;
    boolean isSameName(HW7_1_2_Employee employee) {
        if (name.equals(employee.name)) {
            return true;
        }
        return false;
    }
}
