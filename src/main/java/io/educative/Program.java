package io.educative;

public class Program {
    public static void main(String[] args){
        CoolPerson someCoolPerson = new CoolPerson("James", "Sanderlin");
        CoolPersonWrapper someCoolPersonWrapper = new CoolPersonWrapper(someCoolPerson);
        someCoolPersonWrapper.sayFullName();
    }

}
