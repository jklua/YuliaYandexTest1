package com.example.testtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchItemTests {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();

        openSite("https://yandex.ru/");
    }
    @Test
            public void testItem(){
        
        click(By.cssSelector("[data-id='market'])"));
        click(By.cssSelector("[href*='kompiuternaia-tekhnika']"));

        click(By.cssSelector("[href^='/catalog--planshety']"));

        type(By.cssSelector("#glpricefrom"), "20000");
        type(By.cssSelector("#glpriceto"), "35000");
        click(By.cssSelector("[name$=Apple]"));
//        WebElement item = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]"));
//        String itemName = item.findElement(By.xpath(".//h3")).getText();

        String itemName = wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][2]//h3")).getText();


 /*
        Перейти на Яндекс Маркет
4. Выбрать раздел Компьютеры
5. Выбрать раздел Планшеты
6. Зайти в расширенный поиск
7. Задать параметр поиска от 20000 до 35000 рублей.
8. Выбрать производителя “Apple”
9. Применить условия поиска
10. Запомнить второй элемент в результатах поиска
11. В поисковую строку ввести запомненное значение.
12. Найти и проверить, что наименование товара соответствует запомненному
значению.
  */
    }

    public void type(By locator, String text) {
            click(locator);
            wd.findElement(locator).clear();
            if(text!=null){
                wd.findElement(locator).sendKeys(text);
        }
    }

    public void openSite(String url) {
        wd.navigate().to(url);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }
}
