public class Book {
    public void haveTitle() {
        System.out.println("All books have a title");
    }
}

class TextBook extends Book {
    public void haveTitle() {
        System.out.println("Front page");
    }
}

class ExerciseBook extends Book {
    public void haveTitle() {
        System.out.println("Write here");
    }
}

class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        Book myTextBook = new TextBook();
        Book myExerciseBook = new ExerciseBook();

        myBook.haveTitle();
        myTextBook.haveTitle();
        myExerciseBook.haveTitle();
    }
}