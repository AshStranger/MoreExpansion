package cn.gamemc.MoreExpansion.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class mobs {
	public static ItemStack mob1 = new ItemStack(Material.IRON_INGOT);
	
	public static void mob() {
	    ItemMeta mob1Meta = mob1.getItemMeta();
	    mob1Meta.setDisplayName("¡ìa¡ìf¡ìf¡ìf¡ìb¡ìa¡ì1");
	    mob1.setItemMeta(mob1Meta);
	}
	
}
