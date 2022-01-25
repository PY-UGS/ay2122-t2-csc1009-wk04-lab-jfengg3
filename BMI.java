import java.util.Scanner;

public class BMI {

    double pound;
    double inches;

    // Getter
    public double getPound() {
        return pound;
    }

    public double getInches() {
        return inches;
    }

    // Setter
    public void setPound(double weight) {
        this.pound = weight;
    }

    public void setinches(double height) {
        this.inches = height;
    }

    // Methods
    public double getbmi() {
        return getPound() / (getInches() * getInches()) * 703;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        BMI userbmi = new BMI();

        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        userbmi.setPound(weight);

        System.out.println("Enter height in inches:");
        double height = input.nextDouble();
        userbmi.setinches(height);

        input.close();

        System.out.println(String.format("BMI is %.2f", +userbmi.getbmi()));

        if (userbmi.getbmi() < 18.5) {
            System.out.println("Underweight");
        } else if (userbmi.getbmi() >= 18.5 && userbmi.getbmi() < 25.0) {
            System.out.println("Normal");
        } else if (userbmi.getbmi() >= 25.0 && userbmi.getbmi() < 30.0) {
            System.out.println("Overweight");
        } else if (userbmi.getbmi() >= 30.0) {
            System.out.println("Obese");
        }

    }

}