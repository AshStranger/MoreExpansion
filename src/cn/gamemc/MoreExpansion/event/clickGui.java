package cn.gamemc.MoreExpansion.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import cn.gamemc.MoreExpansion.item.gui;

public class clickGui implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if ( e.getInventory().getTitle().equals("��l�ϳ�̨") ) {
			// ��ֹ�̶���Ŀ������
			if ( e.getCurrentItem().equals(gui.gui1) || e.getCurrentItem().equals(gui.gui2) || e.getCurrentItem().equals(gui.gui3) || e.getCurrentItem().equals(gui.gui4) || e.getCurrentItem().equals(gui.gui5) || e.getRawSlot()==24 ) {
				e.setCancelled(true);
			}
			if ( e.getCurrentItem().equals(gui.gui2) ) {
				// �򿪺ϳɱ�
			}
			if ( e.getCurrentItem().equals(gui.gui4) ) {
				// ����ϳ�
			}
			if ( e.getCurrentItem().equals(gui.gui5) ) {
				// �رղ˵�
				e.getWhoClicked().closeInventory();
			}
			if ( e.getRawSlot()==24 && e.getCurrentItem().hasItemMeta() ) {
				// ��úϳ���
			}
		}
	}
	
}
