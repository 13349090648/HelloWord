package cn.yyf.score;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;

/*
 * 删除学生成绩
 */

public class DeleteStudentScore implements ItemAction {

	    @Override
	    public void operate() {
        Score stu = new Score();
		
		System.out.println("输入需要删除的学生学号");
        stu.setNo(Menu.key.next());
        
        String sql = "DELETE FROM t_score WHERE stu_no = ?";
		
		DbUtil db = new DbUtil();
		db.update(sql, stu.getNo());
		db.close();		


	}

}
