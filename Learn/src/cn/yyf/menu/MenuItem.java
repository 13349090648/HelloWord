package cn.yyf.menu;

/**
 *菜单项
 */
public class MenuItem {
	private String title;//菜单项文字
	
	private ItemAction action;//菜单项的操作
	
	public MenuItem(String title,ItemAction action) {
		this.title = title;
		this.action = action;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ItemAction getAction() {
		return action;
	}

	public void setAction(ItemAction action) {
		this.action = action;
	}

}
