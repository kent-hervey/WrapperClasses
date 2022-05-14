package io.educative;

public class CoolPersonWrapper {

    private CoolPerson coolPerson;
    private String fullName;

    public CoolPersonWrapper(CoolPerson coolPerson){
        this.coolPerson = coolPerson;
        this.fullName = coolPerson.getFirstName() + " " + coolPerson.getLastName();
    }

    public void sayFullName(){
        System.out.println("My name is " + this.fullName);
    }

    public void sayFirstName(){
        this.coolPerson.sayFirstName();
    }

    public void sayLastName(){
        this.coolPerson.sayLastName();
    }

    public CoolPerson getCoolPerson() {
        return coolPerson;
    }

    public void setCoolPerson(CoolPerson coolPerson) {
        this.coolPerson = coolPerson;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
