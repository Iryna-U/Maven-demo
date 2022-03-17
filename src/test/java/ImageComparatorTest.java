import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Unit-level testing for ImageComparator")
class ImageComparatorTest {

    private final ImageComparator imageComparator = new ImageComparator();

    @Test
    public void getNumberTest() {
        Integer number = imageComparator.getNumber();
        Assertions.assertNotNull(number);
    }

}