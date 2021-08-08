package cn.yyf.menu;

import cn.yyf.student.AddStudentAction;
import cn.yyf.student.BrowseStudentACtion;
import cn.yyf.student.ChangeStudentAction;
import cn.yyf.student.DeleteStudentAction;
import cn.yyf.student.FindStudentAction;

public class StudentAction implements ItemAction {
	
	public void operate() {
		MenuItem[] items = {
				new MenuItem("添加学生信息",new AddStudentAction()),
				new MenuItem("删除学生信息",new DeleteStudentAction()),
				new MenuItem("修改学生信息",new ChangeStudentAction()),
				new MenuItem("浏览学生信息",new BrowseStudentACtion()),
				new MenuItem("查找学生信息",new FindStudentAction()),
		};
		Menu menu = new Menu("学生信息管理模块",items);
		menu.selectItem();
	}

}
