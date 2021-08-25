package io.playground.resources;

import io.jpaentities.playground.domain.UserCommand;
import io.playground.entities.User;

public class UserResource {

  User saveUser(UserCommand command) {
    return new User();
  }
}
