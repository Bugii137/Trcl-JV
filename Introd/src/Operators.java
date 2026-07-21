public class Operators {
    public static void main(String[] args) {


        //arithmetic
        int x = 78;
        int y = 98;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        int d = 8;
        ++d;
        System.out.println(d);


        //
        int marks = 70;
        marks += 12;
        System.out.println("Total mark = " + marks);

        //logical
        boolean a = true;
        boolean j = false;
        System.out.println("a && j " + (a&&j));



        //math
        int num = Math.max(5,10);
        System.out.println(num);

        double xp = Math.sqrt(67.89685);
        System.out.println(xp);
    }
}
