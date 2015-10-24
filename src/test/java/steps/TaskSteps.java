package steps;

import com.tasktracker.acceptance.client.ApiClient;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class TaskSteps {

    private Scenario scenario;
    private ApiClient apiClient;
    private String taskList;

    @Before
    public void before(Scenario scenario){
        this.scenario = scenario;
        this.apiClient = new ApiClient();
    }

    @After
    public void tearDown(){
        this.scenario = null;
    }

    @Given("^I am an authenticated user to tta-api$")
    public void i_am_an_authenticated_user_to_tta_api() throws Throwable {
        Assert.assertTrue(true);
    }

    @When("^I use the list task operation$")
    public void i_use_the_list_task_operation() throws Throwable {
        this.taskList = this.apiClient.listTask("1");
    }

    @Then("^the result contains a list of tasks$")
    public void the_result_contains_a_list_of_tasks() throws Throwable {
        Assert.assertNotNull(this.taskList);
    }

    @When("^I add the task \"(.*?)\"$")
    public void i_add_the_task(String taskName) throws Throwable {
        throw new PendingException();
    }

    @Then("^I get the message \"(.*?)\"$")
    public void i_get_the_message(String resultMessage) throws Throwable {
        Assert.assertEquals(resultMessage, "");
    }
}
