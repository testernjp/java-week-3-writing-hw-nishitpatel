package printprogrammewritting_week3;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | DA 8% : 2250.0 |
 * | TA 9% : 2000.0 |
 * | PF - 20%; : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Programme_05_SalarySlip {
    public static void main(String[] args) {
        // Scanner declaration for reading from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your EmployeeID: ");
        int employeeID = scanner.nextInt();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculating HRA, DA, TA and PF
        double HRA = calculateHRA(basicSalary);
        double DA = calculateDA(basicSalary);
        double TA = calculateTA(basicSalary);
        double PF = calculatePF(basicSalary);

        // Calculating the gross salary
        double grossSalary = basicSalary + HRA + DA + TA - PF;
        System.out.println("-------------------------------------");
        System.out.println("| Salary Slip                       |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Employee ID:" + employeeID + "                |");
        System.out.println("| Employee Name:" + name + "                     |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Basic Salary: " + basicSalary + "               |");
        System.out.println("| HRA 10%     : " + HRA + "              |");
        System.out.println("| TA 8%       : " + TA + "               |");
        System.out.println("| DA 9%       : " + DA + "               |");
        System.out.println("| PF -20%     : " + PF + "               |");
        System.out.println("|---------------------------------------|");
        System.out.println("| Gross Salary: " + grossSalary + "              |");
        System.out.println("|---------------------------------------|");
        // Closing the scanner object
        scanner.close();
    }

    // Calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    // Calculating DA
    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8) / 100;
    }

    // Calculating TA
    public static double calculateTA(double basicSalary) {
        return (basicSalary * 9) / 100;
    }

    // Calculating PF
    public static double calculatePF(double basicSalary) {
        return (basicSalary * 20) / 100;
    }


}
