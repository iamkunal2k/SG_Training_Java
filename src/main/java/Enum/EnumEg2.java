// using method and constructor

package Enum;

enum Color {
    Red,
    Green,
    Blue;

    private Color() {
        System.out.println("Constructor "+this.toString());
    }

    public void ColorInfo() {
        System.out.println("Universal Color");
    }
}


public class EnumEg2 {

    public static void main(String[] args) {

        Color c1 = Color.Blue;
        System.out.println(c1);
        c1.ColorInfo();
    }
}
