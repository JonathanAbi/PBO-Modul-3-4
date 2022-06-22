
package Model;

public class Presensi {
    private String tanggal;
    private int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString()+", Presensi{" + "tanggal=" + tanggal + ", status=" + status + '}';
    }
    
}
