package Controller;

import Entity.datagameEntity;
import java.util.Date;

public class datagameController {

    public datagameController() {
    }
    
    public datagameEntity getData(int index) {
        return AllObjectModel.datagameModel.getdatagame(index);
    }
    
    public void insert(String idgame, String hargagame, String game,Date tglsewa) {
        AllObjectModel.datagameModel.insert(new datagameEntity(idgame,hargagame,game,tglsewa));
    }
    
    public void delete(int index){
        AllObjectModel.datagameModel.delete(index);
    }

    public void insert(String string, int i, String string0, Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
