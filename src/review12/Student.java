package review12;

import java.util.Objects;

public class Student {
    private String firstname;
    private String lastname;
    private String rollNumber;

    public Student(String firstname, String lastname, String rollNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.rollNumber = rollNumber;
    }

    void printName() {
        System.out.println(firstname + lastname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }
//if we don't override this method, java by default checks the address
// only to figure out objects are same or not
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstname, student.firstname) && Objects.equals(lastname, student.lastname) && Objects.equals(rollNumber, student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, rollNumber);
    }
}



