import java.util.Scanner;

// Using Employee.java class

public class Lab5Ex1 {
    public static void main(String[] args) {
        int n;
        Employee[] employees = new Employee[50];
        int[] salaries = new int[50];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the number of employees:");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            String message =
                    """
                    %nEmployee #%d:
                    """;
            System.out.printf((message), i + 1);

            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter email:");
            String email = scanner.nextLine();
            System.out.println("Enter hourRate:");
            int hourRate = scanner.nextInt();
            System.out.println("Enter work hours per day:");
            int capacity = scanner.nextInt();
            System.out.println("Enter free days:");
            int freeDays = scanner.nextInt();

            employees[i] = new Employee(name, email, hourRate, capacity, freeDays);
            salaries[i] = employees[i].calculateMonthlyIncome();
        }

        scanner.close();

        for(int i = 0; i < n; i++ ){
            String message =
                    """
                    Employee #%d has a montly slary of %d $
                    """;
            System.out.printf((message), i+1,salaries[i]);
        }
    }
}