import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        Assertions.assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assessPassword("1sd!"));
    }

    @Test
    public void weak_when_has_only_letters(){
        Assertions.assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assessPassword("acbdefghdsffdfff"));
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        Assertions.assertEquals(PasswordUtil.SecurityLevel.MEDIUM,PasswordUtil.assessPassword("acbsddssddd12345555555"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols(){
        Assertions.assertEquals(PasswordUtil.SecurityLevel.STRONG,PasswordUtil.assessPassword("acbd12$!"));
    }


}