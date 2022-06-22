
package Model;

import java.util.ArrayList;

public class Karyawan extends Staff{
    private int salary;
    ArrayList<PresensiStaff> presensi=new ArrayList<>();

    public Karyawan(int salary, int nik, String nama, String alamat, String ttl, String telepon,ArrayList<PresensiStaff> presensi) {
        super(nik, nama, alamat, ttl, telepon);
        this.salary = salary;
        this.presensi=presensi;
    }

    @Override
    public String toString() {
        return super.toString()+", Karyawan{" + "salary=" + salary + ", presensi=" + presensi + '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<PresensiStaff> presensi) {
        this.presensi = presensi;
    }
    
}
