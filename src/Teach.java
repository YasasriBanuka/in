public class Teach {
    void Teacher (){
        System.out.println("i am studying science very well");
    }
    void child(){
        System.out.println("i like to read Bio technology ");
    }
    void cell (){
        System.out.println("i like to study part of brain very hard ");
    }
}

class student extends Teach  {
    void  techno (){
        System.out.println("i like to read Bio technology");
    }
}
class bio extends student   {
    void  up   () {
        System.out.println("i'm Graduate B.Sc ( Hons) BioMedical Science with Upper Second Class");
    }
}
class microBio extends bio{
    void advanced () {
        System.out.println("it's very Difficult Part is micro Advance Biology");
    }
}
class physics  extends Teach {
    void  phy (){
        System.out.println("Its my Difficult Subject ");
    }
}
class outPut {
    public static void main(String[] args) {
        physics p= new physics();
        microBio m= new microBio ();
        student s= new student();
        p.Teacher();
        p.child();
        p.phy();
        p.cell();
        m.advanced();
        m.up();
        s.techno();
    }
}

