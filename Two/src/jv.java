import java.util.ArrayList;
import java.util.Collections;

public class jv {
    public static void main(String[] args) {
        ArrayList<String> car = new ArrayList<String>();

        car.add("vitz");
        car.add("demio");
        car.add("note");

        Collections.sort(car);
        for (String i : car) {
            System.out.println(i);
        }
    }

}
