package example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class MyServiseImpl implements MyServise {

  @Override
  @Transactional
  public void myServiseMethod(){
  }
}
