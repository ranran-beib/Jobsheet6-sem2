public class SortingMain05 {

    public static void main(String[] args) {
        int a[] = {34, 7, 23, 32, 5, 62};
        int b[] = {12, 45, 1, 9, 30};

        Sorting05 dataurut1 = new Sorting05(a, a.length);
        Sorting05 dataurut2 = new Sorting05(b, b.length);

        System.out.println("Data sebelum diurutkan: ");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data setelah diurutkan dengan BUBBLE SORT (ASC): ");
        dataurut1.tampil();

        //================================

        System.out.println("Data sebelum diurutkan: ");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data setelah diurutkan dengan SELECTION SORT (ASC): ");
        dataurut2.tampil();
    }
}