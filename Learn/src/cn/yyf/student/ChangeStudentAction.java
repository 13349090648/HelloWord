package cn.yyf.student;

import cn.yyf.db.*;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;
/*
 * 修改学生信息
 */

public class ChangeStudentAction implements ItemAction {

	    @Override
	    public void operate() {
        Student stu = new Student();
		
		System.out.println("请输入需要修改的学生学号：");
		int no = Menu.key.nextInt();
		
		System.out.println("姓名:");
		stu.setName(Menu.key.next());
		
		System.out.println("性别:");
		stu.setGender(Menu.key.next());
		
		
		String sql = " update  t_student set stu_name=?, gender=? where stu_no=?";
				
		DbUtil db = new DbUtil();
		db.update(sql, stu.getName(), stu.getGender(),no);
		db.close();		

	}

}
