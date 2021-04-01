package features;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class MyStepdefs {
    int integer;
    boolean positive;
    boolean negative;

    @Given("my integer is {int}")
    public void integer_is_less_then(Integer int1) {
        integer = int1;
    }

    @When("integer is greater then 0")
    public void check2(){
        positive = (integer>0) ? true : false;

    }
    @When("integer is less then 0")
    public void check9(){
        negative = (integer>0) ? false : true;

    }


    @Then("integer is positive")
    public void check3(){
        Assert.assertTrue(positive);
    }
    @Then("integer is negative")
    public void check4(){
        Assert.assertTrue(negative);
    }

}
