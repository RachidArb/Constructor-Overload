/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        
    }
    
    public void increase() {
        if (value < 5) {
            this.value = value + 1;
        }
    }
    
    public void decrease() {
        if (value > 0) {
            this.value = value - 1;
        }
    }
    
    public int value() {
        return this.value;
    }
    
    public boolean full() {
        return value == 5;
    }
}
