//import controllers.PersonController;
import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        PersonController orden = new PersonController();
        Person[] personas = {
            new Person("Juan", 25, new int[]{10, 15, 20}),
            new Person("Ana", 19, new int[]{15, 15, 20}),
            new Person("Carlos", 30, new int[]{10, 10, 10}),
            new Person("Maria", 22, new int[]{20, 12, 20}),
            new Person("Diego", 15, new int[]{20, 10, 20}),
        };
        System.out.println("Personas sin ordenar");
        orden.mostrarArreglo(personas);
        System.out.println("Personas ordenadas por edad");
        orden.sortPersonByAge(personas);
        System.out.println("Despues de notas");
        orden.sortPersonByAvrNotas(personas);
        for(Person person : personas){
            System.out.println(person);
        }
        PersonController controller = new PersonController();
        controller.sortPersonByAge(personas);
        System.out.println("\nAfter sorting by age:");
        for(Person person : personas){
            System.out.println(person);
        }
    }
}
