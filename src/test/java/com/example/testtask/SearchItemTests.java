package com.example.testtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class SearchItemTests {
    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://yandex.ru/");

        wd.findElement(By.cssSelector())
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
         /
    }

}
