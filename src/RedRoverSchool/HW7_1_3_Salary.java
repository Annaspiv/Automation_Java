package RedRoverSchool;

public class HW7_1_3_Salary {
    int getSum(HW7_1_2_Employee[] employeeArray) {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].salary;
        }
        return sum;
    }
}
