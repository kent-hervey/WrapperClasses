package io.educative;

public class CoolPerson {

    private String firstName;
    private String lastName;

    public CoolPerson(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void sayFirstName()
    {
        System.out.println("My first name is " + this.firstName);
    }

    public void sayLastName()
    {
        System.out.println("My last name is " + this.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
