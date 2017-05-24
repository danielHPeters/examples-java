/**
 * © Rafisa Informatik.
 * Alle Rechte Vorbehalten
 */
package javaintroduction.inheritance;

/**
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class InheritanceTest {

    public static void testInheritance() {

        LifeForm lifeForm = new LifeForm();
        Animal animal = new Animal();
        Dog dog = new Dog("sauber");

        lifeForm.makeSound();
        System.out.println(lifeForm.getLegsCount());

        animal.walk();
        animal.makeSound();
        animal.setLegsCount(4);
        System.out.println(animal.getColor());
        System.out.println(animal.getLegsCount());

        dog.makeSound();
        System.out.println(dog.getLooks());
    }

}
