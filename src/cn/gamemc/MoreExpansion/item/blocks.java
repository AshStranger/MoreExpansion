package cn.gamemc.MoreExpansion.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class blocks {

	public static ItemStack block1 = new ItemStack(Material.STONE);
	
	public static void block() {
	    ItemMeta block1Meta = block1.getItemMeta();
	    block1Meta.setDisplayName("��a����");
	    List<String> block1Lore = new ArrayList<String>();
	    block1Lore.add("��a��f��f��f��d��a��1");
	    block1Meta.setLore(block1Lore);
	    block1.setItemMeta(block1Meta);
	    
	}

}
