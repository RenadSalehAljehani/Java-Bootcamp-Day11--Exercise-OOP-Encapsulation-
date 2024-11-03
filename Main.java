//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //--------------------------------------------- Account Class ---------------------------------------------
        // Account class testing

        // Header
        System.out.println("--------------------------------------------- Account Class ---------------------------------------------");

        // 1. Create a new Account object for the first client (using default constructor)
        Account firstClient = new Account();

        // 2. Set values for the first client using setter
        firstClient.setId("CL-1917651427");
        firstClient.setName("Renad");
        firstClient.setBalance(1000);

        // 3. Get the account info for the first client and print it
        System.out.println("----------- First Client -----------"
                + "\nClient id: " + firstClient.getId()
                +"\nClient name: " + firstClient.getName()
                +"\nClient balance: " + firstClient.getBalance()
                + "\n------------------------------------");

        // 4. Create a new Account object for the second client (using the build in constructor)
        Account secondClient = new Account("CL-1765241382","Meshari",100);

        // 5. Change the second client balance using setter (from 100 to 500)
        secondClient.setBalance(500);

        // 6.Print the second account info using toString method
        System.out.println("----------- Second Client ----------" + secondClient.toString());

        // 7. Var to hold amount
        int amount = 500;

        // 8.  Use the method credit to add money to the first client account
        firstClient.credit(firstClient, amount);

        // 9. Use the method debit to deduct money form the second client account
        secondClient.debit(secondClient, amount);

        // 10. Transfer money from the first client account to the second
        System.out.println(firstClient.transferTo(firstClient,secondClient,amount));


        //--------------------------------------------- Employee Class ---------------------------------------------
        // Employee class testing

        // Header
        System.out.println("\n--------------------------------------------- Employee Class ---------------------------------------------");

        // 1. Create a new Employee object for the first employee (using default constructor)
        Employee firstEmployee = new Employee();

        // 2. Set values for the first employee using setter
        firstEmployee.setId("EMP-1572863528");
        firstEmployee.setName("Saleh");
        firstEmployee.setSalary(20000);

        // 3. Get the info of first employee and print it
        System.out.println("---------- First Employee ----------"
                + "\nEmployee id:: " + firstEmployee.getId()
                +"\nEmployee name: " + firstEmployee.getName()
                +"\nEmployee salary: " + firstEmployee.getSalary()
                + "\n------------------------------------");

        // 4. Create a new Employee object for the second employee (using the build in constructor)
        Employee secondEmployee = new Employee("EMP-1673528373 ","Rama",40000);

        // 5. Change the second employee salary using setter (from 40000 to 30000)
        secondEmployee.setSalary(30000);

        // 6.Print the second employee info using toString method
        System.out.println("---------- Second Employee ---------" + secondEmployee.toString());

        // 7. Get the annual salary for the first employee and print it
        System.out.println("The annual salary for " + firstEmployee.getName()
                + " is " + firstEmployee.getAnnualSalary());

        // 8. Var to hold the percent
        int percent = 7;

        // 9. Raise the salary of the second employee by 7% and print it
        System.out.println("------------------------------------"
                + "\nThe current salary of " + secondEmployee.getName()
                + " is " + secondEmployee.getSalary()
                + "\nThe salary of " + secondEmployee.getName() + " after a "
                + percent + "% raise is " + secondEmployee.raisedSalary(percent));
    }
}