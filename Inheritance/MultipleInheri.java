// First interface
interface Father {
    void showFather();
}

// Second interface
interface Mother {
    void showMother();
}

// Child class implementing both
class Child implements Father, Mother {
    
    public void showFather() {
        System.out.println("This is father side");
    }
    
    public void showMother() {
        System.out.println("This is mother side");
    }
}

// Main class
public class MultipleInheri {
    public static void main(String[] args) {
        Child c = new Child();
        
        c.showFather();
        c.showMother();
    }
}