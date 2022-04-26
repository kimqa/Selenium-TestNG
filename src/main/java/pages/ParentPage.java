package pages;

import libs.ActionsWithElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ParentPage {

    WebDriver webDriver;
    ActionsWithElements actionsWithElements;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.actionsWithElements = new ActionsWithElements(webDriver);
        PageFactory.initElements(webDriver, this);
    }
}
