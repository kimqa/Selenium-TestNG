package libs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ActionsWithElements {
    WebDriver webDriver;
    WebDriverWait wait;
    Actions actions;

    public ActionsWithElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 10);
        actions = new Actions(webDriver);
    }
    public void open(String url) {
        webDriver.get(url);
    }
    public void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

        element.click();
    }
    public String getCssValue(WebElement element, String value) {
        return element.getCssValue(value);
    }

    public void waitCssValue (WebElement element,String cssValue, String value) {
        try {
            wait.until(ExpectedConditions.attributeToBe(element, cssValue, value));
        } catch (Exception e) {

        }
    }

    public void moveToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void scrollToElement(WebElement element) {
        actions.moveToElement(element).perform();
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
