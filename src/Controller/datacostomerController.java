package Controller;

import Entity.costomerEntity;
import java.util.Date;

public class datacostomerController {

    public datacostomerController() {
    }
    public costomerEntity getData(int index) {
        return AllObjectModel.datacostomerModel.getdatacostomer(index);
    }
    
    public void insert(int nomerid, int umur, String notelp, String nama, String tanggal, String alamat, String kota, String password) {
        AllObjectModel.datacostomerModel.insert(new costomerEntity(nomerid,umur,notelp,nama,tanggal,alamat,kota,password));
    }
    public int cekdataAkun(String nama, String password){
        int cekdata = AllObjectModel.datacostomerModel.cekdata(nama, password);
        return cekdata;
    }
   
    public boolean cekKosong(boolean cek){
        boolean cekakun = AllObjectModel.datacostomerModel.cekempty(cek);
        return cekakun;
    }
}
