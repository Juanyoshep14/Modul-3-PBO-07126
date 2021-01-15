package Entity;

import java.util.Date;

public abstract class juan07126_AdditionalAbstractEntity {
    protected Date tglsewa;

    public juan07126_AdditionalAbstractEntity(Date tglsewa) {
        this.tglsewa = tglsewa;
    }
    
    public juan07126_AdditionalAbstractEntity() {
    }
    
    public abstract Date gettglsewa();

    public void settglsewa(Date tglsewa) {
        this.tglsewa = tglsewa;
    }    
}