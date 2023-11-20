public class Employee {
    private String name;
    private String email;
    private int hourRate;
    private int capacity;
    private int freeDays;

    public Employee(String name, String email, int hourRate, int capacity, int freeDays){
        this.name = name;
        this.email = email;
        this.hourRate = hourRate;
        this.capacity = capacity;
        this.freeDays = freeDays;
    }

    public int calculateDailyIncome(){
        return this.hourRate * this.capacity;
    }

    public int calculateMonthlyIncome(){
        return calculateDailyIncome()*(21-this.freeDays);
    }
}
