package controllers;

public void sor PersonByAge(Person[] personas){
    for (int i = 1; i < personas.length; i++) {
        Person aux = personas[i];
        int j = i - 1;

        while (j >= 0 && personas[j].getAge() > aux.getAge()) {
            personas[j + 1] = personas[j];
            j--;
        }
    }
}
