package cn.gamemc.MoreExpansion.event;

import cn.gamemc.MoreExpansion.build.buildPacket;
import cn.gamemc.MoreExpansion.main.main;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;

public class damage implements Listener {
	
	@EventHandler
	public void onAttack(EntityDamageByEntityEvent e) {
		// �ж�ʩ���˺���ʵ������
		if ( e.getDamager().getType().equals(EntityType.PLAYER) ) {
			Player player = (Player)e.getDamager();
			// �ж�����װ��
			if ( player.getEquipment().getItemInMainHand().getItemMeta() != null ) {
				// �ж�ע��
				List<String> lore = player.getEquipment().getItemInMainHand().getItemMeta().getLore();
				if ( lore != null ) {
					for (String s : lore) {
						//�˺�����
						if (s.startsWith("��f       ��7��l[��f��l-��7��l]��f ��6�˺�")) {
		        			String damageInt = s.replace("��f       ��7��l[��f��l-��7��l]��f ��6�˺� ��f", "");
		        			int damage = Integer.valueOf(damageInt).intValue();
		        			e.setDamage(damage);
		        			player.setFoodLevel(6);
						}
					}
				}
			}
			// ��Ļ�˺���ʾ
			if ( main.pm!=null ) {
				if ( main.here.getConfig().getBoolean("Settings.Title.damage.text")==true ) {
					buildPacket.sendTitle(player, "", "��c- ��6" + e.getDamage(), 0, 10, 0);
				}
			}
			// ȫϢ�˺���ʾ
			if ( Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
				if ( main.here.getConfig().getBoolean("Settings.Hologram.damage.text")==true ) {
					Hologram damageHologram = HologramsAPI.createHologram(main.getPlugin(main.class), e.getEntity().getLocation().add(0.0D, 3D, 0.0D));
					damageHologram.appendTextLine("��c��l- ��6��l" + e.getDamage());
					// ��ʱ����
					Bukkit.getScheduler().scheduleSyncDelayedTask(main.getPlugin(main.class), new Runnable() {
						public void run() {
							damageHologram.delete();
						}
					}, 10L);
				}else if ( main.here.getConfig().getBoolean("Settings.Hologram.damage.item")==true ) {
					Hologram damageHologram = HologramsAPI.createHologram(main.getPlugin(main.class), e.getEntity().getLocation().add(0.0D, 3D, 0.0D));
					damageHologram.appendTextLine("��c��l- ��6��l" + e.getDamage());
					ItemStack hologramItem = new ItemStack(Material.MAGMA_CREAM);
					damageHologram.appendItemLine(hologramItem);
					// ��ʱ����
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
