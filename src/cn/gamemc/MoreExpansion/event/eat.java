package cn.gamemc.MoreExpansion.event;

import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import cn.gamemc.MoreExpansion.build.buildPacket;
import cn.gamemc.MoreExpansion.main.main;

public class eat implements Listener {
	
	@EventHandler
	public void onEat(PlayerItemConsumeEvent e) {
		if ( e.getItem().getItemMeta().hasLore() ) {
			List<String> getLore = e.getItem().getItemMeta().getLore();
			for ( String lore : getLore ) {
				if ( lore.equals("¡ìa¡ìf¡ìf¡ìf¡ìc¡ìa¡ì1") ) {
					if ( main.instance.getConfig().getBoolean("food.food1.enable")!=false ) {
						int playerFood = e.getPlayer().getFoodLevel();
						int configFood = main.instance.getConfig().getInt("food.food1.addFood");
						if ( configFood!=0 ) {
							e.getPlayer().setFoodLevel(playerFood+configFood);
							if ( main.instance.getConfig().getBoolean("Settings.addFoodTitle")==true ) {
								buildPacket.sendTitle(e.getPlayer(), "¡ìa+ "+configFood, "¡ì6¼¢¶öÖµ", 0, 20, 0);
							}
						}
					}
				}
			}
		}
	}
	
}
