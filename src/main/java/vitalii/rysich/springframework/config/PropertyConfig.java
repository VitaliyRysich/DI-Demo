package vitalii.rysich.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import vitalii.rysich.springframework.examplebeans.FakeDataSource;
import vitalii.rysich.springframework.examplebeans.FakeJmsBroker;

@Configuration
public class PropertyConfig {

    @Value("${rysich.username}")
    String user;
    @Value("${rysich.password}")
    String password;
    @Value("${rysich.dburl}")
    String url;

    @Value("${rysich.jms.username}")
    String jmsUsername;
    @Value("${rysich.jms.password}")
    String jsmPassword;
    @Value("${rysich.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUsername);
        fakeJmsBroker.setPassword(jsmPassword);
        fakeJmsBroker.setUrl(jmsUrl);
        return fakeJmsBroker;
    }



    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
