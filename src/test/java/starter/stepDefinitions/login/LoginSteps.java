package starter.stepDefinitions.login;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginSteps {

    @Given("^(.*) tiene acceso a la URL$")
    public void accedeURL(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn().thePageNamed("pages.WEB")
        );
    }
}
