package cn.gamemc.MoreExpansion.event;

import java.util.List;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class click implements Listener {
	
	@EventHandler
	// �Ҽ�ʵ���¼�
	public void clickEntity(PlayerInteractAtEntityEvent e) {
		// ��ʵ���������δ�����
		if ( e.getRightClicked().getType().equals(EntityType.ARMOR_STAND) ) {
			// ��ָ�������ƻ�
			if ( e.getPlayer().getEquipment().getItemInMainHand().hasItemMeta() && e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().hasLore()) {
				List<String> lore = e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore();
				for ( String s : lore ) {
					if ( s.equals("��a��f��f��f��e��a��1") ) {
						if ( e.getRightClicked().getCustomName()!=null ) {
							if ( e.getRightClicked().getCustomName().equals("��a��f��f��f��d��a��1") ) {
								e.getRightClicked().remove();
							}
						}
					}
				}
			}
		}
	}

}
