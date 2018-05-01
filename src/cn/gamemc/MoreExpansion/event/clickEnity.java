package cn.gamemc.MoreExpansion.event;

import java.util.List;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import cn.gamemc.MoreExpansion.build.buildPacket;
import cn.gamemc.MoreExpansion.item.blocks;
import cn.gamemc.MoreExpansion.item.gui;
import cn.gamemc.MoreExpansion.main.configBlocks;
import cn.gamemc.MoreExpansion.main.configTools;
import cn.gamemc.MoreExpansion.main.main;

public class clickEnity implements Listener {
	
	@EventHandler
	// �Ҽ�ʵ���¼�
	public void clickEntity(PlayerInteractAtEntityEvent e) {
		// ��ʵ�����
		// ���ڿ������Խ׶�
		/*e.setCancelled(true);
		Entity en = e.getRightClicked();
        if(en instanceof ArmorStand){
                Vector position = e.getClickedPosition();
                en.getWorld().getBlockAt(e.getRightClicked().getLocation().add(0, position.getY(), 0).add(e.getClickedPosition().setY(position.getY() / (((ArmorStand)en).getEyeHeight() * 4)).normalize())).setType(Material.STONE);
        }*/
		
		if ( e.getRightClicked().getType().equals(EntityType.ARMOR_STAND) ) {
			// ��ָ�������ƻ�
			if ( e.getRightClicked().getCustomName()!=null ) {
				// �ж�ʵ�������
				if ( e.getRightClicked().getCustomName().equals("��a��f��f��f��d��a��1") ) {
					// ��ֹ���׼ܱ��޸�
					e.setCancelled(true);
					// ������ж���������Lore
					if ( e.getPlayer().getEquipment().getItemInMainHand().hasItemMeta() && e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().hasLore()) {
						// �ݻ�block1
						List<String> lore = e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore();
						for ( String s : lore ) {
							// �����ƷLoreƥ����ȷ�������һ��ƥ��
							if ( s.equals("��a��f��f��f��e��a��1") ) {
								// ��Ʒ����ƥ����ȷ��ݻ�block1[�ϳ�̨]
								if ( e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getDisplayName().equals(configTools.toolsYml.getString("tools.tool1.name").replaceAll("&", "��")) ) {
									e.getRightClicked().remove();
									e.getPlayer().getWorld().dropItem(e.getRightClicked().getLocation(), blocks.block1);
									if ( main.pm!=null ) {
										buildPacket.sendTitle(e.getPlayer(), "��6"+configBlocks.blocksYml.getString("blocks.block1.name").replaceAll("&", "��"), "��c�Ѵݻ�", 0, 20, 0);
									}
								}else {
									// ��Ʒ����ƥ�䲻��ȷ���block1[�ϳ�̨]
									gui.openCraftGui(e.getPlayer());
									e.getPlayer().openInventory(gui.invGui1);
								}
							}
						}
					}else {
						// û�ж�����û��Loreʱ��block1[�ϳ�̨]
						gui.openCraftGui(e.getPlayer());
						e.getPlayer().openInventory(gui.invGui1);
					}
				}
			}
		}
	}

}