package javaintroduction.inheritance;

/**
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Dog extends Animal {

    /**
     * 
     */
    private String looks = "gross";

    /**
     * 
     * @param gepflegt 
     */
    public Dog(String gepflegt) {
        this.looks = gepflegt;
    }

    /**
     *
     * @return
     */
    public String getLooks() {
        return looks;
    }

    /**
     * 
     * @param looks 
     */
    public void setLooks(String looks) {
        this.looks = looks;
    }

    /**
     * 
     */
    @Override
    public void makeSound() {
        System.out.println("wuff");
    }

}
