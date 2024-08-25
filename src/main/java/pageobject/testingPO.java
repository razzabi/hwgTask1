package pageobject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class testingPO {
    WebDriver driver;
    SeleniumHelpers selenium;

    public testingPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(xpath = "//h1[text()='todos']")
    WebElement diplayTitlePage;
    @FindBy(xpath = "//input[@id='todo-input']")
    WebElement clickField;
    @FindBy(xpath = "//span[@class='todo-count']")
    WebElement totalTask;
    @FindBy(xpath = "(//input[@class='toggle' and @type='checkbox'])[1]")
    WebElement completedTaskOne;
    @FindBy(xpath = "//ul[@class='todo-list']/li[2]//button[@class='destroy']")
    WebElement deleteTaskTwo;
    @FindBy(xpath = "//a[.='Completed']")
    WebElement selectCompletedFilter;
    @FindBy(xpath = "//a[.='Active']")
    WebElement selectActiveFilter;
    @FindBy(xpath = "//label[.='Buy a bottle of Singleton']")
    WebElement tasktwo;

    public void navigatesToUrl() throws InterruptedException {
        selenium.navigateToPage("https://todomvc.com/examples/react/dist/");
    }

    public String diplayTitlePage() throws InterruptedException {
        selenium.hardWait(2);
        return selenium.getText(diplayTitlePage);
    }
    public void clickField () throws InterruptedException {
        selenium.click(clickField);
    }
    public void inputTask (String inputTask) throws InterruptedException {
        selenium.enterText(clickField, inputTask, true);
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
    }
    public void showTaskInList (String showTask) throws InterruptedException {
        WebElement showResultDateToday = driver.findElement(By.xpath("//label[.='"+showTask+"']"));
        String text = showResultDateToday.getText();
        System.out.println(text);
        if (text.equals(text)) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is not present");
        }
    }
    public String totalTaskDisplay() throws InterruptedException {
        selenium.hardWait(3);
        return selenium.getText(totalTask);
    }
    public void completedTaskOne () throws InterruptedException {
        selenium.click(completedTaskOne);
    }
    public void deleteTaskTwo () throws InterruptedException {
        selenium.click(tasktwo);
        selenium.click(deleteTaskTwo);
    }
    public void selectActiveFilter () throws InterruptedException {
        selenium.click(selectActiveFilter);
    }
    public void selectCompletedFilter () throws InterruptedException {
        selenium.click(selectCompletedFilter);
    }
    public void showTask (String showTask) throws InterruptedException {
        selenium.hardWait(2);
        WebElement showResultDateToday = driver.findElement(By.xpath("//label[.='"+showTask+"']"));
        String text = showResultDateToday.getText();
        System.out.println(text);
        if (text.equals(text)) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is not present");
        }
    }

}
