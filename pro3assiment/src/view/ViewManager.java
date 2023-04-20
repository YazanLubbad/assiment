package view;


import java.io.IOException;

public class ViewManager {
   public static RegisterPage logPage;
    public static CurrencyConversionView CurrencyPage;
    

    private ViewManager() {
    }
   public static void openlogPage(){
        if (logPage == null) {
            logPage = new RegisterPage();
            logPage.getLoginController();
        } else {
            logPage.getLoginController();
        }
   }
   
    public static void closelogPage(){
        if(logPage != null)
            logPage.close();
    }
   
    public static void openCurrencyConversionPage() throws IOException{
        if (CurrencyPage == null) {
            CurrencyPage = new CurrencyConversionView();
            CurrencyPage.getCurrencyConversionController();
        } else {
            CurrencyPage.getCurrencyConversionController();
        }
        
    }
     public static void closeCurrencyConversionPage(){
        if(CurrencyPage != null)
            CurrencyPage.close();
    }
}
