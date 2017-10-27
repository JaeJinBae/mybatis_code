package kr.or.dgit.mybatis_code.service;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_code.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)//이름 오름차순으로 정렬해주겠다.
public class StudentServiceTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService=new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService=null;
	}

	@Test
	public void test2FindAllStudent() {
		List<Student> lists=studentService.selectAllStudent();
		Assert.assertNotNull(lists);
	}
	
	@Test
	public void test1CreateStudent() {
		Student std=new Student();
		std.setName("서현진");
		std.setEmail("bjj@naver.com");
		std.setDob(new Date());
		
	int res=studentService.createStudent(std);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test3SelectStudentByNo() {
		Student std=new Student();
		std.setStudId(1);
		
		Student selStd=studentService.selectStudentByNO(1);
		Assert.assertEquals(1, selStd.getStudId());
	}
	
	@Test
	public void testDeleteStudentByNo() {
		studentService.deleteStudentByNo(2);
	}
	
	@Test
	public void testUpdateStudent() {
		Student std=new Student();
		std.setName("홍길동");
		std.setEmail("jayz123@daum.net");
		
		studentService.updateStudent(std);
	}
}