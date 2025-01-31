package starter.stepDefinitions.search;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import starter.tasks.search.ClickSearchButton;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OpenJPetStoreSteps {
    @Given("^(.*) tiene acceso a la JPetStore$")
    public void openJPetStore (String actor) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn().thePageNamed("pages.JPetStore")
        );
    }

    @When("^da click en buscar$")
    public void search () {
        theActorInTheSpotlight().attemptsTo(
                new ClickSearchButton()
        );
    }
}
