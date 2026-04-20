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
        
    }
    
}
