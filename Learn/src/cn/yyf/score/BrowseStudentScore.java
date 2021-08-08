package cn.yyf.score;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;

/*
 * 浏览学生成绩
 */

public class BrowseStudentScore implements ItemAction {
	
		    @Override
	     	public void operate() {
	        System.out.printf("%6s%10s%10s\n", "学号","课程","成绩");
			
			DbUtil db = new DbUtil();
			String sql = "SELECT * FROM t_score ORDER BY (stu_no)";
			ResultSet rs = db.query(sql);
			
			try {
				while (rs.next()) {
					System.out.printf("%8s%12s%10s\n"
							,rs.getString("stu_no")
							,rs.getString("stu_course")
					        ,rs.getString("stu_score"));
							
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
				db.close();

		}

	}


