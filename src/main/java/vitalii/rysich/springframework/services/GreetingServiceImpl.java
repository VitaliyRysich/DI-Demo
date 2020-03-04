package vitalii.rysich.springframework.services;

public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO = "Hello people!!!";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
