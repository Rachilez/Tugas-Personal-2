package tugas;

import java.util.Scanner;

public class Deret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        do {
            System.out.println("\n\t\tBelajar Deret Aritmatika, Geometri dan menghitung Faktorial");

            int jumlahAngka, bedaAngka, i, jumlah;

            // meminta user menginput banyak angka
            do {
                System.out.print("\nMasukkan banyak angka yang mau dicetak [2..10] : ");
                jumlahAngka = input.nextInt();
            } while (jumlahAngka < 2 || jumlahAngka > 10);

            // meminta user menginput beda angka
            do {
                System.out.print("Masukkan beda masing-masing angka [2..9]       : ");
                bedaAngka = input.nextInt();
            } while (bedaAngka < 2 || bedaAngka > 9);

            // menampilkan deret Aritmatika
            System.out.println("\nDeret Aritmatika : ");
            jumlah = 1;
            for (i = 0; i < jumlahAngka; i++) {
                System.out.print(jumlah + "  ");
                jumlah += bedaAngka;
            }

            // Menampilkan deret geometri
            System.out.println("\nDeret Geometri : ");
            jumlah = 1;
            for (i = 0; i < jumlahAngka; i++) {
                System.out.print(jumlah + "  ");
                jumlah *= bedaAngka;
            }
            
            // menampilkan angka faktorial
            System.out.println("\nFaktorial dari " + jumlahAngka + " :");
            int faktorial = 1;
            for (i = jumlahAngka; i >= 1; i--) {
                faktorial *= i;
                System.out.print(i);
                if (i != 1) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" = " + faktorial + "\n");
            // memilih untuk mengulang atau tidak
            System.out.print("Anda mau ulang [y/t]: ");
            ulang = input.next().charAt(0);
            System.out.println();
        } while (ulang == 'Y' || ulang == 'y');
        input.close();
    }
}
