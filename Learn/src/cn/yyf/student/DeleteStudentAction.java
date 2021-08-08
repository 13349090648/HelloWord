package cn.yyf.student;

import cn.yyf.db.*;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;

/*
 * 删除学生信息
 */

public class DeleteStudentAction implements ItemAction{

	@Override
	public void operate() {
		Student stu = new Student();
		
		System.out.println("输入需要删除学生的学号");
        stu.setNo(Menu.key.next());
		
		String sql = "DELETE FROM t_student WHERE stu_no = ?";
		
		DbUtil db = new DbUtil();
		db.update(sql, stu.getNo());
		db.close();		
	}

}
		
	


