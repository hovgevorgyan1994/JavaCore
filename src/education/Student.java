package education;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String email;
    private String phoneNumber;
    private Lesson[] lessons;

    Student(String name, String surname, int age,
            String email, String phoneNumber, Lesson... lessons) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.lessons = lessons;
    }
    Student(Lesson...lessons){
        this.lessons = lessons;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Lesson[] getLesson() {
        return lessons;
    }

    public void setLesson(Lesson[] lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lesson='" + Arrays.toString(lessons) + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname)
                && Objects.equals(email, student.email) && Objects.equals(phoneNumber, student.phoneNumber) && Arrays.equals(lessons, student.lessons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, email, phoneNumber, Arrays.hashCode(lessons));
    }
}