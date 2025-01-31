package starter.stepDefinitions.search;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import starter.questions.search.SearchQuestion;
import starter.tasks.search.SendSearch;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SuccessSearchSteps {
    private final SoftAssert softAssert = new SoftAssert();

    @When("ingresa un texto en el cuadro de búsqueda")
    public void search (DataTable dataTable) {
        List<String> data = dataTable.asList();
        String wishedTextSearch = data.getFirst();

        theActorInTheSpotlight().attemptsTo(
                SendSearch.data(wishedTextSearch)
        );
    }

    @Then("verificar que se presente el codigo del producto")
    public void verifyCodeProduct (DataTable dataTable) {
        List<String> data = dataTable.asList();

        String expectedCodeProduct = data.getFirst();
        String pageCodeProduct = theActorInTheSpotlight().asksFor(SearchQuestion.CodeProduct());

        softAssert.assertEquals(pageCodeProduct, expectedCodeProduct, "Validación de código de producto");
        softAssert.assertAll();
    }
}
