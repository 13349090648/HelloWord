package cn.yyf.Class;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;

/*
 * 查询课程信息
 */

public class FindStudentClass implements ItemAction {

	    @Override
	    public void operate() {
        course stu = new course();
		
        System.out.println("请输入需要查找的学生学号：");
        stu.setCourse(Menu.key.next());
        	
		String sql ="SELECT * FROM t_course WHERE stu_no=?";
		
		DbUtil db = new DbUtil();
		db.query(sql, stu.getCourse());
		ResultSet rs = db.query(sql);
		
		try {
			while (rs.next()) {
				System.out.printf("%2s%10s\n", "学号","课程");
				System.out.printf("%2s%10s\n"
						,rs.getString("stu_no")
						,rs.getString("stu_course"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}  
		db.close();		
	}

}
