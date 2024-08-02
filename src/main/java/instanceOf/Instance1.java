package instanceOf;

class vehicle{

}

class car extends vehicle {

    car() {

    }
}

public class Instance1 {

    public static void main(String args[]) {

        car c = new car();
        System.out.println(c instanceof vehicle);
    }

}

