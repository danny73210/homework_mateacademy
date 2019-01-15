package jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class TestSkin extends Test {
    @Column
    private Double histamineAgents;
    @Column
    private Integer fatAmount;
    @Column
    private Integer ultraVioletSensitivity;

    public Double getHistamineAgents() {
        return histamineAgents;
    }

    public void setHistamineAgents(Double histamineAgents) {
        this.histamineAgents = histamineAgents;
    }

    public Integer getFatAmount() {
        return fatAmount;
    }

    public void setFatAmount(Integer fatAmount) {
        this.fatAmount = fatAmount;
    }

    public Integer getUltraVioletSensitivity() {
        return ultraVioletSensitivity;
    }

    public void setUltraVioletSensitivity(Integer ultraVioletSensitivity) {
        this.ultraVioletSensitivity = ultraVioletSensitivity;
    }

    @Override
    public String toString() {
        return "TestSkin{" +
                "histamineAgents=" + histamineAgents +
                ", fatAmount=" + fatAmount +
                ", ultraVioletSensitivity=" + ultraVioletSensitivity +
                '}';
    }
}
