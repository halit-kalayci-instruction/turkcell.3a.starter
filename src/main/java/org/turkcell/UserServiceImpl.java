package org.turkcell;

public class UserServiceImpl implements UserService
{
    // Dependency Injection Pattern
    // CTOR Dep. Injection
    BaseLogger logger;
    UserRepository repository;

    public UserServiceImpl(BaseLogger logger, UserRepository repository) {
        this.logger = logger;
        this.repository = repository;
    }

    // SOLID -> S -> Single Responsibility Principle
    // D -> Dependency Inversion Principle
    // DRY
    @Override
    public void add(User user) {
        // İş kodları => Validation,İş kuralı, Authorization
        // Loglama..
        // Veritabanı kayıt atmak..
        System.out.println("İş kuralları çalıştı");
        logger.logMessage("Merhaba");
        repository.addToDb(user);
    }

    @Override
    public void update(User user) {
        logger.logMessage("Merhaba");
        System.out.println(user.getEmail() + " kullanıcı güncellendi.");
    }
}
