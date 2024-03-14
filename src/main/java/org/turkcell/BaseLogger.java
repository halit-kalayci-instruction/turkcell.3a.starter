package org.turkcell;

public abstract class BaseLogger implements Logger
{
    //public String LOG_TYPE = "INFO";
    public void logMessage(String message) {
        System.out.println("BaseLogger'dan geçti");
        log(message);
        System.out.println("BaseLogger'dan çıkıyor..");
    }
}
// 9:00