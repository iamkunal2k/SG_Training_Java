package instanceOf;

class Vehicle1 { }

class car1 extends Vehicle1 {
    static void method(Vehicle1 a) {
        if (a instanceof car1) {
            car1 d = (car1)a;
            System.out.println("ok downcasting performed");
        }
    }
}

public class DownCastingInstanceof {

    public static void main(String[] args) {

        Vehicle1 a=new car1();
        car1.method(a);


    }
}
