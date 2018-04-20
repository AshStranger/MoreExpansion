package cn.gamemc.MoreExpansion.event;

import cn.gamemc.MoreExpansion.build.buildPacket;
import cn.gamemc.MoreExpansion.main.main;

import java.util.List;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class damage implements Listener {
	@EventHandler
	public void onAttack(EntityDamageByEntityEvent e) {
		// 判断施加伤害的实体类型
		if ( e.getDamager().getType().equals(EntityType.PLAYER) ) {
			Player player = (Player)e.getDamager();
			// 判断主手装备
			if ( player.getEquipment().getItemInMainHand().getItemMeta() != null ) {
				// 判断注释
				List<String> lore = player.getEquipment().getItemInMainHand().getItemMeta().getLore();
				if ( lore != null ) {
					for (String s : lore) {
						//伤害属性
						if (s.startsWith("§f       §7§l[§f§l-§7§l]§f §6伤害")) {
		        			String damageInt = s.replace("§f       §7§l[§f§l-§7§l]§f §6伤害 §f", "");
		        			int damage = Integer.valueOf(damageInt).intValue();
		        			e.setDamage(damage);
						}
					}
				}
			}
			// 弹幕击杀伤害显示
			if ( main.instance.getConfig().getBoolean("Settings.danageTitle")==true ) {
				if ( main.pm!=null ) {
					buildPacket.sendTitle(player, "", "§c- §6" + e.getDamage(), 0, 10, 0);
				}
			}
		}
	}
}
