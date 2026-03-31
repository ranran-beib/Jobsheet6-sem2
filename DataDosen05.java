public class DataDosen05 {
    Dosen05[] dataDosen = new Dosen05[10];
    int idx;

    void tambah(Dosen05 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }
    }

    void tampil() {
    System.out.println("=====================================================");
    System.out.printf("| %-10s | %-15s | %-10s | %-5s |\n", "Kode", "Nama", "JK", "Usia");
    System.out.println("=====================================================");

    for (int i = 0; i < idx; i++) {
        String jk = dataDosen[i].jenisKelamin ? "L" : "P";
        System.out.printf("| %-10s | %-15s | %-10s | %-5d |\n",
                dataDosen[i].kode,
                dataDosen[i].nama,
                jk,
                dataDosen[i].usia);
        }

        System.out.println("=====================================================");
    }

    // ASC (termuda → tertua)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen05 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = tmp;
                }
            }
        }
    }

    // DSC (tertua → termuda)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[max].usia) {
                    max = j;
                }
            }
            Dosen05 tmp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
}