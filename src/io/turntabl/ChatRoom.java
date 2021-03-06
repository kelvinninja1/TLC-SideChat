package io.turntabl;


import java.util.Map;

//Mediator Interface
public interface ChatRoom {
    public void sendMessage(String msg, String userId) throws InterruptedException;

    void addUser(User user);

    Map<String, User> listUsers();
}
