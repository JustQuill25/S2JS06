package minggu6;

public class DaftarMahasiswaBerprestasi01 {

    Mahasiswa01[] listMhs = new Mahasiswa01[5];
    int idx = 0;

    public void tambah(Mahasiswa01 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah Penuh!!");
        }
    }

    public void tampil() {
        for (Mahasiswa01 m : listMhs) {
            if (m != null) {
                m.tampil();
                System.out.println("----------------------------");
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa01 key = listMhs[i];
            int j = i - 1;
            while (j >= 0 && listMhs[j] != null && listMhs[j].getIpk() < key.getIpk()) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            listMhs[j + 1] = key;
        }
    }
}