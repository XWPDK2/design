package com.example.design.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;

/**
 * App Session config. Created by lxh on 4/21/16.
 */
@Configuration
@EnableRedisHttpSession
public class AppSessionConfig {
  /**
   * @return HttpSessionStrategy bean.
   */
  @Bean
  public HttpSessionStrategy sessionStrategy() {
    return new HeaderHttpSessionStrategy();
  }
}
