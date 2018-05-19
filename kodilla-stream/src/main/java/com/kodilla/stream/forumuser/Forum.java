package com.kodilla.stream.forumuser;
import java.util.*;
import java.time.*;

public class Forum {
    private final List<ForumUser> UserList = new ArrayList<>();

    public Forum(){
        UserList.add(new ForumUser(1, "Frodo", 'M', LocalDate.of(2005,12,31), 153));
        UserList.add(new ForumUser(2, "Arwen", 'K', LocalDate.of(2003,12,31), 135));
        UserList.add(new ForumUser(3, "Boromir", 'M', LocalDate.of(1990,12,15), 135));
        UserList.add(new ForumUser(4, "Gimli", 'M', LocalDate.of(1999,12,31), 0));
        UserList.add(new ForumUser(5, "Legolas", 'M', LocalDate.of(1987,12,31), 105));
        UserList.add(new ForumUser(6, "Eowyn", 'F', LocalDate.of(1993,12,31), 157));
        UserList.add(new ForumUser(7, "Gandalf", 'M', LocalDate.of(1939,12,31), 1550));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(UserList);
    }
}
