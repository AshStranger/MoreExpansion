package cn.gamemc.MoreExpansion.skill;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import cn.gamemc.MoreExpansion.main.configArms;
import cn.gamemc.MoreExpansion.main.main;

public class skillAll {
	
	// ����
	// ֱ�����
	public static void lineParticle(Player player, Particle particle, int number) {
		// �������
		Location loc = player.getLocation();
		// �������
		Vector vector = loc.getDirection();
		// �޸�����
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
            		// ����ʵ��
            		if ( (int) entity.getLocation().getX()==particleX && (int) entity.getLocation().getY()==particleY && (int) entity.getLocation().getZ()==particleZ ) {
            			if ( !entity.getType().equals(EntityType.PLAYER) && !entity.getType().equals(EntityType.DROPPED_ITEM) ) {
            				LivingEntity hurter = (LivingEntity) entity;
            				hurter.damage(configArms.armsYml.getInt("arms.arm5.spellsDamage"));
            				ydxzParticle(entity, Particle.END_ROD);
            				cancel();
            			}
            		}
            	}
            	if ( endNumber==number ) cancel();
                endNumber++;
            }
        }.runTaskTimer(main.here, 0, 1);
	}
	
	// ԭ����ת����
	public static void ydxzParticle(Entity entity, Particle particle) {
        Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
			public void run() {
				Location loc1 = entity.getLocation();
				loc1.add(1, 1, 0);
				entity.getWorld().spawnParticle(particle, loc1, 3);
		        Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
					public void run() {
						Location loc1 = entity.getLocation();
						loc1.add(0, 1, 1);
						entity.getWorld().spawnParticle(particle, loc1, 3);
				        Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
							public void run() {
								Location loc1 = entity.getLocation();
								loc1.add(-1, 1, 0);
								entity.getWorld().spawnParticle(particle, loc1, 3);
						        Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
									public void run() {
										Location loc1 = entity.getLocation();
										loc1.add(0, 1, -1);
										entity.getWorld().spawnParticle(particle, loc1, 3);
									}
								}, 10L);
							}
						}, 10L);
					}
				}, 10L);
			}
		}, 10L);
	}

}
