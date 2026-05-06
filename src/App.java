import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        Person[] persona = {
            new Person("Juan", 25),
            new Person("Ana", 19),
            new Person("Carlos", 30),
            new Person("Maria", 22),
            new Person("Diego", 15),
        };
        for(Person person : personas){
            System.out.println(person);
        }
        PersonController controller = new PersonController();
        controller.sortPersonByAge(personas);
    }
}
