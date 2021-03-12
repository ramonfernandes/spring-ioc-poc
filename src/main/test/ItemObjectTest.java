import com.ramonfernandes.springioc.pojo.ItemObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ItemObjectTest {

    @Autowired
    @Qualifier("car")
    private ItemObject object1;

    @Autowired
    @Qualifier("book")
    private ItemObject object2;

    @Test
    public void shouldCreateACar() {
        Assertions.assertEquals("Carro", object1.getType());
    }

    @Test
    public void shouldCreateABook() {
        Assertions.assertEquals("Livro", object2.getType());
    }

}
