package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class MyRepositoryImpl implements MyRepository {

  @Autowired
  EntityManager entityManager;

  @Override
  public void myRepositoryMethod() {
    return;
  }
}
