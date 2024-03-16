package tage.tag27;

public class WebSeite {

    public static void main(String[] args) {
        // öffnen den Browser mit dem firefox
        // navigieren wir zu wwww.amazon.de
        // geben wir unseren Benutzernamen ein
        // geben wir ein passwort ein
        // drucken wir auf enter

        openBrowser();
        navigateToPage();
        enterUserName();
        enterPassword();
        pressEnter();
        System.out.println("***");

        amazonlogin();

    }
    static void openBrowser () {
        System.out.println("Öffne Firefox Browser");
    }

    static void enterUserName () {
        System.out.println("Gebe den Nutzernamen ein");
    }

    static void navigateToPage () {
        System.out.println("Navigiere zur Amazon Page");
    }

    static void enterPassword () {
        System.out.println("Gebe den Password ein ");
    }

    public static void pressEnter () {
        System.out.println("Drucke ENTER");
    }

    public static void amazonlogin () {

        // kisa yol ile hepsini tek yerde yazdirdim

        openBrowser();
        navigateToPage();
        enterUserName();
        enterPassword();
        pressEnter();

    }



}
