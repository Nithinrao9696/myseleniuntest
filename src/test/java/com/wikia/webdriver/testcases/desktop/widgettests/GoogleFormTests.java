package com.wikia.webdriver.testcases.desktop.widgettests;

import com.wikia.webdriver.common.contentpatterns.MercuryMessages;
import com.wikia.webdriver.common.core.Assertion;
import com.wikia.webdriver.common.core.annotations.Execute;
import com.wikia.webdriver.common.core.annotations.InBrowser;
import com.wikia.webdriver.common.core.drivers.Browser;
import com.wikia.webdriver.common.templates.NewTestTemplate;
import com.wikia.webdriver.pageobjectsfactory.pageobject.article.ArticlePageObject;
import com.wikia.webdriver.pageobjectsfactory.pageobject.widget.GoogleFormWidgetPageObject;
import com.wikia.webdriver.pageobjectsfactory.pageobject.widget.WidgetPageObject;

import org.testng.annotations.Test;

@Test(groups = "GoogleFormWidget")
@InBrowser(browser = Browser.CHROME)
public class GoogleFormTests extends NewTestTemplate {

  private static final String GOOGLE_FORM_ONE_WIDGET_ARTICLE_NAME = "GoogleFormOasis_OneWidget";
  private static final String
      GOOGLE_FORM_MULTIPLE_WIDGETS_ARTICLE_NAME
      = "GoogleFormOasis_MultipleWidgets";
  private static final String
      GOOGLE_FORM_INCORRECT_WIDGET_ARTICLE_NAME
      = "GoogleFormOasis_IncorrectWidget";

  @Test(groups = "GoogleFormWidgetTest_001")
  @Execute(onWikia = "mercuryautomationtesting")
  public void GoogleFormWidgetTest_001_isLoaded() {
    WidgetPageObject widget = new GoogleFormWidgetPageObject().create(
        GOOGLE_FORM_ONE_WIDGET_ARTICLE_NAME);
    new ArticlePageObject().open(GOOGLE_FORM_ONE_WIDGET_ARTICLE_NAME);

    Assertion.assertTrue(widget.isLoaded(), MercuryMessages.INVISIBLE_MSG);
  }

  @Test(groups = "GoogleFormWidgetTest_002")
  @Execute(onWikia = "mercuryautomationtesting")
  public void PollsnackWidgetTest_002_areLoaded() {
    WidgetPageObject widget = new GoogleFormWidgetPageObject().createMultiple(
        GOOGLE_FORM_MULTIPLE_WIDGETS_ARTICLE_NAME);
    new ArticlePageObject().open(GOOGLE_FORM_MULTIPLE_WIDGETS_ARTICLE_NAME);

    Assertion.assertTrue(widget.areLoaded(), MercuryMessages.INVISIBLE_MSG);
  }

  @Test(groups = "GoogleFormWidgetTest_003")
  @Execute(onWikia = "mercuryautomationtesting")
  public void GoogleFormWidgetTest_003_isErrorPresent() {
    WidgetPageObject widget = new GoogleFormWidgetPageObject().createIncorrect(
        GOOGLE_FORM_INCORRECT_WIDGET_ARTICLE_NAME);
    new ArticlePageObject().open(GOOGLE_FORM_INCORRECT_WIDGET_ARTICLE_NAME);

    Assertion.assertTrue(widget.isErrorPresent(), MercuryMessages.INVISIBLE_MSG);
  }
}
