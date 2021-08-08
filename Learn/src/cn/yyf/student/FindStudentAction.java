package cn.yyf.student;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.yyf.db.*;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;


/*
 * 查找学生信息
 */
public class FindStudentAction implements ItemAction {

	    @Override
     	public void operate() {
        Student stu = new Student();
		
        System.out.println("请输入需要查找的学生学号：");
        stu.setNo(Menu.key.next());
        	
		String sql ="SELECT * FROM t_student WHERE stu_no=?";
		
		DbUtil db = new DbUtil();
		db.query(sql, stu.getNo());
		ResultSet rs = db.query(sql);
		
		try {
			while (rs.next()) {
				System.out.printf("%2s%10s%10s\n", "学号","姓名","性别");

				System.out.printf("%2s%10s%10s\n"
						,rs.getString("stu_no")
						,rs.getString("stu_name")
						,rs.getString("gender"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}  
		db.close();		
	}

}
