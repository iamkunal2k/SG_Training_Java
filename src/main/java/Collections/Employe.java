package Collections;

import java.util.Comparator;
import java.util.Objects;

public class Employe implements Comparable<Employe> {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    // using comperator


    @Override
    public int compareTo(Employe that) {
        return this.id - that.id;
    }
}
