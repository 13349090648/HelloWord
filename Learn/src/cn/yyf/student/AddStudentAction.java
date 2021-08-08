package cn.yyf.student;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;

/**
 * 添加学生信息
 */

public class AddStudentAction implements ItemAction{

	@Override
	public void operate() {
		Student stu = new Student();
		
		System.out.print("学号:");
		stu.setNo(Menu.key.next());
		
		System.out.print("姓名:");
		stu.setName(Menu.key.next());
		
		System.out.print("性别:");
		stu.setGender(Menu.key.next());
		
		String sql = "INSERT INTO t_student(stu_no,stu_name,gender)"
				+ "VALUES(?,?,?)";
		DbUtil db = new DbUtil();
		db.update(sql, stu.getNo(), stu.getName(), stu.getGender());
		db.close();		
	}

}
