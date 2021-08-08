package cn.yyf.score;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;
/*
 * 添加学生成绩
 */
import cn.yyf.menu.Menu;

public class AddStudentScore implements ItemAction {
		   @Override
	       public void operate() {
	       Score stu = new Score();
	       
	       System.out.println("学号:");
	       stu.setNo(Menu.key.next());
	       
	       System.out.println("课程:");
	       stu.setCourse(Menu.key.next());
	       
	       System.out.println("成绩:");
	       stu.setScore(Menu.key.next());
	       
	       String sql = "INSERT INTO t_score(stu_no,stu_course,stu_score)"
					+  "VALUES(?,?,?)";
	       
	       DbUtil db = new DbUtil();
			db.update(sql,stu.getNo(), stu.getCourse(),stu.getScore());
			db.close();
	       
	 }

}
