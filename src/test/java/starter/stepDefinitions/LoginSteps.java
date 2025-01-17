package starter.stepDefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginSteps {

    @Given("^(.*) tiene acceso a la URL$")
    public void accedeURL(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn().thePageNamed("pages.WEB")
        );
    }
}
