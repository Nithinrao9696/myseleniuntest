package com.wikia.webdriver.common.contentpatterns;

public class CreateWikiMessages {

  public static final String
      BLANK_USERNAME_ERROR_MESSAGE
      = "Oops, please fill in the username field.";
  public static final String
      INVALID_USERNAME_ERROR_MESSAGE
      = "Hm, we don't recognize this name. Don't forget usernames are case sensitive.";
  public static final String
      BLANK_PASSWORD_ERROR_MESSAGE
      = "Oops, please fill in the password field.";
  public static final String
      INVALID_PASSWORD_ERROR_MESSAGE
      = "Oops, wrong password. Make sure caps lock is off and try again.";
  public static final String
      WIKINAME_VIOLATES_POLICY
      = "this wikia name contains a word that violates our naming policy";
  public static final String WIKINAME_PREFIX = "QATestWiki";
  public static final String WIKI_TOPIC =
      "Duis quam ante, fringilla at cursus tristique, laoreet vel elit. "
      + "Nullam rhoncus, magna ut dictum ultrices, mauris lectus consectetur tellus, "
      + "sed dignissim elit justo vel ante.";
  public static final int WIKI_CATEGORY_ID = 1;
  public static final String WIKI_THEME = "carbon";
  public static final String CATEGORY_ERROR_MESSAGE = "please choose a category";
  public static final String ADDRESS_OCCUPIED = "there’s already a wiki with this address";

  private CreateWikiMessages() {

  }
}
