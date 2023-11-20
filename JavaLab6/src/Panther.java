public class Panther extends Animal{
    private final String name = "Panther";

    @Override
    public void eat() {
        System.out.println(this.name + " is eating.");
    }

    @Override
    public void sound() {
        System.out.println(this.name + " is roaring.(Panther)");
    }
}
