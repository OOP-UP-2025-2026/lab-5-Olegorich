package ua.opnu;

public class Main {
    public static void main(String[] args) {

        Student oleg = new Student("Gordienko", "Oleg",
                18, "UP-241", 666);
        Student kostya = new Student("Gordienko", "Konstantin",
                22, "UP-202", 228);
        Lecturer fonar = new Lecturer("Fonar", "Liudmila",
                37, "AIDA", 11);
        Lecturer godovich = new Lecturer("Godovichenko", "Nikolay",
                34, "AIDA", 9);


        Person[] people = new Person[10];

        people[0] = oleg;
        people[1] = kostya;
        people[2] = fonar;
        people[3] = godovich;

        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
