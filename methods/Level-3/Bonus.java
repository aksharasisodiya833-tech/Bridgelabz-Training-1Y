public class Bonus {
    public static int[][] generateData() {

        int data[][] = new int[10][2];   
        for(int i = 0; i < 10; i++) {
            int salary = (int)(Math.random() * 90000) + 10000; 
            int years = (int)(Math.random() * 10) + 1;         

            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }
    public static double[][] calculateBonus(int data[][]) {
        double result[][] = new double[10][2]; 
        for(int i = 0; i < 10; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus;

            if(years > 5) {
                bonus = salary * 0.05;
            }
            else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }
    public static void display(int data[][], double result[][]) {
        double totalOld = 0;
        double totalNew = 0;
        double totalBonus = 0;
        System.out.println("Emp  Salary  Years  Bonus  New Salary");
        for(int i = 0; i < 10; i++) {

            int salary = data[i][0];
            int years = data[i][1];
            double bonus = result[i][0];
            double newSalary = result[i][1];
            System.out.printf("%3d %8d %6d %8.2f %10.2f\n",i+1, salary, years, bonus, newSalary);
            totalOld += salary;
            totalNew += newSalary;
            totalBonus += bonus;
        }

        System.out.println("\nTotal Old Salary = " + totalOld);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNew);
    }

    public static void main(String[] args) {
        int data[][] = generateData();
        double result[][] = calculateBonus(data);

        display(data, result);
    }
}