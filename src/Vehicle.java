public class Vehicle  {
    void drive(){
        System.out.println("driving");
    }
    void handBreak (){
        System.out.println("breaking");
    }
    void reverse(){
        System.out.println("reverse!");
    }
}
class car extends Vehicle  {
    void motorRacing(){
        System.out.println("Racing ");
    }
}
class ModernCar extends car{
    void flying (){
        System.out.println("flying");
    }
}
class Boat extends Vehicle{
    void surf (){
        System.out.println("surffing");
    }
}
class ModernBoat extends Boat {
    void LandRide(){
        System.out.println(" Ridding ");

    }
}
class testOutput {
    public static void main(String[] args) {
        ModernCar m = new ModernCar();
        ModernBoat b = new ModernBoat();
        m.drive();m.handBreak();m.reverse();m.motorRacing();m.flying();b.surf();b.LandRide();b.drive();b.handBreak();b.reverse();
    }
}
