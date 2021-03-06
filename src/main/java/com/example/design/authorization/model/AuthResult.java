package com.example.design.authorization.model;

import com.example.design.constant.AuthResultStatus;

/**
 * 认证结果 AuthResult 返回值   code 返回信息 message 返回内容 content <p> Created by lxh on 4/20/16. </p>
 */
public class AuthResult {
  /**
   * 返回码.
   */
  private int code;

  /**
   * 返回结果描述.
   */
  private String message;

  /**
   * 返回内容.
   */
  private Object content;

  /**
   * @param code    resultCode.
   * @param message resultMessage.
   */
  public AuthResult(int code, String message) {
    this.code = code;
    this.message = message;
    this.content = "";
  }

  /**
   * @param code    resultCode.
   * @param message resultMessage.
   * @param content resultContent.
   */
  public AuthResult(int code, String message, Object content) {
    this.code = code;
    this.message = message;
    this.content = content;
  }

  /**
   * @param status another AuthResultStatus.
   */
  public AuthResult(AuthResultStatus status) {
    this.code = status.getCode();
    this.message = status.getMessage();
    this.content = "";
  }

  /**
   * @param status  another AuthResultStatus.
   * @param content another content.
   */
  public AuthResult(AuthResultStatus status, Object content) {
    this.code = status.getCode();
    this.message = status.getMessage();
    this.content = content;
  }

  public static AuthResult ok(Object content) {
    return new AuthResult(AuthResultStatus.SUCCESS, content);
  }

  public static AuthResult ok() {
    return new AuthResult(AuthResultStatus.SUCCESS);
  }

  public static AuthResult error(AuthResultStatus error) {
    return new AuthResult(error);
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  public Object getContent() {
    return content;
  }
}
