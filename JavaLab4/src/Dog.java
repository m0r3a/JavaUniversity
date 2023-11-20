public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName(){
        return this.name;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo(){
        String message =
                """
                This dog's name is %s and it is a %s
                """;
        System.out.printf((message) + "%n", this.name, this.breed);
    }
}
