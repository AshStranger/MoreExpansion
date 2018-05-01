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
	// 右键实体事件
	public void clickEntity(PlayerInteractAtEntityEvent e) {
		// 对实体放置
		// 处于开发测试阶段
		/*e.setCancelled(true);
		Entity en = e.getRightClicked();
        if(en instanceof ArmorStand){
                Vector position = e.getClickedPosition();
                en.getWorld().getBlockAt(e.getRightClicked().getLocation().add(0, position.getY(), 0).add(e.getClickedPosition().setY(position.getY() / (((ArmorStand)en).getEyeHeight() * 4)).normalize())).setType(Material.STONE);
        }*/
		
		if ( e.getRightClicked().getType().equals(EntityType.ARMOR_STAND) ) {
			// 用指定工具破坏
			if ( e.getRightClicked().getCustomName()!=null ) {
				// 判断实体的名字
				if ( e.getRightClicked().getCustomName().equals("§a§f§f§f§d§a§1") ) {
					// 防止盔甲架被修改
					e.setCancelled(true);
					// 如果手有东西并且有Lore
					if ( e.getPlayer().getEquipment().getItemInMainHand().hasItemMeta() && e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().hasLore()) {
						// 摧毁block1
						List<String> lore = e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getLore();
						for ( String s : lore ) {
							// 如果物品Lore匹配正确则进行下一步匹配
							if ( s.equals("§a§f§f§f§e§a§1") ) {
								// 物品名字匹配正确则摧毁block1[合成台]
								if ( e.getPlayer().getEquipment().getItemInMainHand().getItemMeta().getDisplayName().equals(configTools.toolsYml.getString("tools.tool1.name").replaceAll("&", "§")) ) {
									e.getRightClicked().remove();
									e.getPlayer().getWorld().dropItem(e.getRightClicked().getLocation(), blocks.block1);
									if ( main.pm!=null ) {
										buildPacket.sendTitle(e.getPlayer(), "§6"+configBlocks.blocksYml.getString("blocks.block1.name").replaceAll("&", "§"), "§c已摧毁", 0, 20, 0);
									}
								}else {
									// 物品名字匹配不正确则打开block1[合成台]
									gui.openCraftGui(e.getPlayer());
									e.getPlayer().openInventory(gui.invGui1);
								}
							}
						}
					}else {
						// 没有东西或没有Lore时打开block1[合成台]
						gui.openCraftGui(e.getPlayer());
						e.getPlayer().openInventory(gui.invGui1);
					}
				}
			}
		}
	}

}
