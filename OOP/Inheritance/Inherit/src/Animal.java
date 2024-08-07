public class Animal {
    String name;
    void eat() {
        System.out.println("eat");
    }
}
//Subclass
class Dog extends Animal {
    void bark(){
        System.out.println("bark");
    }
    void play(){
        System.out.println("play");
    }
}
