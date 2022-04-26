
import org.testng.annotations.Test;

public class Case1 extends BaseTest{

    @Test
    public void case1() {
        mainPage.openMainPage();
        mainPage.closeAgePopup();
        mainPage.moveCursorToHomeTabAndCheckColor("rgba(255, 255, 255, 1)");
        mainPage.moveCursorToProductsTabAndCheckColor("rgba(255, 255, 255, 1)");
        mainPage.moveCursorToClientHubTabAndCheckColor("rgba(255, 128, 14, 1)");
        mainPage.moveCursorToCompanyTabAndCheckColor("rgba(255, 255, 255, 1)");
        mainPage.moveCursorToNewsTabAndCheckColor("rgba(255, 128, 14, 1)");
        mainPage.moveCursorToContactsTabAndCheckColor("rgba(255, 128, 14, 1)");
        mainPage.moveCursorToProductTab();
        mainPage.checkBingoSubMenuColor("rgba(255, 255, 255, 1)");
        mainPage.moveCursorToBingoSubMenu();
        mainPage.checkBingoSubMenuColor("rgba(255, 128, 14, 1)");
    }
}
