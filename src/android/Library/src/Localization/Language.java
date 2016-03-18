package com.synconset;

import java.util.HashMap;

public class Language {
  private HashMap<String, String> _messages;

  protected Language(String code) {
    _messages = new HashMap<String, String>();
  }

  protected void addMessage(String messageName, String message) {
    _messages.put(messageName, message);
  }

  public String getMessage(String messageName) {
    if (!_messages.containsKey(messageName)) {
      return "";
    }

    return _messages.get(messageName);
  }
}
