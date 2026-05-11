package controllers;
import models.Person;

public class PersonController {
    public void sortPersonByAge(Person[] personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;

            while (j >= 0 && personas[j].getAge() > aux.getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
        }
    }
    public void sortPersonByName(Person[] personas){
        for (int i = 1; i < personas.length; i++) {
            Person aux = personas[i];
            int j = i - 1;

        while (j >= 0 && personas[j].getName().compareTo(aux.getName()) > 0) {
            personas[j + 1] = personas[j];
            j--;
        }
    }
    }
    public void mostrarArreglo(Person[] personas){
    }
    public void sortPersonByAvrNotas(Person[] personas){
        for (int i = 1; i < personas.length; i++) {
            int index = i;
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[j].getPromedio() < personas[index].getPromedio()) {
                    index = j;
                }
            }
            if(i != index){
                Person aux = personas[i];
                personas[i] = personas[index];
                personas[index] = aux;
            }
        }
    }
}