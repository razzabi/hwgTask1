package steps.hwg;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageobject.testingPO;
import utilities.SeleniumHelpers;
import utilities.ThreadManager;

public class testingSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private SeleniumHelpers selenium = new SeleniumHelpers(driver);
    private testingPO testing =  new testingPO(driver);

    @Given("user navigates TodoMVC Page")
    public void user_navigates_TodoMVC_Page () throws InterruptedException {
        testing.navigatesToUrl ();
    }
    @Then("the page should load successfully with title {string}")
    public void the_page_should_load_successfully_with_title (String titlePage) throws InterruptedException {
        System.out.println("Actual : " + testing.diplayTitlePage());
        Assert.assertTrue(testing.diplayTitlePage().contains(titlePage));
    }
    @When("user on todoMVC page user click field what needs to be done")
    public void user_on_todoMVC_page_user_click_field_what_needs_to_be_done() throws InterruptedException {
        testing.clickField ();
    }
    @And("user input task {string}")
    public void user_input_task (String inputTask) throws InterruptedException {
        testing.inputTask (inputTask);
    }
    @Then("show in list task {string}")
    public void show_in_list_task (String showTask) throws InterruptedException {
        testing.showTaskInList(showTask);
    }
    @Then("show total task {string}")
    public void show_total_task (String totalTask) throws InterruptedException {
        System.out.println("Actual : " + testing.totalTaskDisplay());
        Assert.assertTrue(testing.totalTaskDisplay().contains(totalTask));
    }
    @And("mark as completed task one")
    public void mark_as_completed_task_one () throws InterruptedException {
        testing.completedTaskOne ();
    }
    @And("delete task two")
    public void delete_task_two () throws InterruptedException {
        testing.deleteTaskTwo ();
    }
    @And("select filter active")
    public void select_filter_active () throws InterruptedException {
        testing.selectActiveFilter ();
    }
    @And("select filter completed")
    public void select_filter_completed () throws InterruptedException {
        testing.selectCompletedFilter ();
    }
    @Then("show task {string}")
    public void show_task (String showTask) throws InterruptedException {
        testing.showTask (showTask);
    }

}
