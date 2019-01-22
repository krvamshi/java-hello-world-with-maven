package hello;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloWorldTest {

  private static Greeter helloWorld;

  @BeforeClass
  public static void initVals(){
    System.out.println("Before class is loaded the values are initialized");
    helloWorld = new Greeter();

  }

  @Before
  public void beforeEachTest(){
    System.out.println("Executed before each test");
  }

  @After
  public void afterEachTest(){
    System.out.println("Executed after each test");
  }

  @Test
  public void testHelloWorld(){
    String result = helloWorld.sayHello();
    Assert.assertEquals(Greeter.message,result);
  }

  @Test
  public void testHelloWorld2(){
    String result = helloWorld.sayHello();
    Assert.assertNotEquals("",result);
  }

}
