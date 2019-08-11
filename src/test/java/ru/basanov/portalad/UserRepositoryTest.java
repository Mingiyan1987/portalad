package ru.basanov.portalad;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import ru.basanov.portalad.model.User;
import ru.basanov.portalad.repository.UserRepository;

import static junit.framework.TestCase.assertTrue;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repository;

    @Test
    public void findByNameTest() {
        this.entityManager.persist(new User("user1", "123"));
        User user = this.repository.findByName("user1");

        assertTrue(user.getLogin().equals("user1"));
        assertTrue(user.getPassword().equals("123"));
    }
}
