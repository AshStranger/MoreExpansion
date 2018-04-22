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
  public static ItemStack arm5 = new ItemStack(Material.DIAMOND_SWORD);
  
  public static void arm() {
	    ItemMeta arm1Meta = arm1.getItemMeta();
	    arm1Meta.setDisplayName(main.instance.getConfig().getString("arms.arm1.name").replaceAll("&", "¡ì"));
	    arm1Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> arm1Lore = new ArrayList<String>();
	    arm1Lore.add("¡ìa¡ìf¡ìf¡ìf¡ìa¡ìa¡ì1");
	    arm1Lore.add(loreBuff.loreAttb());
	    arm1Lore.add(loreBuff.loreAttack(main.instance.getConfig().getInt("arms.arm1.damage")));
	    arm1Lore.add(loreBuff.blank());
	    arm1Meta.setLore(arm1Lore);
	    arm1.setItemMeta(arm1Meta);
	    
	    ItemMeta arm2Meta = arm2.getItemMeta();
	    arm2Meta.setDisplayName(main.instance.getConfig().getString("arms.arm2.name").replaceAll("&", "¡ì"));
	    arm2Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> arm2Lore = new ArrayList<String>();
	    arm2Lore.add("¡ìa¡ìf¡ìf¡ìf¡ìa¡ìa¡ì2");
	    arm2Lore.add(loreBuff.loreAttb());
	    arm2Lore.add(loreBuff.loreAttack(main.instance.getConfig().getInt("arms.arm2.damage")));
	    arm2Lore.add(loreBuff.blank());
	    arm2Meta.setLore(arm2Lore);
	    arm2.setItemMeta(arm2Meta);
	    
	    ItemMeta arm3Meta = arm3.getItemMeta();
	    arm3Meta.setDisplayName(main.instance.getConfig().getString("arms.arm3.name").replaceAll("&", "¡ì"));
	    arm3Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> arm3Lore = new ArrayList<String>();
	    arm3Lore.add("¡ìa¡ìf¡ìf¡ìf¡ìa¡ìa¡ì3");
	    arm3Lore.add(loreBuff.loreAttb());
	    arm3Lore.add(loreBuff.loreAttack(main.instance.getConfig().getInt("arms.arm3.damage")));
	    arm3Lore.add(loreBuff.blank());
	    arm3Meta.setLore(arm3Lore);
	    arm3.setItemMeta(arm3Meta);
	    
	    ItemMeta arm4Meta = arm4.getItemMeta();
	    arm4Meta.setDisplayName(main.instance.getConfig().getString("arms.arm4.name").replaceAll("&", "¡ì"));
	    arm4Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> arm4Lore = new ArrayList<String>();
	    arm4Lore.add("¡ìa¡ìf¡ìf¡ìf¡ìa¡ìa¡ì4");
	    arm4Lore.add(loreBuff.loreAttb());
	    arm4Lore.add(loreBuff.loreAttack(main.instance.getConfig().getInt("arms.arm4.damage")));
	    arm4Lore.add(loreBuff.blank());
	    arm4Meta.setLore(arm4Lore);
	    arm4.setItemMeta(arm4Meta);
	    
	    ItemMeta arm5Meta = arm5.getItemMeta();
	    arm5Meta.setDisplayName(main.instance.getConfig().getString("arms.arm5.name").replaceAll("&", "¡ì"));
	    arm5Meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
	    List<String> arm5Lore = new ArrayList<String>();
	    arm5Lore.add("¡ìa¡ìf¡ìf¡ìf¡ìa¡ìa¡ì5");
	    arm5Lore.add(loreBuff.loreAttb());
	    arm5Lore.add(loreBuff.loreAttack(main.instance.getConfig().getInt("arms.arm5.damage")));
	    arm5Lore.add(loreBuff.blank());
	    arm5Meta.setLore(arm5Lore);
	    arm5.setItemMeta(arm5Meta);
  }
}
