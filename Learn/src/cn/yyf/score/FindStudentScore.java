package cn.yyf.score;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.yyf.db.DbUtil;
import cn.yyf.menu.ItemAction;
import cn.yyf.menu.Menu;

/*
 * 查找学生成绩
 */

public class FindStudentScore implements ItemAction {

	        @Override
	        public void operate() {
	       		
	        Score stu = new Score();
			
	        System.out.println("请输入需要查找的学生学号：");
	        stu.setScore(Menu.key.next());
	        	
			String sql ="SELECT * FROM t_score WHERE stu_no=?";
			
			DbUtil db = new DbUtil();
			db.query(sql, stu.getScore());
			ResultSet rs = db.query(sql);
			
				 
			try {
				while (rs.next()) {
					System.out.printf("%2s%10s%10s\n", "学号","课程","成绩");
					System.out.printf("%2s%10s%10s\n"
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


