public class Main {
    public static void main(String[] args) {

        //append
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);


        //insert
        StringBuilder car = new StringBuilder("Rnger");
        car.insert(1, "a");
        System.out.println(car);


        //replace
        StringBuilder shape = new StringBuilder("Triangle");
        shape.replace(0,8, "Circle");
        System.out.println(shape);


        //delete
        StringBuilder error = new StringBuilder("Mike doe");
        error.delete(4,8);
        System.out.println(error);

        //reverse
        StringBuilder name = new StringBuilder("Offender");
        name.reverse();
        System.out.println(name);

        try {
            // Open a resource
        } catch (Exception e) {
            // Handle error
        } finally {
            System.out.println("This always runs. Ideal for closing resources.");
        }

    }
}




