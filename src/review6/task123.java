package review6;

import java.util.Scanner;

public class task123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name to proceed further with execution");
        String browser = scanner.next();
        if(browser.equals("Chrome")||browser.equals("CHROME")||browser.equals("ChRoMe")){
            System.out.println("Proceed with Chrome browser");
        }else if(browser.equals("Firefox")||browser.equals("firefox")||browser.equals("FIREFOX")||browser.equals("FireFoX")){
            System.out.println("Proceed with Firefox browser");
        }else if(browser.equals("IE")){
            System.out.println("Proceed with IE browser");
        }else{
            System.out.println("Invalid browser");
        }
    }
}
