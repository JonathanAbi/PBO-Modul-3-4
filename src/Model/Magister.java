
package Model;

import java.util.ArrayList;

public class Magister extends Mahasiswa{
    ArrayList<MatkulAmbil> mk;
    private String judulPenelitianTesis;

    public Magister(ArrayList<MatkulAmbil> mk, String judulPenelitianTesis, int nim, String jurusan, String nama, String alamat, String ttl, String telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.mk = mk;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public ArrayList<MatkulAmbil> getMk() {
        return mk;
    }

    public void setMk(ArrayList<MatkulAmbil> mk) {
        this.mk = mk;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    @Override
    public String toString() {
        return super.toString()+"Magister{" + "mk=" + mk + ", judulPenelitianTesis=" + judulPenelitianTesis + '}';
    }

    
}
