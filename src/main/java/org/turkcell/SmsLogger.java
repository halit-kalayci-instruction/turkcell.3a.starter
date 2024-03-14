package org.turkcell;

public class SmsLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Sms ile loglandı:"+message);
    }
}
