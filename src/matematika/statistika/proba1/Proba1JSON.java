package matematika.statistika.proba1;

import java.util.HashMap;
import java.util.Map;

public class Proba1JSON {

    private String ime;
    private double visina;
    private long godine;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Proba1JSON() {
    }

    /**
     * @param visina
     * @param godine
     * @param ime
     */
    public Proba1JSON(String ime, double visina, long godine) {
        super();
        this.ime = ime;
        this.visina = visina;
        this.godine = godine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Proba1JSON withIme(String ime) {
        this.ime = ime;
        return this;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public Proba1JSON withVisina(double visina) {
        this.visina = visina;
        return this;
    }

    public long getGodine() {
        return godine;
    }

    public void setGodine(long godine) {
        this.godine = godine;
    }

    public Proba1JSON withGodine(long godine) {
        this.godine = godine;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Proba1JSON withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}