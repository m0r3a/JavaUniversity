public class Tiger extends Animal{
    private final String name = "Tiger";

    @Override
    public void eat() {
        System.out.println(this.name + " is eating.");
    }

    @Override
    public void sound() {
        System.out.println(this.name + " is roaring.(Tiger)");
    }
}
