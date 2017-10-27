package kr.or.dgit.mybatis_code;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_code.util.MyBatisSqlSessionFactory;

public class MyBatisSqlSessionTest {
	private static SqlSessionFactory factory;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		factory=MyBatisSqlSessionFactory.getSqlsessionfactory();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("reatDownAfterClass()");
		factory=null;
	}

	@Test
	public void testSqlSessionFactory() {
		Assert.assertNotNull(factory);
	}
	
}
