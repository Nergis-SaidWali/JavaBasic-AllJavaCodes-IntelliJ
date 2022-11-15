package class23;

public interface Person {
    void eat();
}
interface Employee{
    void work();
}

interface SyntaxEmployee extends Employee,Person{
    void createRepl();
}
class Asghar implements SyntaxEmployee{

    @Override
    public void eat() {
        System.out.println("Like to eat grilled fish");
    }

    @Override
    public void work() {
        System.out.println("Teaches batch14");
    }

    @Override
    public void createRepl() {
        System.out.println("creates easy repls");
    }
}