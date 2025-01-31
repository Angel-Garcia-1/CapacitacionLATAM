package starter.ui.search;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchView {
    public static Target SEARCH_BUTTON = Target.the("Boton Buscar")
            .located(By.xpath("//input[@name='searchProducts']\n"));
    public static Target SEARCH_FIELD = Target.the("Campo Busqueda")
            .located(By.xpath("//input[@name='keyword']\n"));
    public static Target CODE_PRODUCT = Target.the("Codigo Producto")
            .located(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a"));
}
