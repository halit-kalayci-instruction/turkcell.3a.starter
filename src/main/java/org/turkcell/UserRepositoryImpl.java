package org.turkcell;

public class UserRepositoryImpl implements UserRepository{
    @Override
    public void addToDb(User user) {
        System.out.println("Veritabanına eklendi..");
    }
}
