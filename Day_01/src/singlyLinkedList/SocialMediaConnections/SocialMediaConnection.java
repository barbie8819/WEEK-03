package singlylinkedlist.SocialMediaConnections;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaConnection {


    public class User {
        int userId;
        String name;
        int age;
        List<Integer> friendIds;
        User next;

        public User(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friendIds = new ArrayList<>();
            this.next = null;
        }
    }
    private User head;

    public SocialMediaConnection() {
        this.head = null;
    }

    // Add a new user
    public void addUser(int userId, String name, int age) {
        User newUser = new User(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            User temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(userId2)) {
                user1.friendIds.add(userId2);
            }
            if (!user2.friendIds.contains(userId1)) {
                user2.friendIds.add(userId1);
            }
            System.out.println("Friend connection added between User " + userId1 + " and User " + userId2);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            user1.friendIds.remove((Integer) userId2);
            user2.friendIds.remove((Integer) userId1);
            System.out.println("Friend connection removed between User " + userId1 + " and User " + userId2);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userId1, int userId2) {
        User user1 = findUserById(userId1);
        User user2 = findUserById(userId2);

        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>(user1.friendIds);
            mutualFriends.retainAll(user2.friendIds);

            System.out.println("Mutual friends between User " + userId1 + " and User " + userId2 + ": " + mutualFriends);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    // Display all friends of a specific user
    public void displayFriends(int userId) {
        User user = findUserById(userId);

        if (user != null) {
            System.out.println("Friends of User " + userId + ": " + user.friendIds);
        } else {
            System.out.println("User not found.");
        }
    }

    // Search for a user by Name or User ID
    public User findUserById(int userId) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public User findUserByName(String name) {
        User temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Count the number of friends for each user
    public void countFriends() {
        User temp = head;
        while (temp != null) {
            System.out.println("User " + temp.userId + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

}
