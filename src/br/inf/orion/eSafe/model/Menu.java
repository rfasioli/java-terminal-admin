package br.inf.orion.eSafe.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private Funcionalidade menu = null;
	private List<Funcionalidade> submenus = null;
	
	
	public Funcionalidade getMenu() {
		return menu;
	}
	
	public void setMenu(Funcionalidade menu) {
		this.menu = menu;
	}
	
	public List<Funcionalidade> getSubmenus() {
		return submenus;
	}
	
	public void setSubmenus(List<Funcionalidade> submenus) {
		this.submenus = submenus;
	}

	public void addSubmenu(Funcionalidade submenu) {
		if (submenus == null)
			submenus = new ArrayList<Funcionalidade>();
		this.submenus.add(submenu);
	}

	
	public Menu() {
	}
	
	
	public Menu(Funcionalidade pMenu) {
		menu = pMenu;
	}
	
}
