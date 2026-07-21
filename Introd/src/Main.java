public class Main {
    public static void main(String[] args) {
        String name;
        name = "Jane ";
        System.out.println("Hello " + name);


        //statements
        System.out.println("Hello, world");
        System.out.println("This is my java learning path");
        System.out.println("Java is object oriented");

        //prrint numbers
        System.out.println(500);


        //concatenation
        String x = "Dennis";
        String y = " Ochul";
                String z = x + y;
        System.out.println("Full name: " + z);

        //multiple variables
        int a = 89, v = 20, p = 45;
        System.out.println(a+v+p);


        int sID= 1757;
        int sAge= 34;
        float sFee = 123.45f;
        char fName = 'F';

        System.out.println("ID: " + sID);
        System.out.println("Age: " + sAge);
        System.out.println("Fee: " + sFee);
        System.out.println("nChar: " + fName);



        //area of a rectangle
        int length = 45, width=20;
        int area;
        System.out.println("Area: " + (length * width));

        //boolean
        boolean isJavaFun = true;
        System.out.println(isJavaFun);


        //var
        var t = 89;
        System.out.println(t);


        //casting - widening
        int yes = 203;
        double no = yes;
        System.out.println(yes);
        System.out.println(no);

        //narrow casting
        double hef = 67.8d;
        int jfk = (int) hef;
        System.out.println(hef);
        System.out.println(jfk);





    }
}