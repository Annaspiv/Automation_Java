package RedRoverSchool;

public class HW7_1_1_Person {

    String name;
    int age;
    String gender;

    String getName() {
        if (gender.equals("male")) {
            return "Mr. " + name;
        } else if (gender.equals("female")) {
            return "Mrs. " + name;
        }
        return null;
    }
}
