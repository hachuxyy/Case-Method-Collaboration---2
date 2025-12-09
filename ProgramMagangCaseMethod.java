import java.util.Scanner;

public class ProgramMagangCaseMethod {
    static Scanner sc = new Scanner(System.in);
    static String[][] dataMahasiswa = new String[50][6];
    static int jumlahData = 0;

    static void tambahDataMagang() {
        System.out.print("Nama Mahasiswa : ");
        dataMahasiswa[jumlahData][0] = sc.nextLine();
        System.out.print("NIM : ");
        dataMahasiswa[jumlahData][1] = sc.nextLine();
        System.out.print("Program Studi : ");
        dataMahasiswa[jumlahData][2] = sc.nextLine();
        System.out.print("Perusahaan Tujuan Magang : ");
        dataMahasiswa[jumlahData][3] = sc.nextLine();
        System.out.print("Semester Pengambilan Magang (6 atau 7) : ");
        dataMahasiswa[jumlahData][4] = sc.nextLine();
        System.out.print("Status Magang (Diterima/Menunggu/Ditolak) : ");
        dataMahasiswa[jumlahData][5] = sc.nextLine();
        jumlahData++;
        System.out.println("Data Pendaftaran Magang Berhasil Ditambahkan. Total Pendaftar : " + jumlahData);
    }

    static void tampilSemuaPendaftar() {
        System.out.printf("%-10s %-20s %-20s %-25s %-25s %-10s %-15s \n", "Nama", "NIM", "Program Studi", "Perusahaan", "Semester", "Status");
        for(int i = 0; i < jumlahData; i++) {
            System.out.printf("%-10s %-20s %-20s %-25s %-25s %-10s %-15s \\n", (i + 1), dataMahasiswa[i][0], dataMahasiswa[i][1], dataMahasiswa[i][2], dataMahasiswa[i][3], dataMahasiswa[i][4], dataMahasiswa[i][5]);
        }
    }
}

