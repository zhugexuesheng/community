import com.gxa.springbootmain.Springbootmain;
import com.gxa.springbootmain.mapper.YongHuXinXiMapper;
import com.gxa.springbootmain.service.impl.DengluServiceImpl;
import com.gxa.springbootmain.service.impl.YongHuXinXiServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author zhangyujin
 * @version 1.0
 * @description test.java
 * @date 2021/2/14 21:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springbootmain.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class test {
    @Resource
    private YongHuXinXiMapper yongHuXinXiMapper;
    @Test
    public void test01(){
        System.out.println(yongHuXinXiMapper.chaXunByYongHuMingAndMima("zyj","123456"));
    }
}
