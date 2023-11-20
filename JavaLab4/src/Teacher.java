public class Teacher extends Person{
    private String[] courses =  new String[20];

    public Teacher(String name, String email, String[] courses) {
        super(name, email);
        this.courses = courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String[] getCourses() {
        return courses;
    }
}
