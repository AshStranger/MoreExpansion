package cn.gamemc.MoreExpansion.skill;

import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class skillShoot implements Listener {
	
	@EventHandler
	public void onClick(PlayerInteractEvent e) {
		if ( e.getAction()==Action.RIGHT_CLICK_AIR ) {
			skillAll.lineParticle(e.getPlayer(), Particle.VILLAGER_HAPPY, 12);
		}
	}
	
}
