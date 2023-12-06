package cn.sfcoder;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan("cn.sfcoder.mapper")
class UserCenterApplicationTests {

    @Test
    void contextLoads() {

    }

}
