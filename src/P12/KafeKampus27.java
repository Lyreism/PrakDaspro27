import java.util.Scanner;

public class KafeKampus27 {
    public static void main(String[] args) {
        Scanner ryuh = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng",
                "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== KAFE KAMPUS ===");
        System.out.println("Daftar menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - " + ("Rp" + String.format("%,d", harga[i]).replace(',', '.')));
        }

        System.out.println();
        System.out.println("--- Pencarian Menu ---");
        while (true) {
            System.out.print("Cari menu (ketik 'lanjut' untuk memesan): ");
            String cari = ryuh.nextLine().trim();
            if (cari.equalsIgnoreCase("lanjut")) {
                break;
            }

            int idx = -1;
            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(cari)) {
                    idx = i;
                    break;
                }
            }

            if (idx != -1) {
                System.out.println("Menu tersedia: " + menu[idx] + ", harga "
                        + ("Rp" + String.format("%,d", harga[idx]).replace(',', '.')));
            } else {
                System.out.println("Maaf, menu \"" + cari + "\" tidak tersedia.");
            }
        }

        System.out.println();
        System.out.println("--- Pemesanan ---");
        int jumlah;
        do {
            System.out.print("Masukkan jumlah item yang dipesan: ");
            jumlah = Integer.parseInt(ryuh.nextLine().trim());
            if (jumlah <= 0) {
                System.out.println("Jumlah item harus lebih dari 0.");
            }
        } while (jumlah <= 0);

        String[] pesanan = new String[jumlah];  
        int[] hargaPesanan = new int[jumlah];   
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Item ke-" + (i + 1) + " (nama menu): ");
                String nama = ryuh.nextLine().trim();

                int idx = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(nama)) {
                        idx = j;
                        break;
                    }
                }

                if (idx != -1) {
                    pesanan[i] = menu[idx];
                    hargaPesanan[i] = harga[idx];
                    total += harga[idx];
                    valid = true;
                } else {
                    System.out.println("Menu \"" + nama + "\" tidak tersedia, silakan ulangi.");
                }
            }
        }

        System.out.println();
        System.out.println("=".repeat(34));
        System.out.println("          STRUK PESANAN");
        System.out.println("=".repeat(34));
        System.out.printf("%-4s%-18s%12s%n", "No", "Menu", "Harga");
        System.out.println("-".repeat(34));
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-4d%-18s%12s%n", (i + 1), pesanan[i],
                    ("Rp" + String.format("%,d", hargaPesanan[i]).replace(',', '.')));
        }
        System.out.println("-".repeat(34));
        System.out.printf("%-22s%12s%n", "TOTAL", ("Rp" + String.format("%,d", total).replace(',', '.')));
        System.out.println("=".repeat(34));

        ryuh.close();
    }
}