import cn.yyf.menu.ClassAction;
import cn.yyf.menu.Menu;
import cn.yyf.menu.MenuItem;
import cn.yyf.menu.ScoreAction;
import cn.yyf.menu.StudentAction;


public class MainClass {
	public static void main(String[] args) {
		MenuItem[]mainMenuItems = {
				new MenuItem("学生信息管理",new StudentAction()),
				new MenuItem("课程信息管理",new ClassAction()),
				new MenuItem("成绩管理",new ScoreAction()),
		};
		
		Menu mainMenu = new Menu("学生管理系统",mainMenuItems,true);
		mainMenu.selectItem();
		if(Menu.key!=null) Menu.key.close();
	}
}
