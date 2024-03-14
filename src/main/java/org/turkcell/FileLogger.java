package org.turkcell;

// class extends class
// class implements interface
public class FileLogger extends BaseLogger
{

    @Override
    public void log(String message)
    {
        System.out.println("File log:"+message);
        // .. somut kısım
    }
}
