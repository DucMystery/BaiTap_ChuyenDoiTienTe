import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao tien USD:");
        double moneyInput = scanner.nextDouble();

        double moneyOutput = moneyInput*23000;
        System.out.println("So tien VND ban nhan duoc la: "+moneyOutput);
    }
}
