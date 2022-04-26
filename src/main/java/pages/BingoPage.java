package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BingoPage extends ParentPage {
    public BingoPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//*[contains(@class,'live-bingo')]")
    private WebElement bingoVariants;
    @FindBy(xpath = "//*[@class='slick-list draggable']")
    private WebElement getBingoVariants;

    public void scrollToBingoVariants() {
        actionsWithElements.scrollToElement(bingoVariants);
    }

    public List<WebElement> bingoVariantsList() {
        String xpath = "//*[@class='slick-track']//*[(contains(@class, 'slick-slide')) and not (contains(@class, 'slick-cloned'))]";
        return getBingoVariants.findElements(By.xpath(xpath));
    }

    public void checkNumberOfBingoVariants(int expectedNumber) {
        Assert.assertEquals(bingoVariantsList().size(), expectedNumber);
    }
    
    public void checkIfBingoVariantsHasDuplicate() {
        List<WebElement> elements = bingoVariantsList();
        List<String> titles = new ArrayList<>();
        boolean result = true;
        for (WebElement element:elements
             ) {
            titles.add(element.getAttribute("innerText").replace("/n", ""));
        }

        for (int i= 0; i<titles.size(); i++ ) {
            for (int j=i+1; j<titles.size(); j++)
            if (titles.get(i).equals(titles.get(j))) {
                result = false;
            }
        }
        Assert.assertTrue(result);

//
//            for (WebElement element : elements
//            ) {
//                String title = element.getAttribute("innerText").
//                        replace("\n", "").
//                        replace(" ", "-");
//                String textContent = element.getAttribute("textContent");
//                System.out.println(title + " " + textContent.contains(title));
//            }


        }
}