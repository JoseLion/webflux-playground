package com.github.joselion.webfluxplayground.modules.account;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

public class AccountTest {
  
  @Test
  void reactive_account_test() {
    final Account account = new Account();

    Mono.just(account)
      .as(it -> StepVerifier.create(it))
      .; // <- [Ctrl+Space]: Auto-complete works just fine here 🎉

    Mono.just(account)
      .as(StepVerifier::create)
      .; // <- [Ctrl+Space]: No auto-complete here 😓


    // Is sintax highlight ok for Text Blocks? Just wodering...
    final String foo = """
      Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus sit amet ultricies est, \
      sit amet vehicula nisi. Integer gravida ullamcorper purus, sit amet ullamcorper lorem \
      bibendum id. In gravida, libero condimentum eleifend laoreet, lacus eros molestie augue, \
      vel laoreet libero risus malesuada metus. Vivamus ac nulla a ante vestibulum vestibulum a \
      non nisi. Nam leo justo, maximus posuere ultrices et, condimentum sed arcu. Vestibulum ac \
      quam porttitor purus congue egestas sit amet quis neque. Sed eu mi finibus, euismod turpis \
      vel, efficitur dolor. Vestibulum egestas magna nec turpis elementum, at vestibulum neque \
      auctor. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
    """
    .; // <- [Ctrl+Space]: Auto-complete suggests all the words in the Text Block 🤔
  }
}
