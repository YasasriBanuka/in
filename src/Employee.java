public class Employee {
    int Salary =50000;
}
class labour extends Employee {
    int cashe   = 10000;
    public static void main(String[] args) {
        labour l = new labour ();
        System.out.println("Employee salary is"+ " Rs." + l.Salary +".00" + "/=");
        System.out.println(" Labour bounes is "+ "Rs."+ l. cashe  +".00" + "/=");

    }

}