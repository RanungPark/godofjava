public class SalaryManager {

    public static void main(String[] args) {
        SalaryManager chan = new SalaryManager();
        double monthlySalary=chan.getMonthlySalary(20000000);
        System.out.println(monthlySalary);
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthSalary =  yearlySalary/12.0;
        System.out.println("monthSalary="+monthSalary);
        double tax = calculateTax(monthSalary);
        System.out.println("tax="+tax);
        double NationalPension = calculateNationalPension(monthSalary);
        System.out.println("NationalPension="+NationalPension);
        double HealthInsurance = calculateHealthInsurance(monthSalary);
        System.out.println("HealthInsurance="+HealthInsurance);
        double sum = tax+NationalPension+HealthInsurance;
        monthSalary -= sum;
        return monthSalary;
    }
    public double calculateTax(double monthSalary) {
        double tax = monthSalary*(12.5/100);
        return tax;
    }

    public double calculateNationalPension(double monthSalary){
        double NationalPension = monthSalary*(8.1/100);
        return  NationalPension;
    }

    public double calculateHealthInsurance(double monthSalary){
        double HealthInsurance = monthSalary*(13.5/100);
        return  HealthInsurance;
    }
}
