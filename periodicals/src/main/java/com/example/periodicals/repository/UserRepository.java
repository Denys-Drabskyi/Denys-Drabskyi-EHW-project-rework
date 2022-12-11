package com.example.periodicals.repository;

import com.example.periodicals.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> {

    User getUserByLogin(String login);

//    void
    User getUserByLoginAndPassword(String login, String password);

//    List<User> getUsers();

    @Modifying
    @Query("UPDATE User u set u.banned = 1")
    void banUser (User u);

    void deleteUserById (Long id);



//    User getUserByLogin(String login);
//
//    User getUserByLoginAndPassword(String login, String password);
//
//    void banUnbanUser(User user);
//
//    void subscribeUser(User user, Periodical periodical);
//
//    void moneyUpdate(User user, int money);
//
//    int register_user(String name, String login, String password);


}
