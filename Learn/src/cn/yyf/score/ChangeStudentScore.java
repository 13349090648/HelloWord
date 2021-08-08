package cn.yyf.score;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;

/*
 * 修改学生成绩
 */

public class ChangeStudentScore implements ItemAction {

	    @Override
	    public void operate() {
        Score stu = new Score();
		
        System.out.println("请输入需要修改的学生学号：");
		int no = Menu.key.nextInt();
		
		System.out.println("课程:");
		stu.setCourse(Menu.key.next());
		
		System.out.println("成绩:");
		stu.setScore(Menu.key.next());
		
		
		String sql = " update  t_score set stu_course=?, stu_score=? where stu_no=?";
				
		DbUtil db = new DbUtil();
		db.update(sql, stu.getCourse(), stu.getScore(),no);
		db.close();		

	}

}
