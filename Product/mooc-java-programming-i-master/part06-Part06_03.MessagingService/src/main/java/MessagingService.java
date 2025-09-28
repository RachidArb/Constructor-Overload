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

public class MessagingService {
    
    ArrayList<Message> listOfMessages;
    
    public MessagingService() {
        listOfMessages = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            listOfMessages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.listOfMessages;
    }
    
}
