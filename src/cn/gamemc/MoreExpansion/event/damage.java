package cn.gamemc.MoreExpansion.event;

import cn.gamemc.MoreExpansion.build.buildPacket;
import cn.gamemc.MoreExpansion.main.main;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;

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
			if ( main.instance.getConfig().getBoolean("Settings.damageTitle")==true ) {
				if ( main.pm!=null ) {
					buildPacket.sendTitle(player, "", "§c- §6" + e.getDamage(), 0, 10, 0);
				}
			}
			// 全息击杀伤害显示
			if ( Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
				if ( main.instance.getConfig().getBoolean("Settings.damageHologram")==true ) {
					Hologram damageHologram = HologramsAPI.createHologram(main.getPlugin(main.class), e.getEntity().getLocation().add(0.0D, 3D, 0.0D));
					damageHologram.appendTextLine("§c- §6" + e.getDamage());
					// 延时任务
					  Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
						  public void run() {
							  damageHologram.delete();
						  }
					  }, 10L);
				}
			}
		}
	}
}
