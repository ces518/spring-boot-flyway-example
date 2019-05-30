package me.june.springbootflyway;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 2019-05-30
 * Time: 20:48
 **/
@Entity
@Getter @Setter
public class Account {

    @Id @GeneratedValue
    private Long id;

    private String username;

    private String password;

    private boolean active;

}
