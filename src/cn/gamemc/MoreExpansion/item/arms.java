package cn.gamemc.MoreExpansion.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import cn.gamemc.MoreExpansion.build.version;
import cn.gamemc.MoreExpansion.main.configArms;

public class arms {
	
  public static ItemStack arm1 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm2 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm3 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm4 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm5 = new ItemStack(Material.DIAMOND_SWORD);
  
  public static void arm() {
	  ItemMeta arm1Meta = arm1.getItemMeta();
	  arm1Meta.setDisplayName(configArms.armsYml.getString("arms.arm1.name").replaceAll("&", "��"));
	  List<String> arm1Lore = new ArrayList<String>();
	  arm1Lore.add("��a��f��f��f��a��a��1");
	  arm1Meta.setLore(arm1Lore);
	  arm1.setItemMeta(arm1Meta);
	  
	  ItemMeta arm2Meta = arm2.getItemMeta();
	  arm2Meta.setDisplayName(configArms.armsYml.getString("arms.arm2.name").replaceAll("&", "��"));
	  List<String> arm2Lore = new ArrayList<String>();
	  arm2Lore.add("��a��f��f��f��a��a��2");
	  arm2Meta.setLore(arm2Lore);
	  arm2.setItemMeta(arm2Meta);
	  
	  ItemMeta arm3Meta = arm3.getItemMeta();
	  arm3Meta.setDisplayName(configArms.armsYml.getString("arms.arm3.name").replaceAll("&", "��"));
	  List<String> arm3Lore = new ArrayList<String>();
	  arm3Lore.add("��a��f��f��f��a��a��3");
	  arm3Meta.setLore(arm3Lore);
	  arm3.setItemMeta(arm3Meta);
	  
	  ItemMeta arm4Meta = arm4.getItemMeta();
	  arm4Meta.setDisplayName(configArms.armsYml.getString("arms.arm4.name").replaceAll("&", "��"));
	  List<String> arm4Lore = new ArrayList<String>();
	  arm4Lore.add("��a��f��f��f��a��a��4");
	  arm4Meta.setLore(arm4Lore);
	  arm4.setItemMeta(arm4Meta);
	  
	  ItemMeta arm5Meta = arm5.getItemMeta();
	  arm5Meta.setDisplayName(configArms.armsYml.getString("arms.arm5.name").replaceAll("&", "��"));
	  List<String> arm5Lore = new ArrayList<String>();
	  arm5Lore.add("��a��f��f��f��a��a��5");
      arm5Meta.setLore(arm5Lore);
      arm5.setItemMeta(arm5Meta);
	  
	  // NBT
	  version.nmsItem();
  }
  
}
