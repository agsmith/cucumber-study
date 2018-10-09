package cuketest;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.PendingException;

public class StepDefs {
    Character character;

    @Given("^I have a character$")
    public void i_have_a_character() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        this.character = new cuketest.Character("Super Mario Bros", "Mario");
    }

    @When("^The character has a mustache")
    public void character_has_mustache() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        this.character.setHasMustache(true);
    }
    @When("^The character does not have a mustache")
    public void character_does_not_have_mustache() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        this.character.setHasMustache(false);
    }
    @When("^The character has a red hat")
    public void character_has_red_hat() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        this.character.setHatColor("red");
    }

    @When("^The character has a green hat")
    public void character_has_green_hat() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        this.character.setHatColor("green");
    }

    @Then("^The character is Mario")
    public void is_mario() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(this.character.getHasMustache(), new Boolean(true));
        Assert.assertEquals(this.character.getHatColor(), "red");
    }
    @Then("^The character is Luigi")
    public void is_luigi() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(this.character.getHasMustache(), new Boolean(true));
        Assert.assertEquals(this.character.getHatColor(), "green");
    }
    @Then("^The character is Peach")
    public void is_peach() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(this.character.getHasMustache(), new Boolean(false));
    }
}
