package KuisPBO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pilihForm, pilihMenu;
        String NIK, nama;
        double nTulis, nCoding, nWawancara;
        boolean ulang = true;

        Scanner input = new Scanner(System.in);
        System.out.println("FORM PENDAFTARAN PT.UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        pilihForm = input.nextInt();

        System.out.println("\nFORM PENDAFTARAN\n");
        System.out.print("Input NIK  : ");
        NIK = input.next();
        input.nextLine();
        System.out.print("Input Nama : ");
        nama = input.nextLine();
        System.out.print("Input Nilai Tes Tulis     : ");
        nTulis = input.nextDouble();
        System.out.print("Input Nilai Tes Coding    : ");
        nCoding = input.nextDouble();
        System.out.print("Input Nilai Tes Wawancara : ");
        nWawancara = input.nextDouble();

        switch (pilihForm) {
            case 1:
                Android android = new Android(nama, nTulis, nCoding, nWawancara);
                while (ulang) {
                    System.out.println("\nMenu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilihMenu = input.nextInt();
                    switch (pilihMenu) {
                        case 1:
                            System.out.println("\nFORM EDIT");
                            System.out.print("Input Nilai Tes Tulis     : ");
                            android.inTulis(input.nextDouble());
                            System.out.print("Input Nilai Tes Coding    : ");
                            android.inCoding(input.nextDouble());
                            System.out.print("Input Nilai Tes Wawancara : ");
                            android.inWawancara(input.nextDouble());
                            break;

                        case 2:
                            System.out.println("\nNilai Akhir : " + android.NilaiAkhir());
                            System.out.println("Keterangan  : " + android.Keterangan());
                            break;

                        case 3:
                            ulang = false;
                            break;

                        default:
                            System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar!");
                    }
                }
                break;

            case 2:
                Web web = new Web(nama, nTulis, nCoding, nWawancara);
                while (ulang) {
                    System.out.println("\nMenu");
                    System.out.println("1. Edit");
                    System.out.println("2. Tampil");
                    System.out.println("3. Exit");
                    System.out.print("Pilih : ");
                    pilihMenu = input.nextInt();
                    switch (pilihMenu) {
                        case 1:
                            System.out.println("\nFORM EDIT");
                            System.out.print("Input Nilai Tes Tulis     : ");
                            web.inTulis(input.nextDouble());
                            System.out.print("Input Nilai Tes Coding    : ");
                            web.inCoding(input.nextDouble());
                            System.out.print("Input Nilai Tes Wawancara : ");
                            web.inWawancara(input.nextDouble());
                            break;

                        case 2:
                            System.out.println("\nNilai Akhir : " + web.NilaiAkhir());
                            System.out.println("Keterangan  : " + web.Keterangan());
                            break;

                        case 3:
                            ulang = false;
                            break;

                        default:
                            System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar!");
                    }
                }
                break;

            default:
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar!");
                System.exit(0);
        }
    }
}
