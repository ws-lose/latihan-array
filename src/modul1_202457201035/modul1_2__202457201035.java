/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1_202457201035;

public class modul1_2__202457201035 {
    public static void main(String[] args) {
        String[][] data = {{"Abdul","085646668991","Kediri"},{"Kusno","085646668992","Trenggalek"},{"Poniran","085646668999","Bojonegoro"  }};
        System.out.printf("%-10s,%-12s,%-12s%n", "NAMA", "ALAMAT"," TELEPON,");
        System.out.println("================================================");
        for(int i=0;i<data.length;i++){
            System.out.printf("%-10s,%-12s,%-12s%n", data[i][0],data[i][2], data[i][1]);
        }
    
}
}