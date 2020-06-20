/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

/**
 *
 * @author Nikolay
 */
public class Akcii {
    private String name;
    private String data;
    private int duration;
    private String essence;
    
    public Akcii() {
        this.name = "";
        this.data = "";
        this.duration = 0;
        this.essence= "";
    }

    public Akcii(String name, String data, int duration, String essence) {
        this.name = name;
        this.data = data;
        this.duration = duration;
        this.essence = essence;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getEssence() {
        return essence;
    }

    public void setEssence(String essence) {
        this.essence = essence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
