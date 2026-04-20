import java.util.Scanner;
public class Percobaan2 {
    public static void main(String[] args) {
        String data[][] = {{"ABDUL", "085646668991", "Kediri"}, {"KUSNO", "085646668992", "Trenggalek"}, {"PONIRIN", "08564666899", "Bojonegoro"}};
        //menampilkan judul tabel
        System.out.println("NAMA       ALAMAT        TELEPON");
        System.out.println("--------------------------------------");
        //perulangan untuk membaca setiap baris pada array data
        for(int a = 0; a < data.length; a++){
            String nama = data[a][0];       //menyimpan nama 
            String alamat = data[a][2];     //menyimpan alamat
            String telp = data [a][1];      //menyimpan nomor telepon
        }
    }
}
