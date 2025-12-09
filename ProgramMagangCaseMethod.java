import java.util.Scanner;

public class ProgramMagangCaseMethod {
    static Scanner sc = new Scanner(System.in);

    static void tambahDataMagang() {
        String[][] dataMahasiswa = new String[50][6];
        int jumlahData = 0;

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
}
