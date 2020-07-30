package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public List<ForumUser> getUserList(){
        List<ForumUser> theListOfUsers = new ArrayList<ForumUser>();
        theListOfUsers.add(new ForumUser(1,"Arek",'M', LocalDate.of(1999,5,20), 20 ));
        theListOfUsers.add(new ForumUser(2,"Bartek",'M', LocalDate.of(2000,8,20), 15 ));
        theListOfUsers.add(new ForumUser(3,"Czarek",'M', LocalDate.of(1950,5,20), 10 ));
        theListOfUsers.add(new ForumUser(4,"Dorota",'F', LocalDate.of(1995,5,20), 5 ));
        theListOfUsers.add(new ForumUser(5,"Ewelina",'F', LocalDate.of(1945,5,20), 0 ));
      return new ArrayList<>(theListOfUsers);
    }
}
