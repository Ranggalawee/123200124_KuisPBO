package KuisPBO;

public class Web extends Pendaftaran implements Seleksi{

    public Web(String nama, double nTulis, double nCoding, double nWawancara) {
        super(nama, nTulis, nCoding, nWawancara);
    }

    public void inTulis(double nTulis) { this.nTulis = nTulis; }

    public void inCoding(double nCoding) { this.nCoding = nCoding; }

    public void inWawancara(double nWawancara) { this.nWawancara = nWawancara; }

    @Override
    public double NilaiAkhir() {
        return (0.4 * super.nTulis) + (0.35 * super.nCoding) + (0.25 * super.nWawancara);
    }

    @Override
    public String Keterangan() {
        if (this.NilaiAkhir() >= 85)
            return "LOLOS\nSelamat kepada " + this.nama + " telah diterima sebagai Web";
        else
            return "GAGAL\nMohon maaf kepada " + this.nama + " telah ditolak sebagai Web";
    }
}
