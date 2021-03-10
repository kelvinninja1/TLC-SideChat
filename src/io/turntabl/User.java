package io.turntabl;

//Colleague Class
public abstract class User
{
    private ChatRoom mediator;

    private String id;
    private String name;

    public User(ChatRoom room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId) throws InterruptedException;
    public abstract void receive(String msg);

    public ChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}