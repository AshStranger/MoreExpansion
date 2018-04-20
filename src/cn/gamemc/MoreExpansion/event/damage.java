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
						}
					}
				}
			}
			// ��Ļ��ɱ�˺���ʾ
			if ( main.instance.getConfig().getBoolean("Settings.danageTitle")==true ) {
				if ( main.pm!=null ) {
					buildPacket.sendTitle(player, "", "��c- ��6" + e.getDamage(), 0, 10, 0);
				}
			}
		}
	}
}
