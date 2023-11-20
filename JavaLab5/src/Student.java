public class Student extends Person{
    private int[] grades =  new int[20];

    public Student(String name, String email, int[] grades) {
        super(name, email);
        this.grades = grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
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
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
