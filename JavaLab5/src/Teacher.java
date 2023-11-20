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

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }
}
