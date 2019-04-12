import com.yio.feign.Application4;
import com.yio.feign.service.ApiService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author YIO
 * @create 2019-04-1:48
 */
@SpringBootTest(classes = Application4.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
    @Resource
    private ApiService apiService;

    @org.junit.Test
    public void test() {
        System.out.println(apiService.index());
    }
    @org.junit.Test
    public void test1() {
        System.out.println(apiService.index());
    }
}
