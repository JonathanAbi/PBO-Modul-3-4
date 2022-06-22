package Model;

import java.util.ArrayList;

public class Sarjana extends Mahasiswa {

    ArrayList<MatkulAmbil> mk;

    public Sarjana(ArrayList<MatkulAmbil> mk, int nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.mk = mk;
    }

    public ArrayList<MatkulAmbil> getMk() {
        return mk;
    }

    public void setMk(ArrayList<MatkulAmbil> mk) {
        this.mk = mk;
    }

    @Override
    public String toString() {
        return super.toString()+"\nStatus\t:Sarjana";
    }

}
