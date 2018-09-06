package zad4;

import java.util.Calendar;


public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private Calendar date;
    private int height;

    public Student(String name, String lastName, Calendar date, int height) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDate() {
        int day = this.date.get(Calendar.DAY_OF_MONTH);
        int month = this.date.get(Calendar.MONTH);
        int year = this.date.get(Calendar.YEAR);
        if (month + 1 < 10) {
            return day + "-0" + (month + 1) + "-" + year;
        } else
            return day + "-" + (month + 1) + "-" + year;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + getDate() +
                ", height=" + height +
                '}';
    }

    public int compareTo(Student s) {
        int comparison = Integer.compare(this.date.get(Calendar.YEAR), s.date.get(Calendar.YEAR));
        if (this.date.get(Calendar.YEAR) != s.date.get(Calendar.YEAR)) {
            return comparison;
        }

        comparison = this.lastName.substring(0, 1).compareTo(s.lastName.substring(0, 1));
        if (comparison != 0) {
            return comparison;
        }

        return Integer.compare(s.height, this.height);

    }
}
