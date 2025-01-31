package starter.ui.search;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchView {
    public static Target SEARCH_BUTTON = Target.the("Boton Buscar")
            .located(By.xpath("//input[@name='searchProducts']\n"));
}
