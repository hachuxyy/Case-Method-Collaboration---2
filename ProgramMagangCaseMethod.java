import java.util.Scanner;

public class ProgramMagangCaseMethod {
    static Scanner sc = new Scanner(System.in);
    static String[][] dataMahasiswa = new String[50][6];
    static int jumlahData = 0;

    static void tambahDataMagang() { // Function Menu 1 Tambah Data Mahasiswa Magang
        System.out.print("Nama Mahasiswa : ");
        dataMahasiswa[jumlahData][0] = sc.nextLine();
        System.out.print("NIM : ");
        dataMahasiswa[jumlahData][1] = sc.nextLine();
        System.out.print("Program Studi : ");
        dataMahasiswa[jumlahData][2] = sc.nextLine();
        System.out.print("Perusahaan Tujuan Magang : ");
        dataMahasiswa[jumlahData][3] = sc.nextLine();
        while(true) {
            System.out.print("Semester Pengambilan Magang (6 atau 7) : ");
            String semester = sc.nextLine();

            if (semester.equals("6") || semester.equals("7")) {
                dataMahasiswa[jumlahData][4] = semester;
                break;
            } else {
                System.out.println("Semester Tidak Valid !!!, Silahkan Input Ulang Semester 6 atau 7");
            }
        }
        
        while (true) { 
            System.out.print("Status Magang (Diterima/Menunggu/Ditolak) : ");
            String status = sc.nextLine();

            if(status.equals("Diterima") || status.equals("Menunggu") || status.equals("Ditolak")) {
                dataMahasiswa[jumlahData][5] = status;
                break;
            } else {
                System.out.println("Input Status Magang Tidak Valid, Ulangi Input Ulang !!!");
            }
        }
        jumlahData++;
        System.out.println("Data Pendaftaran Magang Berhasil Ditambahkan. Total Pendaftar : " + jumlahData);
    }

    static void tampilSemuaPendaftar() { // Function Menu 2 Untuk Tampilkan Semua Pendaftar Magang
        System.out.printf("%-10s %-20s %-20s %-25s %-25s %-10s %-15s \n", "No", "Nama", "NIM", "Program Studi", "Perusahaan", "Semester", "Status");
        for(int i = 0; i < jumlahData; i++) {
            System.out.printf("%-10s %-20s %-20s %-25s %-25s %-10s %-15s \n", (i + 1), dataMahasiswa[i][0], dataMahasiswa[i][1], dataMahasiswa[i][2], dataMahasiswa[i][3], dataMahasiswa[i][4], dataMahasiswa[i][5]);
        }
    }

    static void cariPendaftar() { //Function Menu 3 Untuk Mencari Pendaftar Magang
        System.out.print("Masukkkan program studi: ");
        String searching = sc.nextLine();
        boolean searchData = false;
        System.out.printf("%-10s %-20s %-20s %-25s %-25s %-10s %-15s \n", "No", "Nama", "NIM", "Program Studi", "Perusahaan", "Semester", "Status" );
        for(int i=0; i<jumlahData; i++){
            if (dataMahasiswa[i][2].equalsIgnoreCase(searching)){ //Jika ketemu
                searchData=true;
                System.out.printf("%-10s %-20s %-20s %-25s %-25s %-10s %-15s \n", + (i+1) , dataMahasiswa[i][0] , dataMahasiswa[i][1] , dataMahasiswa[i][2] , dataMahasiswa[i][3] , dataMahasiswa[i][4] , dataMahasiswa[i][5]);
            }
            if (searchData == false) { //Jika tidak ketemu
                System.out.println("Mahasiswa atau Data Pendaftar tidak ditemukan!");
            }
        }
    }
    static void hitungJumlahPendaftarPerStatus() { // Function Menu 4 Untuk Menghitung Jumlah Pendaftar Magang Per Status
        int diterima = 0;
        int menunggu = 0;
        int ditolak = 0;

        for (int i = 0; i < jumlahData; i++) {
            if (dataMahasiswa[i][5].equalsIgnoreCase("Diterima")){
                diterima++;
            } else if (dataMahasiswa[i][5].equalsIgnoreCase("Menunggu")){
                menunggu++;
            } else {
                dataMahasiswa[i][5].equalsIgnoreCase("Ditolak");
                ditolak++;
            }
            
        }

        System.out.println("Jumlah Pendaftar Magang Berdasarkan Status:");
        System.out.println("Diterima: " + diterima);
        System.out.println("Menunggu: " + menunggu);
        System.out.println("Ditolak: " + ditolak);
        System.out.println("Total Pendaftar: " + jumlahData);
    }

    public static void main(String[] args) {
        while (true) { 
            System.out.println("==== Sistem Pendaftaran Magang Mahasiswa ====");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar Untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu (1-5) : ");
            int pilihMenu = sc.nextInt();
            sc.nextLine();

            if(pilihMenu == 1) {
                tambahDataMagang();
            } else if (pilihMenu == 2) {
                tampilSemuaPendaftar();
            } else if (pilihMenu == 3) {
                cariPendaftar();
            } else if (pilihMenu == 4) {
                hitungJumlahPendaftarPerStatus();
            } else {
                System.out.println("Keluar dari program ....");
                break;
            }
        }
 
    }
}

