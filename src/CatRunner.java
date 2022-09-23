public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Whiskers", 3, 15);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("George", 1, 10);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
