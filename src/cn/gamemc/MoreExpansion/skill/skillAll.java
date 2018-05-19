package cn.gamemc.MoreExpansion.skill;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import cn.gamemc.MoreExpansion.main.main;

public class skillAll {
	
	// 粒子
	// 直线射击
	public static void lineParticle(Player player, Particle particle, int number) {
		// 玩家坐标
		Location loc = player.getLocation();
		// 玩家向量
		Vector vector = loc.getDirection();
		// 修改坐标
		loc.add(0, 1, 0);
		loc.add(vector);
        new BukkitRunnable() {
        	int endNumber = 0;
            @Override
            public void run() {
            	loc.add(vector);
            	player.getWorld().spawnParticle(particle, loc, 1);
            	int particleX = (int) loc.getX();
            	int particleY = (int) loc.getY();
            	int particleZ = (int) loc.getZ();
            	for ( Entity entity : player.getNearbyEntities(number, number, number) ) {
            		// 击中实体
            		if ( (int) entity.getLocation().getX()==particleX && (int) entity.getLocation().getY()==particleY && (int) entity.getLocation().getZ()==particleZ ) {
            			// 做
            			cancel();
            		}
            	}
            	if ( endNumber==number ) cancel();
                endNumber++;
            }
        }.runTaskTimer(main.here, 0, 1);
	}

}
