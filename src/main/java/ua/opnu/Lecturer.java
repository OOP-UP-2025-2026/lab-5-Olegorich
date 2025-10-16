package ua.opnu;

public class Lecturer extends Person {

    String department;
    int salary;

    public Lecturer(String surname, String name, int age, String department, int salary) {
        super(surname, name, age);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Викладач кафедри " + department + ", " + surname + " " + name +
                ", вік: " + age + ". Зарплата: " + salary;
    }
}
