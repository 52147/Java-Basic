class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;

        if (id != employee.id) {
            return false;
        }

        return name != null ? name.equals(employee.name) : employee.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "John Doe");
        Employee employee2 = new Employee(1, "John Doe");
        Employee employee3 = new Employee(2, "Jane Doe");

        // Test equals
        System.out.println("employee1 equals employee2: " + employee1.equals(employee2)); // Should print: true
        System.out.println("employee1 equals employee3: " + employee1.equals(employee3)); // Should print: false

        // Test hashCode
        System.out.println("employee1 hashCode: " + employee1.hashCode());
        System.out.println("employee2 hashCode: " + employee2.hashCode());
        System.out.println("employee3 hashCode: " + employee3.hashCode());

        // When two objects are equal, their hashCodes should also be equal
        System.out.println("employee1 hashCode equals employee2 hashCode: " + (employee1.hashCode() == employee2.hashCode())); // Should print: true

        // When two objects are not equal, their hashCodes can be the same or different. It's not guaranteed.
        System.out.println("employee1 hashCode equals employee3 hashCode: " + (employee1.hashCode() == employee3.hashCode()));
    }
}
