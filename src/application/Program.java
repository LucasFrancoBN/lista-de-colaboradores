package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("How many employees will be registered? ");
    int numbersOfEmployees = sc.nextInt();
    List<Employee> employees = new ArrayList<>();

    System.out.println();

    registerEmployees(sc, employees, numbersOfEmployees);

    increaseEmployeeSalary(sc, employees);

    System.out.println();

    System.out.println("List of employees:");
    for (Employee e : employees) {
      System.out.println(e.toString());
    }

    sc.close();
  }

  public static  void increaseEmployeeSalary(Scanner sc, List<Employee> employees ) {
    System.out.print("Enter the employee id that will have salary increase :");
    Integer idEmployeeWithIncreaseSalary = sc.nextInt();
    Employee employeeIncreaseSalary = employees.stream().filter(employee -> employee.getId().equals(idEmployeeWithIncreaseSalary)).findFirst().orElse(null);
    if(employeeIncreaseSalary == null) {
      System.out.println("This id does not exist!");
    } else {
      System.out.print("Enter the percentage: ");
      double percentage = sc.nextDouble();
      employeeIncreaseSalary.increaseSalary(percentage);
    }
  }

  public static void registerEmployees(Scanner sc, List<Employee> employees, int numbersOfEmployees) {
    for(int i = 0; i < numbersOfEmployees; i++) {
      System.out.printf("Employee #%d%n", i + 1);
      Integer id = getValidId(sc, employees);
      System.out.print("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.print("Salary: ");
      Double salary = sc.nextDouble();

      Employee employee = new Employee(id, name, salary);
      employees.add(employee);

      System.out.println();
    }
  }

  public static Integer getValidId(Scanner sc, List<Employee> employees) {
    Integer id;
    do {
      System.out.print("Id: ");
      id = sc.nextInt();
      if(isIdAlreadyUsed(employees, id)) {
        System.out.println();
        System.out.println("This id is already in use. Please enter a different one.");
        System.out.println();
      }
    } while (isIdAlreadyUsed(employees, id));
    return id;
  }

  public static boolean isIdAlreadyUsed(List<Employee> employees, Integer id) {
    return employees.stream().anyMatch(employee -> employee.getId().equals(id));
  }
}
