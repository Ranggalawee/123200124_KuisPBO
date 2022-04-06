package KuisPBO;

public class Android extends Pendaftaran implements Seleksi {

    public Android(String nama, double nTulis, double nCoding, double nWawancara) {
        super(nama, nTulis, nCoding, nWawancara);
    }

    public void inTulis(double nTulis) { this.nTulis = nTulis; }

    public void inCoding(double nCoding) { this.nCoding = nCoding; }

    public void inWawancara(double nWawancara) { this.nWawancara = nWawancara; }

    @Override
    public double NilaiAkhir() {
        return (0.2 * super.nTulis) + (0.5 * super.nCoding) + (0.3 * super.nWawancara);
    }

    @Override
    public String Keterangan() {
        if (this.NilaiAkhir() >= 85)
            return "LOLOS\nSelamat kepada " + this.nama + " telah diterima sebagai Android";
        else
            return "GAGAL\nMohon maaf kepada " + this.nama + " telah ditolak sebagai Android";
    }
}
