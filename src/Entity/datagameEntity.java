package Entity;

import java.util.Date;

public class datagameEntity extends juan07126_AdditionalAbstractEntity {
    
    
    public String game,idgame,hargagame;
    private int index,indexakun;

    public datagameEntity(String idgame, String hargagame, String game,Date tglsewa) {
        super (tglsewa);
        this.idgame = idgame;
        this.hargagame = hargagame;
        this.game = game;
    }

    public String getIdgame() {
        return idgame;
    }

    public String getHargagame() {
        return hargagame;
    }

    public String getGame() {
        return game;
    }
    
    @Override
    public Date gettglsewa() {
        return tglsewa;
    }

    public void setIdgame(String idgame) {
        this.idgame = idgame;
    }

    public void setHargagame(String hargagame) {
        this.hargagame = hargagame;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public datagameEntity(int index, int indexakun) {
        this.index = index;
        this.indexakun = indexakun;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndexakun() {
        return indexakun;
    }

    public void setIndexakun(int indexakun) {
        this.indexakun = indexakun;
    }
    

}