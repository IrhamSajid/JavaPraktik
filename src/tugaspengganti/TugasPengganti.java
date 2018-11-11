package tugaspengganti;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class TugasPengganti {

    private static List<Data> listdata = new ArrayList<>();
        
        public static void Helper(){
            int pilihan = 0;
            do {
                System.out.println("\nTugas tentang class-object");
                System.out.println("--------------------------");
                System.out.println("1. Input data");
                System.out.println("2. Tampil data");
                System.out.println("3. Sorting data");
                System.out.println("4. Keluar");
                System.out.print("Pilih: ");
                Scanner sc = new Scanner(System.in);
                pilihan = sc.nextInt();
                switch (pilihan) {
                    case 1:
                        InputData();
                        break;
                    case 2:
                        TampilData();
                        break;
                    case 3:
                        SortingData();
                        break;
                }
            } while (pilihan != 4);
        }
        
        private static void InputData(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukan nim\t: ");
            String nim = sc.nextLine();
            System.out.print("Masukan nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Masukan ipk\t: ");
            float ipk = sc.nextFloat();
            Data data = new Data(nim, nama, ipk);
            listdata.add(data);
        }
        
        private static void TampilData(){
            if (listdata.isEmpty()){
                System.out.println("Data masih kosong!");
            }
            else{
                System.out.println("-----------------------");
                int i = 1;
                for (Data data : listdata){
                    System.out.println("Data ke-"+i);
                    System.out.println("NIM : "+ data.getNim());
                    System.out.println("Nama: "+ data.getNama());
                    System.out.println("IPK : "+ data.getIpk());
                    i++;
                }
            }
        }

        public static void SortingData(){
            int pilihan = 0;
            do
            {
                System.out.println("\nSorting data mahasiswa");
                System.out.println("----------------------");
                System.out.println("1. Sorting by nim");
                System.out.println("2. Sorting by nama");
                System.out.println("3. Sorting by ipk");
                System.out.println("4. Kembali ke awal");
                System.out.print("Pilih : ");
                Scanner sc = new Scanner(System.in);
                pilihan = sc.nextInt();
                switch (pilihan)
                {
                    case 1:
                        SortingByNIM();
                        break;
                    case 2:
                        SortingByNama();
                        break;
                    case 3:
                        SortingByIPK();
                        break;
                }
            }while (pilihan !=4);
        }

        private static void SortingByNIM(){
            if (listdata.isEmpty()){
                System.out.println("Data masih kosong!");
            }
            else{
                Collections.sort(listdata, (Data data1, Data data2) -> data1.getNim().compareTo(data2.getNim()));
                System.out.println("--------------------");
                int i = 1;
                for (Data data : listdata){
                    System.out.println("Data ke-"+i);
                    System.out.println("NIM : "+ data.getNim());
                    System.out.println("Nama: "+ data.getNama());
                    System.out.println("IPK : "+ data.getIpk());
                    i++;
                }
            }
        }
        
        private static void SortingByNama(){
            if (listdata.isEmpty()){
                System.out.println("Data masih kosong!");
            }
            else{
                Collections.sort(listdata, (Data data1, Data data2) -> data1.getNama().compareTo(data2.getNama()));
                System.out.println("--------------------");
                int i = 1;
                for (Data data : listdata){
                    System.out.println("Data ke-"+i);
                    System.out.println("NIM : "+ data.getNim());
                    System.out.println("Nama: "+ data.getNama());
                    System.out.println("IPK : "+ data.getIpk());
                    i++;
                }
            }
        }
        
        private static void SortingByIPK(){
            if (listdata.isEmpty()){
                System.out.println("Data masih kosong!");
            }
            else{
                Collections.sort(listdata, (Data data1, Data data2) -> {
                    float change1 = data1.getIpk();
                    float change2 = data2.getIpk();
                    if (change1 < change2) return -1;
                    if (change1 == change2) return 0;
                    if (change2 > change1) return 1;
                    return 0;
                    }
                );
                System.out.println("--------------------");
                int i = 1;
                for (Data data : listdata){
                    System.out.println("Data ke-"+i);
                    System.out.println("NIM : "+ data.getNim());
                    System.out.println("Nama: "+ data.getNama());
                    System.out.println("IPK : "+ data.getIpk());
                    i++;
                }
            }
        }
        
    public static void main(String[] args) {
        Helper();
    }
    
}
