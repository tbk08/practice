package day_13;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("Biybinaz");
        User user2 = new User("Nura");
        User user3 = new User("Malika");

        user1.sendMessage(user2,"Hi");
        MessageDatabase.showDialog(user1,user2);

        user1.subscribe(user3);
        System.out.println(user1.getName());
        System.out.println(user3.getName());
        user3.subscribe(user1);

        System.out.println(user1.isSubscribed(user3));
        System.out.println(user3.isSubscribed(user1));

        System.out.println(user1.getSubscriptions());
        System.out.println(user3.getSubscriptions());
        System.out.println(user1.isFriend(user3));

    }
}
