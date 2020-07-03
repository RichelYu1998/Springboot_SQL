package cn.tedu;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
/*
* 1.dataSource变量指向的对象类型 com.zaxxer.hikari.HikariDataSource
* 2.1基于对象实例的字节码对象获取类全名
* 2.2基于断点调节方式获取具体具体类型
* */

@SpringBootTest
public class DataSourceTests {
    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;
    @Test
    public void testConnection() throws Exception{
        System.out.println(dataSource.getConnection());
    }
    
}
