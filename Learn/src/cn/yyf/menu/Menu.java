package cn.yyf.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 菜单
 */

public class Menu {
	public static Scanner key;
	private String title;//菜单的标题文字
	private MenuItem [] Items;//菜单项
	private boolean isTop = false;//最后一项选择
	

	public Menu(String title,MenuItem [] items) {
		this.Items = items;
		this.title = title;
	}
	
	public Menu(String title,MenuItem [] items,boolean isTop) {
		this(title,items);
		this.isTop = isTop;
	}
	/*
	 * 显示菜单内容
	 */
	public void showMenu() {
		System.out.println(title);
		System.out.println("--------------------");
		for(int i=0;i<Items.length;i++) {
			System.out.printf("%d、%s\n", i+1, Items[i].getTitle());
		}
		System.out.printf("%d、%s\n", Items.length+1,isTop?"退出":"返回");
		System.out.println("--------------------");
		System.out.println("请选择菜单项编号");
	}
	/*
	 * 选择菜单编号执行对应操作
	 */
	public void selectItem() {
		if (key==null) key = new Scanner(System.in);
		
		while(true) {
			showMenu();
			try {
				int itemIndex = key.nextInt();
				
				if(itemIndex>0 && itemIndex<=Items.length) {
					ItemAction action = Items[itemIndex-1].getAction();
					if(action!=null) {
						action.operate();
					}
				}
				else if (itemIndex==Items.length+1) {
					break;
				}
				else {
					System.out.println("菜单项编号输入错误");
				}
			}catch(InputMismatchException e) {
				System.out.println("菜单项编号输入错误");
				if(key.hasNext()) key.next();
			}
		}
	}

}
