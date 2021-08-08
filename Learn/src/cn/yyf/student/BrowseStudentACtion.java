package cn.yyf.student;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.yyf.db.*;
import cn.yyf.menu.ItemAction;

/*
 * 浏览学生信息
 */

public class BrowseStudentACtion implements ItemAction {

	@Override
	public void operate() {
		System.out.printf("%8s%10s%6s\n", "学号","姓名","性别");
		
		DbUtil db = new DbUtil();
		String sql = "SELECT * FROM t_student ORDER BY stu_no";
		ResultSet rs = db.query(sql);
		
		try {
			while (rs.next()) {
				System.out.printf("%10s%10s%6s\n"
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
