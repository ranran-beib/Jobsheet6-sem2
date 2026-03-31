import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa05 m = new Mahasiswa05(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData Awal:");
        list.tampil();

        System.out.println("\nBubble Sort (DESC):");
        list.bubbleSort();
        list.tampil();
    }
}