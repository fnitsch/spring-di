package example.springframework.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DE")
@Service("I18nService")
public class I18nGermanServiceGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo Welt";
    }
}
