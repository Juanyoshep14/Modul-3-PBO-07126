package Model;
import Entity.datagameEntity;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class datagameModel{
    private ArrayList <datagameEntity> datagame;

    public datagameModel(){
        datagame = new ArrayList <datagameEntity>();
    }
    
    public void insert (datagameEntity datagameEntity){
        datagame.add(datagameEntity);
    }
   
    public datagameEntity getdatagame(int index){
        return datagame.get(index);
    }
    
    public void delete(int index){
        datagame.remove(index);
    }
}
