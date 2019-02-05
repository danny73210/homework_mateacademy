package jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class AccessoryUltrasonic extends Accessory {
    @Column
    private String gelName;
    @Column
    private Boolean alergic;
    @Column
    private Date expirationDate;

    public String getGelName() {
        return gelName;
    }

    public void setGelName(String gelName) {
        this.gelName = gelName;
    }

    public Boolean getAlergic() {
        return alergic;
    }

    public void setAlergic(Boolean alergic) {
        this.alergic = alergic;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
