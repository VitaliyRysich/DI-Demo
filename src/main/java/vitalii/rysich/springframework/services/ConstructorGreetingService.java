package vitalii.rysich.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hell - I was injected via the constructor!!!";
    }
}
