package academy.belhard.entity;

import academy.belhard.entity.Person;

public class User extends Person {
    private String email;
    private String password;

    public User (String firstName, String lastName, String email, String password){
        super (firstName, lastName);
        this.email = email;
        this.password = password;
    }

    public String getFullInfo(){
       return "Имя: " + firstName + " " + lastName + "\n" + "E-mail: " + email;
    }
    public boolean isPasswordCorrect(String password){
        System.out.println("Правильно ли введен пароль?");
        return this.password.equals(password);
    }

}
