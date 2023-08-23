import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /* int n1, n2, n3, n4;
        System.out.print("Sayı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("Sayı Giriniz:");
        n2 = input.nextInt();
        System.out.print("Sayı Giriniz:");
        n3 = input.nextInt();
        System.out.print("Sayı Giriniz:");
        n4 = input.nextInt();
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
        if (n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println("En küçük sayı : " + n1);
        } else if (n2 < n1 && n2 < n3 && n2 < n4) {
            System.out.println("En küçük sayı : " + n2);
        } else if (n3 < n2 && n3 < n1 && n3 < n4) {
            System.out.println("En küçük sayı : " + n3);
        } else {
            System.out.println("En küçük sayı : " + n4);
        }
        if (n1 > n2 && n1 > n3 && n1 > n4) {
            System.out.println("En büyük sayı : " + n1);
        } else if (n2 > n1 && n2 > n3 && n2 > n4) {
            System.out.println("En büyük sayı : " + n2);
        } else if (n3 > n2 && n3 > n1 && n3 > n4) {
            System.out.println("En büyük sayı : " + n3);
        } else {
            System.out.println("En büyük sayı : " + n4);
        }*/

        int i, min = 0, max =0, n1, n2 = 0;
        System.out.print("Kaç Tane Sayı Gireceksiniz? : ");
        i = input.nextInt();
        for (int a = 1; a <= i; ) {
            System.out.print(a + ". sayıyı Giriniz : ");
            n1 = input.nextInt();
            if (n1 < min || min == 0) {
                min = n1;
            }else if (n1 > max) {
                max = n1;
            }
            a++;
            }

        System.out.println("Min: " + min);
        System.out.println("Max " + max);

    }
}
