package cn.gamemc.MoreExpansion.item;

import cn.gamemc.MoreExpansion.build.loreBuff;
import cn.gamemc.MoreExpansion.main.main;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
public class arms {
	
  public static ItemStack arm1 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm2 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm3 = new ItemStack(Material.DIAMOND_SWORD);
  public static ItemStack arm4 = new ItemStack(Material.DIAMOND_SWORD);
  
  public static void arm() {
	    ItemMeta arm1Meta = arm1.getItemMeta();
	    arm1Meta.setDisplayName("��b���⽣");
	    arm1Meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
	    List<String> arm1Lore = new ArrayList<String>();
	    arm1Lore.add("��a��f��f��f��a��a��1");
	    arm1Lore.add(loreBuff.loreAttb());
	    arm1Lore.add(loreBuff.loreAttack(main.instance.getConfig().getInt("arms.arm1.damage")));
	    arm1Lore.add(loreBuff.blank());
	    arm1Meta.setLore(arm1Lore);
	    arm1.setItemMeta(arm1Meta);
	    
	    ItemMeta arm2Meta = arm2.getItemMeta();
	    arm2Meta.setDisplayName("��c��⽣");
	    arm2Meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
	    List<String> arm2Lore = new ArrayList<String>();
	    arm2Lore.add("��a��f��f��f��a��a��2");
	    arm2Lore.add(loreBuff.loreAttb());
	    arm2Lore.add(loreBuff.loreAttack(main.instance.getConfig().getInt("arms.arm2.damage")));
	    arm2Lore.add(loreBuff.blank());
	    arm2Meta.setLore(arm2Lore);
	    arm2.setItemMeta(arm2Meta);
	    
	    ItemMeta arm3Meta = arm3.getItemMeta();
	    arm3Meta.setDisplayName("��a�̹⽣");
	    arm3Meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
	    List<String> arm3Lore = new ArrayList<String>();
	    arm3Lore.add("��a��f��f��f��a��a��3");
	    arm3Lore.add(loreBuff.loreAttb());
	    arm3Lore.add(loreBuff.loreAttack(main.instance.getConfig().getInt("arms.arm3.damage")));
	    arm3Lore.add(loreBuff.blank());
	    arm3Meta.setLore(arm3Lore);
	    arm3.setItemMeta(arm3Meta);
	    
	    ItemMeta arm4Meta = arm4.getItemMeta();
	    arm4Meta.setDisplayName("��e�ƹ⽣");
	    arm4Meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ATTRIBUTES });
	    List<String> arm4Lore = new ArrayList<String>();
	    arm4Lore.add("��a��f��f��f��a��a��4");
	    arm4Lore.add(loreBuff.loreAttb());
	    arm4Lore.add(loreBuff.loreAttack(main.instance.getConfig().getInt("arms.arm4.damage")));
	    arm4Lore.add(loreBuff.blank());
	    arm4Meta.setLore(arm4Lore);
	    arm4.setItemMeta(arm4Meta);
  }
}
