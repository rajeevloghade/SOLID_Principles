// Example violating SRP
class Employee {
    public void calculateSalary() {
        // calculate employee's pay
    }

    public void calculateWorkingHours() {
        // calculate employee's working hours
    }

    public void saveEmployeeData() {
        // save employee data to database
    }
}

/**
 * In this example, Employee class violates SRP because it handles both calculating salary, working hours and saving data to the database.
 * It should be split into two separate classes.
 */