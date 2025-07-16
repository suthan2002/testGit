import java.util.Scanner;

public class APitCalculator {
    public static void main(String[] args){
        int salary;
        double tax=0;
        System.out.println("Calculate Your Advance Personal Income Tax (APIT)");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your total monthly employment income (salary + allowances): Rs.");
        salary = in.nextInt();
        in.close();
        System.out.println("\nTAX SLAB      RATE(%)      TAX");

        while(true){
            if(salary > 100000){
                System.out.printf("Rs. 0.00 - Rs. 100000.00  0%%    Rs. 0.00\n"); 
            }else{System.out.printf("Rs. 0.00 - Rs. %d  0%    Rs.0.00\n", salary);break;}

            if(salary > 141667){
                System.out.printf("Rs. 100000.00 - Rs. 141667.00  6%%    Rs. 2500.00\n"); 
                tax +=2500;
            }else{
                System.out.printf("Rs. 100000.00 - Rs. %d  6%%    Rs. %.2f\n", salary , (salary - 100000)*0.06);
                tax += (salary - 100000)*0.06;
                break;
            }

            if(salary > 183333){
                System.out.printf("Rs. 141667.00 - Rs. 183333.00  12%%    Rs. 5000.00\n"); 
                tax +=5000;
            }else{
                System.out.printf("Rs. 100000.00 - Rs. %d  6%%    Rs. %.2f\n", salary , (salary - 141667)*0.12);
                tax += (salary - 141667)*0.12;
                break;
            }

            if(salary > 225000){
                System.out.printf("Rs. 183333.00 - Rs. 225000.00  18%%    Rs. 7500.00\n"); 
                tax += 7500;
            }else{
                System.out.printf("Rs. 100000.00 - Rs. %d  18%%    Rs. %.2f\n", salary , (salary - 183333)*0.18);
                tax += (salary - 183333)*0.18;
                break;
            }

            if(salary > 266667){
                System.out.printf("Rs. 225000.00 - Rs. 266667.00  24%%    Rs. 10000.00\n"); 
                tax += 10000;
            }else{
                System.out.printf("Rs. 225000.00 - Rs. %.2f  24%%    Rs. %.2f\n", (float)salary , (salary - 225000)*0.24);
                tax += (salary - 225000)*0.24;
                break;
            }

            if(salary > 308333){
                System.out.printf("Rs. 266667.00 - Rs. 308333.00  30%%    Rs. 12500.00\n"); 
                tax += 12500;
                System.out.printf("Rs. 308333.00 - Rs. %d  36%%    Rs. %.2f\n", salary , (salary - 308333)*0.36);
                tax += (salary - 308333)*0.36;
                break;
            }else{
                System.out.printf("Rs. 266667.00 - Rs. %d  30%%    Rs. %.2f\n", salary , (salary - 266667)*0.3);
                tax += (salary - 266667)*0.3;
                break;
            }
        }

        System.out.printf("Total Tax Payable        Rs. %.2f\n", tax);
        double etr = tax*100/salary;
        System.out.printf("Effective tax rate (%.2f%%)\n", etr);
        double sat = salary - tax;
        System.out.printf("Salary after tax         Rs. %.2f\n", sat);
    }
}
