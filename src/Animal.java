public class Animal {
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("BAW BAW");
    }
}
 class run {
     public static void main(String[] args) {
         Dog d=new Dog();
         d.eat();
         d.bark();
     }
 }