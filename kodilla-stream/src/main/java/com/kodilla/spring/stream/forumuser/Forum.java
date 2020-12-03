package com.kodilla.spring.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(10000001, "Rafał", 'M', 7, LocalDate.of(2000,9,21)));
        theUserList.add(new ForumUser(10000002, "Marek", 'M', 6, LocalDate.of(1999,7,8)));
        theUserList.add(new ForumUser(10000003, "Anna", 'F', 43, LocalDate.of(1998,6,14)));
        theUserList.add(new ForumUser(10000004, "Katarzyna", 'F', 65, LocalDate.of(2001,8,9)));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }

}
