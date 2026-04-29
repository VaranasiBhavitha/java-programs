class Animal {
    void show() {
        System.out.println("This is Animal");
    }
}

class Dog extends Animal {
    void show() {
        super.show();
        System.out.println("This is Dog");
    }
}

public class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}