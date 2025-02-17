package starter.questions.search;

import net.serenitybdd.screenplay.Question;
import starter.ui.search.SearchView;

public class SearchQuestion {
    public static Question<String> TextButtonSearch() {
        return actor -> SearchView.SEARCH_BUTTON.resolveFor(actor).getText().trim();
    }
}
