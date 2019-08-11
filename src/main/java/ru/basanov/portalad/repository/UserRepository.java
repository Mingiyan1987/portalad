package ru.basanov.portalad.repository;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.basanov.portalad.model.User;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class UserRepository {

    private Map<String, User> users = new LinkedHashMap<>();

    @PostConstruct
    private void init() {
        merge(new User( "admin", "admin"));
        merge(new User("user", "user"));
    }

    public Collection<User> getListUser() {
        return users.values();
    }

    public void merge(final User user) {
        if (user == null) return;
        if (user.getId() == null || user.getId().isEmpty()) {
            users.put(user.getId(), user);
        }
    }

    public User findByName(String login) {
        return users.get(login);
    }
}
