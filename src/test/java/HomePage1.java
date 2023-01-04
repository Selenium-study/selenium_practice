import Pages.AllPages;
import org.junit.Test;

public class HomePage1 {

    @Test
    public void test(){
        AllPages allPage=new AllPages();
        allPage.homePage().clickShopButton();
    }
}
