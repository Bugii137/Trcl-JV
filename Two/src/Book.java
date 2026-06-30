public class Book {
    public void haveTitle() {
        System.out.println("all Books have a title");
    }
}

class TextBook extends Book{
    public void haveTitle(){
        System.out.println("Front page");
    }
}
class ExerciseBook extends Book{
    public void haveTitle(){
        System.out.println("write here");
    }
}
class Main{
    public static void main(String[] args){
        Book myBook=new Book();
        Book myTextBook=new TextBook();
        Book myExerciseBook=new ExerciseBook();
        myBook.haveTitle();
        myExerciseBook.haveTitle();
        myTextBook.haveTitle();
    }
}



