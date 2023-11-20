import java.util.Scanner;
// using the Dog.java class

public class Exec3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog1 = new Dog("Timmy","Husky");
        Dog dog2 = new Dog("Jacky","Beagle");

        dog1.showInfo();
        dog2.setName("Max");
        dog2.showInfo();
    }
}