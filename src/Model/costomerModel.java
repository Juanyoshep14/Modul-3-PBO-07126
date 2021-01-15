package Model;
import Entity.costomerEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class costomerModel{
    private ArrayList <costomerEntity> datacostomer;

    public costomerModel(){
        datacostomer = new ArrayList <costomerEntity>();
    }
    
    public void insert (costomerEntity costomerEntity){
        datacostomer.add(costomerEntity);
    }
    
    public int cekdata(String nama, String password){
        int loop = 0;
        while(!datacostomer.get(loop).getNama().equals(nama)&&
                !datacostomer.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    
    public costomerEntity getdatacostomer(int index){
        return datacostomer.get(index);
    }
    
    public boolean cekempty(boolean cek){
        while(datacostomer.isEmpty()){
            System.out.println("\nBELUM ADA AKUN YANG TERDAFTAR\n");
            cek=true;
            break;
        }
        while(!datacostomer.isEmpty()){
            cek=false;
            break;
        }
        return cek;
    }
}