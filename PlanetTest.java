import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PlanetTest{

  Planet planet;

  @Before
  public void before(){
    planet = new Planet("Earth", 6371);
  }

  @Test
  public void hasName(){
    assertEquals("Earth", planet.getName());
  }

  @Test
  public void hasSize(){
    assertEquals(6371, planet.getSize());
  }

  @Test
  public void explode(){
    assertEquals("Boom! Earth has exploded.", planet.explode());
  }

}