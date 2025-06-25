/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1_202457201035;
import javax.swing.JOptionPane;
/**
 *
 * @author BUNDA AKMAL
 */
public class Modul1_202457201035 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int data[][] = {{4, 6, 4, 2, 8, 4, 2, 10}, {4, 6, 4, 2, 8, 4,
2, 10}};
        System.out.println("Isi Array :");
        
for (int a = 0; a < data.length; a++) {
for (int b = 0; b < data[a].length; b++) {
System.out.print(data[a][b] + " ");
}
System.out.println( );
}

//menghitung rata rata
int total=0;
int jumlahElemen=0;

      for (int i = 0; i < data.length; i++) {
for (int j = 0; j < data[i].length; j++) {
    total+= data[i][j];
    jumlahElemen++;
        }
}
      int rataRata = (int) total / jumlahElemen;
        System.out.println("Rata Rata nilai Array :" + rataRata);
        
        int cari= Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai yang ingin dicari"));
        int ganti= Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai pengganti"));
        
        boolean ketemu=false;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
               if (data[i][j]==cari){
                   System.out.println("Angka " + cari + " ditemukan pada indeks [" + i + "][" + j + "]");
                   data[i][j]=ganti;
                   ketemu=true;
                   if (!ketemu) {
            System.out.println("Nilai " + cari + " tidak ditemukan dalam array.");
        }
               }
               }
            }
        System.out.println("Array setelah diganti");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(data[i][j] + " ");
                
            }
            System.out.println();
            }
        int jumlahKolomGanjil=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data[i].length; j+=2) {
               jumlahKolomGanjil += data[i] [j];
            }
}
        System.out.println("jumlah elemen pada kolom dengan index ganjil :" + jumlahKolomGanjil);
}   
}
    

