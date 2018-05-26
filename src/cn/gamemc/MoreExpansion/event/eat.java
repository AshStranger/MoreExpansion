package cn.gamemc.MoreExpansion.event;

import java.util.List;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import cn.gamemc.MoreExpansion.main.configFood;
import cn.gamemc.MoreExpansion.main.main;

public class eat implements Listener {
	
	@EventHandler
	public void onEat(PlayerItemConsumeEvent e) {
		if ( e.getItem().getItemMeta().hasLore() ) {
			List<String> getLore = e.getItem().getItemMeta().getLore();
			for ( String lore : getLore ) {
				if ( lore.equals("��a��f��f��f��c��a��1") ) {
					if ( configFood.foodYml.getBoolean("food.food1.enable")!=false ) {
						int playerFood = e.getPlayer().getFoodLevel();
						int configFood = main.here.getConfig().getInt("food.food1.addFood");
						if ( configFood!=0 ) {
							e.getPlayer().setFoodLevel(playerFood+configFood);
						}
					}
				}
			}
		}
	}
	
}
