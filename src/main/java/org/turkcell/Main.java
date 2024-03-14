package org.turkcell;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Merhaba Turkcell");

        // Programlama Konseptleri
        // değişkenler - variables
        // karar yapıları - ifelse
        // döngüler - loops

        // veri_tipi degisken_ismi = başlangıç_değeri
        // Java Type-Safe
        String name = "Halit";
        System.out.println(name);
        name = "Enes";
        System.out.println(name);

        //number = "Halit";
        double number2 = 50.5; // ondalıklı sayı
        //number2 = "Enes";
        number2 = 40;
        int number = 50; // tam sayı
        String number3 = "50";
        System.out.println(number+100);
        System.out.println(number3+100);

        boolean isRegistered = true; // karar blokları
        System.out.println(number == 60);
        System.out.println(number > 20);
        System.out.println(number < 51);

        // List,Array
        int[] numbers = { 5,15,50,60,100 }; // indexler 0'dan saymaya başlanır.
        //System.out.println(numbers); // index
        System.out.println(numbers[0]); // index

        System.out.println("*************");
        // Value Type
        int number5 = 50;
        int number6 = number5;
        number6 = number6 + 10;
        System.out.println(number6);
        System.out.println(number5);

        System.out.println("*************");
        // Reference Type
        int[] numbers2 = {5,10,15,20};
        int[] numbers3 = numbers2;
        int[] numbers4 = {50,100,200};
        numbers3[3] = 200;
        System.out.println(numbers2[3]);
        System.out.println(numbers3[3]);
        System.out.println(numbers2);
        System.out.println(numbers3);
        System.out.println(numbers4);

        List numberList = new ArrayList<>();
        // Reference Type - Value Type

        // Karar blokları
        int number10 = 50;
        //Bir if bloğu yalnızca 1 karar verebilir.
        if (number10 >= 50)
        {
            // scope-blok
            System.out.println("Değer 50'den büyük");
        }
        // ---
        if(number10 == 50)
        {
            System.out.println("Değer 50'e eşit");
        }
        else
        {
            System.out.println("Değer 50'den küçük.");
        }

        int number11 = 60;
        // && => ve => her iki tarafın da true olması
        // || => veya => iki taraftan bir tanesinin true olması yeterli
        if(number10 == 50 || number11 == 61)
        {
            System.out.println("Şartlar sağlanıyor..");
        }

        int[] numbers5 = {5,10,15,20};
        // loops
        for(int i=0; i<15; i++)
        {
            System.out.println(i);
        }


        // 0.1.2.3
        for(int i=0; i<numbers5.length; i++)
        {
            int j = 0;
            System.out.println(numbers5[i]);
        }


        for(int i: numbers5) {
            System.out.println(i);
        }
        // ...


        int z = 1;
        {
            System.out.println(z);
            int j = 0;
            System.out.println(j);
        }
        {
            int j =0;
        }
        {
            int j =0;
        }
        {
            int j =0;
        }
        System.out.println(z);

        // instance = örnek
        Product product = new Product(); // constructor
        product.setName("Kahve Makinesi");
        product.setUnitPrice(8632);
        product.setStock(10);


        System.out.println("Ürün ismi:"+product.getName());

        Product product1 = new Product("Kettle", 5000, 50);

        System.out.println("Ürün ismi:"+product1.getName());

        Customer customer = new Customer("ABC123","abc","123");
        System.out.println(customer.getEmail());

        Logger logger = new ConsoleLogger();
        logger.log("Loglanacak içerik");

        User user = new User("halit@kodlama.io","123");


        UserService userService = new UserServiceImpl(new FileLogger(), new UserRepositoryImpl());
        userService.add(user);

        UserService userService2 = new UserServiceImpl(new SmsLogger(), new UserRepositoryImpl());
        userService2.add(user);

    }
}