package cn.yyf.menu;

import cn.yyf.score.*;

public class ScoreAction implements ItemAction{

	public void operate() {
			MenuItem[] items = {
					new MenuItem("添加学生成绩",new AddStudentScore()),
					new MenuItem("删除学生成绩",new DeleteStudentScore()),
					new MenuItem("修改学生成绩",new ChangeStudentScore()),
					new MenuItem("浏览学生成绩",new BrowseStudentScore()),
					new MenuItem("查找学生成绩",new FindStudentScore()),
			};
			Menu menu = new Menu("学生成绩管理模块",items);
			menu.selectItem();
			
		}
		
	}


