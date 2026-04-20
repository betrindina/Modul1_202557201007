import java.util.Scanner;
public class Percobaan2 {
    public static void main(String[] args) {
        String data[][] = {{"ABDUL", "085646668991", "Kediri"}, {"KUSNO", "085646668992", "Trenggalek"}, {"PONIRIN", "085646668999", "Bojonegoro"}};
        //menampilkan judul tabel
        System.out.println("NAMA       ALAMAT        TELEPON");
        System.out.println("--------------------------------------");
        //perulangan untuk membaca setiap baris pada array data
        for(int a = 0; a < data.length; a++){
            String nama = data[a][0];       //menyimpan nama 
            String alamat = data[a][2];     //menyimpan alamat
            String telp = data [a][1];      //menyimpan nomor telepon
            
            //menampilkan nama dan spasi
            System.out.print(nama);
            for(int i = nama.length(); i < 10; i++){
                System.out.print(" ");
            }
           //menampilkan alamat dan spasi
            System.out.print(alamat);
            for(int i = alamat.length(); i < 15; i++){
                System.out.print(" ");
            }
            //menampilkan no.telepon
            System.out.println(telp);
        }
    }
}
