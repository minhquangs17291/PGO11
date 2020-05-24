package PGO11.Task3;

public class Person {
    public String firstName;
    public String lastName;
    public int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.birthdayYear = birthdayYear;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public int getAge() {
        return (2020-this.birthdayYear);
    }
}
