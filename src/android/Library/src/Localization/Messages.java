package com.synconset;

import java.util.Locale;
import java.util.HashMap;

public final class Messages {
  private static HashMap<String, Language> _languages;

  private static void initializeLanguages() {
    _languages = new HashMap<String, Language>();

    _languages.put("en", new English());
    _languages.put("da", new Danish());
  }

  public static String get(String messageName) {
    String languageName = Locale.getDefault().getLanguage();

    return get(languageName, messageName);
  }

  public static String get(String languageName, String messageName) {
    if (_languages == null) {
      initializeLanguages();
    }

    if (!_languages.containsKey(languageName)) {
      languageName = "en";
    }

    Language language = _languages.get(languageName);
    return language.getMessage(messageName);
  }
}
