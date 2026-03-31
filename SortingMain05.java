public class SortingMain05 {

    public static void main(String[] args) {
        int a[] = {34, 7, 23, 32, 5, 62};

        Sorting05 dataurut1 = new Sorting05(a, a.length);

        System.out.println("Data sebelum diurutkan: ");
        dataurut1.tampil();

        dataurut1.bubbleSort();

        System.out.println("Data setelah diurutkan dengan BUBBLE SORT (ASC): ");
        dataurut1.tampil();
    }
}