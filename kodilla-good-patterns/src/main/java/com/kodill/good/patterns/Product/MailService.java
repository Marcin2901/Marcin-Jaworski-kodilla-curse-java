package com.kodill.good.patterns.Product;

public class MailService implements InformationService{
    @Override
    public void send(User user) {
        System.out.println("Email send to " + user.getName() + " " + user.getSurname() + " for email: " + user.getEmail());
    }
}
