package cn.yyf.Class;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;

/*
 * 修改学生课程
 */
public class ChangeStudentClass implements ItemAction {

     	@Override
	    public void operate() {
        course stu = new course();
		
		System.out.println("请输入需要修改的学生课程：");
		String cou = Menu.key.next();
		
		System.out.println("请输入需要修改后的学生课程：");
		stu.setCourse(Menu.key.next());
		
		String sql = " update  t_course set stu_course=? where stu_course = ?";
				
		DbUtil db = new DbUtil();
		db.update(sql, stu.getCourse(),cou);
		db.close();		

	}

}
