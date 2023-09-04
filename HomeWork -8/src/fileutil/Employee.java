package fileutil;

import java.io.Serializable;

public class Employee implements Serializable {
    /*
    Serializable yazdıqda jvm Runtime zamanını serializable ilə işarələnmiş class ın
    java dan kənarda işləməsini təmin edir.
     */
    public  static final long serialVersionUID = 75932L;
    private String name;
    private String surname;
    private double salary;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
}
