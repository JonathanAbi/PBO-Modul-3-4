
package Model;

import java.util.ArrayList;

public class DosenTetap extends Dosen{
    private int salary;

    public DosenTetap(int salary, String departemen, int nik, String nama, String alamat, String ttl, String telepon, ArrayList<MatkulAjar> mk) {
        super(departemen, nik, nama, alamat, ttl, telepon, mk);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+", DosenTetap{" + "salary=" + salary + '}';
    }
    
}
