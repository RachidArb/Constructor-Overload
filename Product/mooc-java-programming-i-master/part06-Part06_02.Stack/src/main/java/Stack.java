/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguel
 */

import java.util.ArrayList;

public class Stack {
    
    ArrayList<String> list = new ArrayList<>();
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public void add(String value) {
        list.add(list.size(), value);
    }
    
    public String take() {
        String lastElement = list.get(list.size() - 1);
        list.remove(list.get(list.size() - 1));
        return lastElement;
    }
    
    public ArrayList<String> values() {
        ArrayList<String> copyList = new ArrayList<>();
        copyList.addAll(list);
        return copyList;
    }
    
}
