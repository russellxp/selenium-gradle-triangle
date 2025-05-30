package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;

public class TriangleHomePage extends BasePage {

    // private String txtName = "//input[@id='username']";
    private String txtSideA = "//input[@id='SideA']";
    private String txtSideB = "//input[@id='SideB']";
    private String txtSideC = "//input[@id='SideC']";
    private String btnCheck = "//button[contains(text(),'Check')]";

    public TriangleHomePage() {
        super(driver);
    }

   
    // Metodo para navegar
    public void navigateToTriangleWeb() {
        navigateTo("https://www.developsense.com/triangle/triangle.html");
    }

    public void writeSideA(String SideA) {
        write(txtSideA, SideA);
    }

    public void writeSideB(String SideB) {
        write(txtSideB, SideB);
    }

    public void writeSideC(String SideC) {
        write(txtSideC, SideC);
    }

    public void clickBtnCheck() {
        clickElement(btnCheck);
    }


    public String getResultFromConsole() {
        // Inyectar script para capturar console.log()
        String script =
            "var result = ''; " +
            "var oldLog = console.log; " +
            "console.log = function(msg) { " +
            "  result = msg; " +
            "  document.body.insertAdjacentHTML('beforeend', '<div id=\"resultado\">' + msg + '</div>'); " +
            "  oldLog.apply(console, arguments); " +
            "}; " +
            "checkTriangle(); " +
            "console.log = oldLog;";
        ((JavascriptExecutor) driver).executeScript(script);

        // Capturar desde el DOM inyectado
        WebElement result = driver.findElement(By.id("resultado"));
        return result.getText().trim();
    }


 
 
}
