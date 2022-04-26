package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MainPage extends ParentPage {
    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath ="//*[@id='game_pop']")
    private WebElement gamePop;
    @FindBy(xpath = "//*[@class='top-btn']")
    private WebElement ageButton;
    @FindBy(xpath = "//*[contains(@class,'menu-item')]/a[@title='Home']")
    private WebElement homeItemTab;
    @FindBy(xpath = "//*[contains(@class,'menu-item')]/a[@title='Games']")
    private WebElement productsTab;
    @FindBy(xpath = "//*[contains(@class,'menu-item')]/a[@rel='noopener']")
    private WebElement clientHubTab;
    @FindBy(xpath = "//*[@id='menu-item-57201']/a")
    private WebElement companyTab;
    @FindBy(xpath = "//*[@id='menu-item-9841']/a")
    private  WebElement newsTab;
    @FindBy(xpath = "//*[@id='menu-item-1820']/a")
    private  WebElement contactsTab;
    @FindBy(xpath = "//*[@id='menu-item-200']//*[@href='https://www.pragmaticplay.com/en/bingo/']")
    private  WebElement bingoSubMenu;

    public void openMainPage() {
        actionsWithElements.open("https://www.pragmaticplay.com/en/");
    }

    public void closeAgePopup() {
        actionsWithElements.click(ageButton);
    }

    public void moveCursorToHomeTabAndCheckColor(String elementsColor) {
        actionsWithElements.moveToElement(homeItemTab);
        actionsWithElements.waitCssValue(homeItemTab, "color", elementsColor);
        Assert.assertEquals(actionsWithElements.getCssValue(homeItemTab, "color"), elementsColor);
    }

    public void moveCursorToProductsTabAndCheckColor(String productsTabColor) {
        actionsWithElements.moveToElement(productsTab);
        actionsWithElements.waitCssValue(productsTab, "color", productsTabColor);
        Assert.assertEquals(actionsWithElements.getCssValue(productsTab, "color"), productsTabColor);
    }

    public void moveCursorToProductTab() {
        actionsWithElements.moveToElement(productsTab);
    }

    public void moveCursorToBingoSubMenu() {
        actionsWithElements.moveToElement(bingoSubMenu);
    }

    public void clickOnBingoSubMenu() {
        actionsWithElements.click(bingoSubMenu);
    }

    public void checkBingoSubMenuColor(String bingoSubMenuColor) {
        actionsWithElements.waitCssValue(bingoSubMenu, "color", bingoSubMenuColor);
        Assert.assertEquals(actionsWithElements.getCssValue(bingoSubMenu, "color"), bingoSubMenuColor);
    }

    public void moveCursorToClientHubTabAndCheckColor(String clientHubTabColor) {
        actionsWithElements.moveToElement(clientHubTab);
        actionsWithElements.waitCssValue(clientHubTab, "color", clientHubTabColor);
        Assert.assertEquals(actionsWithElements.getCssValue(clientHubTab, "color"), clientHubTabColor);
    }

    public void moveCursorToCompanyTabAndCheckColor(String companyTabColor) {
        actionsWithElements.moveToElement(companyTab);
        actionsWithElements.waitCssValue(companyTab, "color", companyTabColor);
        Assert.assertEquals(actionsWithElements.getCssValue(clientHubTab, "color"), companyTabColor);
    }

    public void moveCursorToNewsTabAndCheckColor(String newsTabColor) {
        actionsWithElements.moveToElement(newsTab);
        actionsWithElements.waitCssValue(newsTab, "color", newsTabColor);
        Assert.assertEquals(actionsWithElements.getCssValue(newsTab, "color"), newsTabColor);
    }
    public  void moveCursorToContactsTabAndCheckColor(String contactsTabColor) {
        actionsWithElements.moveToElement(contactsTab);
        actionsWithElements.waitCssValue(contactsTab, "color", contactsTabColor);
        Assert.assertEquals(actionsWithElements.getCssValue(contactsTab, "color"), contactsTabColor);
    }

}
