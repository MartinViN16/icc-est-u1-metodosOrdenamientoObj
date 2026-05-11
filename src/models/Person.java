package models;

public class Person {
    private String name;
    private int age;
    private int[] notas;

    public Person(String name, int age, int[] par1) {
        this.name = name;
        this.age = age;
        this.notas = par1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }   

    public void setAge(int age) {
        this.age = age;
    }   

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Promedio: " + getPromedio();
    }

    public int getPromedio() {
        if (notas == null || notas.length == 0) {
            return 0;
        }
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

}