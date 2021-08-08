package cn.yyf.menu;

import cn.yyf.Class.*;

public  class ClassAction implements ItemAction{

	public void operate() {
		MenuItem[] items = {
				new MenuItem("添加学生课程",new AddStudentClass()),
				new MenuItem("删除学生课程",new DeleteStudentClass()),
				new MenuItem("修改学生课程",new ChangeStudentClass()),
				new MenuItem("浏览学生课程",new BrowseStudentClass()),
				new MenuItem("查找学生课程",new FindStudentClass()),
		};
		Menu menu = new Menu("学生课程管理模块",items);
		menu.selectItem();
		
	}

}
