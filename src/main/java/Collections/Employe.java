package Collections;

public class Employe {

    String name;
    int id;

    Employe(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
