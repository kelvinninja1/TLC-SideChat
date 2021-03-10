package io.turntabl;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Concrete Mediator
public class SideChat implements ChatRoom {
    protected Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId) throws InterruptedException {
        User user = usersMap.get(userId);
        Main.delay(1);
        user.receive(msg);
    }

    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }

    @Override
    public Map <String, User> listUsers() {
//        this.usersMap.values();
        return this.usersMap;
    }

}
