
package Model;

public abstract class User {
    protected String nama;
    protected String alamat;
    protected String ttl;
    protected String telepon;

    public User(String nama, String alamat, String ttl, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "Nama\t:"+this.nama+"\nAlamat\t:"+this.alamat+"\nTTL\t:"+this.ttl+"\nTelepon\t:"+this.telepon;
    }
    
}
