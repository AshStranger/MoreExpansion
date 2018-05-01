package cn.gamemc.MoreExpansion.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import cn.gamemc.MoreExpansion.item.gui;

public class clickGui implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if ( e.getInventory().getTitle().equals("§l合成台") ) {
			// 防止固定项目被拿走
			if ( e.getCurrentItem().equals(gui.gui1) || e.getCurrentItem().equals(gui.gui2) || e.getCurrentItem().equals(gui.gui3) || e.getCurrentItem().equals(gui.gui4) || e.getCurrentItem().equals(gui.gui5) || e.getRawSlot()==24 ) {
				e.setCancelled(true);
			}
			if ( e.getCurrentItem().equals(gui.gui2) ) {
				// 打开合成表
			}
			if ( e.getCurrentItem().equals(gui.gui4) ) {
				// 点击合成
			}
			if ( e.getCurrentItem().equals(gui.gui5) ) {
				// 关闭菜单
				e.getWhoClicked().closeInventory();
			}
			if ( e.getRawSlot()==24 && e.getCurrentItem().hasItemMeta() ) {
				// 获得合成物
			}
		}
	}
	
}
