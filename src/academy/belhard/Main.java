package academy.belhard;
import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tom", "Hardy");
        person.getFullName();
        User user = new User("Tom", "Hardy","tom.hardy@mail.ru", "password");
        user.getFullInfo();
        System.out.println(user.getFullInfo());
        System.out.println(user.isPasswordCorrect("passard"));
    }
}
