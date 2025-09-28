/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */
public class Container {
    
    private int liquidAmount;
    
    public Container() {
        this.liquidAmount = 0;
    }
  
    public int contains() {
        return this.liquidAmount;
    }
    
    public void add(int amount) {
        if (this.liquidAmount + amount <= 100 && amount >= 0) {
            liquidAmount += amount;
        } else {
            liquidAmount = 100;
        }
    }
    
    public void remove(int amount) {
        if (liquidAmount - amount >= 0 && liquidAmount - amount <= 100) {
            liquidAmount -= amount;
        } else {
            liquidAmount = 0;
        }    
    }    
        
    public String toString() {
        return this.liquidAmount + "/100";
    }       

    public void setLiquidAmount(int liquidAmount) {
        this.liquidAmount = liquidAmount;
    }
    
}
