package cn.gamemc.MoreExpansion.event;

import java.util.List;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class click implements Listener {
	
	@EventHandler
	// 右键实体事件
	public void clickEntity(PlayerInteractAtEntityEvent e) {
		// 对实体放置问题未来解决
		if ( e.getRightClicked().getType().equals(EntityType.ARMOR_STAND) ) {
			// 用指定工具破坏
			if ( e.getPlayer().getEquipment().getItemInMainHand().hasItemMeta() && e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().hasLore()) {
				List<String> lore = e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore();
				for ( String s : lore ) {
					if ( s.equals("§a§f§f§f§e§a§1") ) {
						if ( e.getRightClicked().getCustomName()!=null ) {
							if ( e.getRightClicked().getCustomName().equals("§a§f§f§f§d§a§1") ) {
								e.getRightClicked().remove();
							}
						}
					}
				}
			}
		}
	}

}
