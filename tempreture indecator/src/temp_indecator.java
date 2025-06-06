import java.util.Scanner;

public class temp_indecator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the degree of your area: ");
        int temp = scanner.nextInt();

        if (temp < 0) {
            System.out.println(temp + " Fahrenheit, is below the freezing temperature: Danger");
        } else if (temp < 11) {
            System.out.println(temp + " Degree, coming in cold: Warning");
        } else if (temp < 21) {
            System.out.println(temp + " Degree, temperature is ok: Good");
        } else if (temp < 30) {
            System.out.println(temp + " Degree, coming in hot: Warning");
        } else if (temp < 38) {
            System.out.println(temp + " Degree, is above burning temperature: Danger");
        } else {
            System.out.println("invalid");
        }
        scanner.close();
    }
}

