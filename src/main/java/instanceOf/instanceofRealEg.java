package instanceOf;

interface  Printable{}

class A implements Printable{
    public void a() {
        System.out.println("A");
    }
}

class B implements Printable {
    public void b() {
        System.out.println("B");
    }
}

class C {

    void call(Printable p) {

        if (p instanceof A) {
            A a1 = (A)p;
            a1.a();
        }

        if (p instanceof B) {
            B b1 = (B) p;
            b1.b();
        }
    }
}

public class instanceofRealEg {

    public static void main(String[] args) {

        Printable p = new A();
        C c1 = new C();

        c1.call(p);
    }

}
