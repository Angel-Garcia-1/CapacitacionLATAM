package starter.tasks.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.search.SearchView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SendSearch implements Task {
    private String wishedTextSearch;

    public SendSearch(String wishedTextSearch) {
        this.wishedTextSearch = wishedTextSearch;
    }

    public static SendSearch data(String wishedTextSearch) {
        return new SendSearch(wishedTextSearch);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SearchView.SEARCH_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SearchView.SEARCH_FIELD),
                Clear.field(SearchView.SEARCH_FIELD),
                Enter.theValue(wishedTextSearch).into(SearchView.SEARCH_FIELD),

                Click.on(SearchView.SEARCH_BUTTON)
        );
    }
}
