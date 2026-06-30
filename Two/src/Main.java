public class Main {
    public static void main(String[] args) {

        //.length()
        String one = "Encompass one on one.";
        System.out.println(one.length());


        // .toUppercase()
        String goat = "pneumonoultramicroscopicsilicovolcanoconiosi";
        System.out.println(goat.toUpperCase());


        //.toLowercase()
        String lower = "PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSI";
        System.out.println(lower.toLowerCase());


        //.indexOf()
        String index = "Encapsulation";
        System.out.println(index.indexOf("u"));


        //.charAt()
        String yee = "Running wild";
        System.out.println(yee.charAt(4));


        //trim()
        String durban = " locks ";
        System.out.println(durban.trim());



        //.concat()
        String name = "Jessy";
        String place = " Koinange";
        System.out.println(name.concat(place));


        //.substring()
        String w = "Geriinnegi";
        System.out.println(w.substring(0,4));
    }
}