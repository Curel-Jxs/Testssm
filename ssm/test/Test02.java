package cn.hfnu.ssm.test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import cn.hfnu.ssmtest.mapper.TbBookMapper;
import cn.hfnu.ssmtest.po.TbBook;
import cn.hfnu.ssmtest.po.TbBookExample;

public class Test02 {
	private  SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void setUp() throws Exception {
		String resource="mybatis/sqlmapconfig.xml";
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			 sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Test
	public void testSelectByExample() {
		SqlSession sqlSession =sqlSessionFactory.openSession();
		TbBookMapper boookMapper=sqlSession.getMapper(TbBookMapper.class);
		TbBookExample tbbookExample=new TbBookExample();
		List <TbBook>list=boookMapper.selectByExample(tbbookExample);
		for (TbBook book : list) {
			System.out.println(book.getName());
		}
		
	}

	

}
