package percobaan1_java;
import javax.swing.JOptionPane;
public class Percobaan1_java {
    public static void main(String[] args) {
        // TODO code application logic here
        //mendeklarasikan variabel
        int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4, 2, 10}};
        int jumlah = 0;
        int elemen = 0;
        
        System.out.println("=== DATA ARRAY ===");
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[0].length; b++) {
                System.out.print(data[a][b] + " ");
                jumlah += data[a][b];
                elemen++;
            }
            System.out.println();
        }
        //mencari, jumlah, elemen dan rata-rata
        double rata;
        rata = (double) jumlah / elemen;
        System.out.println("Jumlah Semua Elemen: " + jumlah);
        System.out.println("Total Elemen: "+ elemen);
        System.out.println("Rata-rata: "+ rata);
        
        //Jumlah elemen indeks ganjil
        int ganjill = 0;
        for (int a = 0; a < data.length; a++){
            for (int b = 0; b < data[0].length; b++){
                if (b % 2 == 1){
                    ganjill += data[a][b];
                }
            }
        }
        //untuk menentukan nilai yang dicari
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Yang Dicari: "));
        //mengecek kebenaran
        boolean ketemu = false;
        String posisi = ""; //menyimpan semua indeks
        for (int a = 0; a < data.length; a++){
            for (int b = 0; b < data[0].length; b++){
                if (data [a][b]== cari){
                    ketemu = true;
                    posisi += " [" + a +","+ b + "] ";
                }
            }
        }
        System.out.println("Jumlah Elemen Indeks Ganjil: " + ganjill);
        
        if (ketemu) {
            JOptionPane.showMessageDialog(null, "Nilai Ditemukan di Indeks: " + posisi);
            int baru = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Nilai Baru: "));
            //ganti semua nilai yang sama
            for (int a = 0; a < data.length; a++){
                for (int b = 0; b < data[0].length; b++){
                    if (data[a][b] == cari){
                        data[a][b] = baru;
                    }
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "Nilai Tidak Ditemukan!");
        }
        System.out.println("\n=== ARRAY SETELAH PERUBAHAN ===");
        for (int a = 0; a < data.length; a++){
            for (int b = 0; b < data[0].length; b++){
                System.out.print(data[a][b] + " ");
            }
            System.out.println();
        }
        //Menghitung ulang jumlah rata-rata
        int jumlahBaru = 0;
        int elemenBaru = 0;
        for (int a = 0; a < data.length; a++){
            for (int b = 0; b < data[0].length; b++){
                jumlahBaru += data[a][b];
                elemenBaru++;
            }
        }
        double rataBaru = (double) jumlahBaru / elemenBaru;
        System.out.println("Jumlah Setelah Perubahan: " + jumlahBaru);
        System.out.println("Total Elemen Setelah Perubahan: " + elemenBaru);
        System.out.println("Rata-rata Baru: " + rataBaru);
        //jumlah elemen ganjil baru
        int ganjil = 0;
        for (int a = 0; a < data.length; a++){
            for (int b = 0; b < data[0].length; b++){
                if (b % 2 == 1) {
                    ganjil += data[a][b];
                }
            }
        }
        System.out.println("Jumlah Elemen Dengan Indeks Kolom Ganjil: " + ganjil);
    }
}
        


