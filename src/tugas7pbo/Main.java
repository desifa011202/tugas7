package tugas7pbo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> pegawai = new ArrayList<>();

        pegawai.add(new PegawaiTetap("Indah", "3174836573926700", 300000));
        pegawai.add(new PegawaiHarian("Dimas", "3176384638467699", 9500, 40));
        pegawai.add(new Sales("Dhaiful", "3174638573926755", 60, 60000));

        pegawai.add(new PegawaiTetap("Dia", "3187493756478399", 3000000));
        pegawai.add(new PegawaiHarian("Putri", "3178397483947588", 9000, 45));
        pegawai.add(new Sales("Aisyah", "3173839576448903", 55, 55000));

        pegawai.add(new PegawaiTetap("Aku", "3189446385774188", 5000000));
        pegawai.add(new PegawaiHarian("Kamu", "3173859375638395", 7500, 70));
        pegawai.add(new Sales("Kita", "3173944738558365", 50, 50000));
        for (int i = 0; i < pegawai.size(); i++){
            System.out.println(pegawai.get(i).toString());
        }
    }
}
