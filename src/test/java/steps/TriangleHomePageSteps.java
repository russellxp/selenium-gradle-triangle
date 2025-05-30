package steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.cucumber.java.en.*;
import pages.TriangleHomePage;

public class TriangleHomePageSteps {

    TriangleHomePage landingPage = new TriangleHomePage();
    String result;

    @Given("the user opens the triangle classification page")
    public void the_user_opens_the_triangle_classification_page() {
        landingPage.navigateToTriangleWeb();
        // Write code here that turns the phrase above into concrete actions

    }

    @When("the user enters {word} in input A")
    public void the_user_enters_in_input_a(String SideA) {
        landingPage.writeSideA(SideA);

    }

    @And("the user enters {word} in input B")
    public void the_user_enters_in_input_b(String SideB) {
        landingPage.writeSideB(SideB);

    }

    @And("the user enters {word}  in input C")
    public void the_user_enters_in_input_c(String SideC) {
        landingPage.writeSideC(SideC);

    }

    @And("the user clicks the Check Triangle button")
    public void clickBtnCheck() {
        landingPage.clickBtnCheck();
    }

@Then("the system should display a console message that includes {word}")
public void the_system_should_display_a_console_message_that_includes(String expectedType) {
    String result = landingPage.getResultFromConsole();
    assertTrue(result.toLowerCase().contains(expectedType.toLowerCase()),
               "Expected message to contain: " + expectedType);
}


}
