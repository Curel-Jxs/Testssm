package cn.hfnu.ssm.test;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.springframework.context.ApplicationContext;

public class Test {
	private  SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void setUp() throws Exception {
		String resource="SqlMapConfig.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			 sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@org.junit.Test
	public void test() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
	
	
	}

}
