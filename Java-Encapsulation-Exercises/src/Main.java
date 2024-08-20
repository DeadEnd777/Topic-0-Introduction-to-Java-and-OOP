import exercise1.Person;

/*
Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.
*/

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Juan Perez", 24,"Venezuela");
        System.out.println("Hola, mi nombre es " + person.getName() + ", tengo " + person.getAge() + " año/s y soy de " + person.getCountry());
    }
}