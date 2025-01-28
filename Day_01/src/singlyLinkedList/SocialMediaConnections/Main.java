package singlylinkedlist.SocialMediaConnections;

public class Main {
    public static void main(String[] args) {
        SocialMediaConnection socialMedia = new SocialMediaConnection();

        // Adding users
        socialMedia.addUser(1, "Alice", 25);
        socialMedia.addUser(2, "Bob", 30);
        socialMedia.addUser(3, "Charlie", 28);

        // Adding friend connections
        socialMedia.addFriendConnection(1, 2);
        socialMedia.addFriendConnection(1, 3);

        // Display friends of a user
        socialMedia.displayFriends(1);

        // Find mutual friends
        socialMedia.findMutualFriends(1, 2);

        // Remove a friend connection
        socialMedia.removeFriendConnection(1, 2);

        // Display friends after removal
        socialMedia.displayFriends(1);

        // Count friends of each user
        socialMedia.countFriends();

        // Search for a user
        SocialMediaConnection.User user = socialMedia.findUserByName("Alice");
        if (user != null) {
            System.out.println("User found: " + user.name + ", Age: " + user.age);
        } else {
            System.out.println("User not found.");
        }
    }

}
