package starter.tasks.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.search.SearchView;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClickSearchButton implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SearchView.SEARCH_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SearchView.SEARCH_BUTTON),
                Click.on(SearchView.SEARCH_BUTTON)
        );
    }
}
