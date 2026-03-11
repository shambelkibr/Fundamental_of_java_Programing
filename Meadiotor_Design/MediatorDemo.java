// Mediator interface
interface ChatRoomMediator {
    void showMessage(User user, String message);
}

// Concrete Mediator
class ChatRoom implements ChatRoomMediator {
    public void showMessage(User user, String message) {
        System.out.println(user.getName() + ": " + message);
    }
}

// Colleague
class User {
    private String name;
    private ChatRoomMediator mediator;

    public User(String name, ChatRoomMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() { return name; }

    public void send(String message) {
        mediator.showMessage(this, message);
    }
}

// Usage
public class MediatorDemo {
    public static void main(String[] args) {
        ChatRoomMediator chatRoom = new ChatRoom();

        User alice = new User("Alice", chatRoom);
        User bob = new User("Bob", chatRoom);

        alice.send("Hello Bob!");
        bob.send("Hi Alice!");
    }
} 
    

