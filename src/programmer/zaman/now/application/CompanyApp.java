package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company =  new Company();
        company.setName("Programmer Zaman Now");
        Company.Employee employee = company.new Employee();
        employee.setName("Eko Khannedy");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company company1 = new Company();
        company1.setName("Belum ada");
        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Budi");

        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());


    }
}
