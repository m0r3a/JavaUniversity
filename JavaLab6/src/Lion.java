public class Lion extends Animal{
    private final String name = "Lion";
    @Override
    public void eat() {
        System.out.println(this.name + " is eating.");
    }

    @Override
    public void sound() {
        System.out.println(this.name + " is roaring.(Lion)");
    }
}
