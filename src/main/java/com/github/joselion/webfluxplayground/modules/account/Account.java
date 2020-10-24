package com.github.joselion.webfluxplayground.modules.account;

import java.time.Instant;

public class Account {
  
  private Long id;

  private Instant createdAt;

  private String username;

  private String password;

  public Long getId() {
    return id;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
