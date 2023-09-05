import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта Appleinsider.ru
 */
public class MainPage {
    private final SelenideElement searchButton = $x("//input[@type='text']");

    public void clickOnSearch(){
        searchButton.click();
    }

    public void openWebSite(String url){
        Selenide.open(url);
    }

}