import java.util.Scanner;

public class yahya {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("masukan angka : ");
        int x = S.nextInt();
        if (x > 0) {
            System.out.println(x + " adalah bilangan positif");
        }
        else {
            if (x > 0) {
                System.out.println(x + " adalah bilangan negatif");
            } else {
                System.out.println(x + "adalah angka nol");
            }
        }
    }
}
