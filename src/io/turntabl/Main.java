package io.turntabl;

//Test the mediator pattern.
public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        ChatRoom chatroom = new SideChat();

        User user1 = new ChatUser(chatroom,"1", "Kelvin Obeng Morrison");
        User user2 = new ChatUser(chatroom,"2", "Kalyssa Owusu");
        User user3 = new ChatUser(chatroom,"3", "Nunya Yao Klah");
        User user4 = new ChatUser(chatroom,"4", "Desmond Techie");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        System.out.println("TurnTabl SideChat");

        for (User value : chatroom.listUsers().values()) {
            System.out.print(value.getName()+ ", ");
        }
        System.out.println(":-D Joined The SideChat\n\n");

        user1.send("Hello Kalyssa", "2");
        user2.send("Hey buddy", "1");

    }

    public static void delay(int delay) {
        try {
            Thread.sleep(delay * 1000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }
}
