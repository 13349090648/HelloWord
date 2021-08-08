package cn.yyf.Class;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;

/*
 * 添加学生课程
 */

public class AddStudentClass implements ItemAction {

	        @Override
			public void operate() {
			course stu = new course();
			
			System.out.print("学号:");
			stu.setNo(Menu.key.next());
			
			System.out.print("请输入添加课程: ");
			stu.setCourse(Menu.key.next());
			
            String sql = "INSERT INTO t_course(stu_no,stu_course)"
					+  "VALUES(?,?)";
	
			DbUtil db = new DbUtil();
			db.update(sql,stu.getNo(), stu.getCourse());
			db.close();		
		

	}

}
