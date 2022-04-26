import org.testng.annotations.Test;

public class Case2 extends BaseTest{

    @Test
    public void case2() {
        mainPage.openMainPage();
        mainPage.closeAgePopup();
        mainPage.moveCursorToProductTab();
        mainPage.clickOnBingoSubMenu();
        bingoPage.scrollToBingoVariants();
        bingoPage.checkNumberOfBingoVariants(9);
        bingoPage.checkIfBingoVariantsHasDuplicate();
    }
}
