package tugas02;

import java.util.Scanner;

/**
 *
 * @author briandparmana 2201010659
 * TGL: 2024-05-30
 */
public class Tugas02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();

        VolumeBalok balok = new VolumeBalok(panjang, lebar, tinggi);

        balok.printInfo();

    }
}
