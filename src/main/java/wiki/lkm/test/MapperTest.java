package wiki.lkm.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wiki.lkm.bean.User;
import wiki.lkm.dao.UserMapper;

/**
 * 测试dao层的工作
 * @author lfy
 *推荐Spring的项目就可以使用Spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	SqlSession sqlSession;

	/**
	 * 测试DepartmentMapper
	 */
	@Test
	public void testCRUD(){
		//1、创建SpringIOC容器
		//ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、从容器中获取mapper
		//UserMapper userMapper = ioc.getBean(UserMapper.class);
		
		
		
		System.out.println(userMapper.selectByExample(null));
		//System.out.println(userMapper.selectByPrimaryKey(1));
		
	}

	
}
