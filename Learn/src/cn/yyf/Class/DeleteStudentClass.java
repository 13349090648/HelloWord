package cn.yyf.Class;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;

/*
 * 删除学生课程
 */

public class DeleteStudentClass implements ItemAction {

	    @Override
	    public void operate() {
	    course stu = new course();
		
		System.out.println("输入需要删除的学生学号");
        stu.setNo(Menu.key.next());
        
        String sql = "DELETE FROM t_Course WHERE stu_no = ?";
		
		DbUtil db = new DbUtil();
		db.update(sql, stu.getNo());
		db.close();		
	}
}


