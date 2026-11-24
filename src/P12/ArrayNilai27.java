package P12;
import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

         int jmlLulus = 0;
         int jmlTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status;
            if (nilaiAkhir[i] > 70) {
                status = "LULUS";
                jmlLulus++;
            } else {
                status = "TIDAK LULUS";
                jmlTidakLulus++;
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        }

        System.out.println("Jumlah mahasiswa lulus: " + jmlLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jmlTidakLulus);


        input.close();
    }
}

