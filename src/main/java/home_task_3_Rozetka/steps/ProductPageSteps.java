package home_task_3_Rozetka.steps;

import home_task_3_Rozetka.pages.ProductPage;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.*;

@Log4j
public class ProductPageSteps extends ProductPage {
    public ProductPageSteps(WebDriver driver) {
        super(driver);
    }

    @Step("Click buy button on the product page")
    public void clickBuyButtonOnTheProductPage() {
        driver.findElement(buyButtonProductPage).click();
        log.info("The buy button on the product page pressed");
    }
}
