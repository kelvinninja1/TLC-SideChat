package io.turntabl;

//Concrete Colleagues
public class ChatUser extends User {

    public ChatUser(ChatRoom room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String msg, String userId) throws InterruptedException {

       Main.delay(1);

        System.out.println("@" + this.getName() + " [Sending Message] : " + msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(String msg) {
        Main.delay(1);
        System.out.println("@" + this.getName() + " [Received Message] : " + msg);
        Main.delay(2);
    }


}