package mavendemo.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestEmployeeRepository.class, TestEmployeeRepositoryJDBC.class })
public class AllTests {

}
