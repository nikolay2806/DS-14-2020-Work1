/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

/**
 *
 * @author Nikolay
 */
public class Garantiya {
    private String type;
    private int duration;

    public Garantiya() {
        this.type = "";
        this.duration = 0;
    }

    public Garantiya(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
       
}