package ua.opnu;

public class Student extends Person {

    String groupName;
    int studentIDNumber;

    public Student(String surname, String name, int age, String groupName, int studentIDNumber) {
        super(surname, name, age);
        this.groupName = groupName;
        this.studentIDNumber = studentIDNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentIDNumber() {
        return studentIDNumber;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setStudentIDNumber(int studentIDNumber) {
        this.studentIDNumber = studentIDNumber;
    }

    @Override
    public String toString() {
        return "Студент групи " + groupName + ", " + surname + " " + name +
                ", вік: " + age + ". Номер студентського квитка: " + studentIDNumber;
    }
}
