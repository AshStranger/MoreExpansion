package cn.gamemc.MoreExpansion.item;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import cn.gamemc.MoreExpansion.build.loreBuff;

public class gui {
	
	// gui
	// �ϳ�̨
	public static Inventory invGui1;
	
	// item
	// ��ɫ��ť
	public static ItemStack gui1 = new ItemStack(Material.STAINED_GLASS_PANE);
	// �鱾��ť
	public static ItemStack gui2 = new ItemStack(Material.BOOK);
	// �Ҽ�ͷ��ť
	public static ItemStack gui3 = new ItemStack(Material.STAINED_GLASS_PANE);
	// ��ɫ�԰�ť
	public static ItemStack gui4 = new ItemStack(Material.SLIME_BALL);
	// ��ɫ��ť
	public static ItemStack gui5 = new ItemStack(Material.MAGMA_CREAM);
	
	// ����item
	public static void allGui() {
		gui1.setDurability((short) 7);
	    ItemMeta gui1Meta = gui1.getItemMeta();
	    gui1Meta.setDisplayName("��a��f��f��f��f��a��1");
	    gui1.setItemMeta(gui1Meta);
	    
	    ItemMeta gui2Meta = gui2.getItemMeta();
	    gui2Meta.setDisplayName("��a��f��f��f��f��a��2");
	    List<String> gui2Lore = new ArrayList<String>();
	    gui2Lore.add("��f��l�ϳɱ�");
	    gui2Lore.add(loreBuff.blank());
	    gui2Lore.add("��f    ��7��֪����չ��Ʒ�ĺϳɹ�ʽ��");
	    gui2Lore.add("��f    ��7�����кϳɱ�ʽ��ȫŶ");
	    gui2Lore.add("��f");
	    gui2Meta.setLore(gui2Lore);
	    gui2.setItemMeta(gui2Meta);
	    
	    gui3.setDurability((short) 7);
	    ItemMeta gui3Meta = gui3.getItemMeta();
	    gui3Meta.setDisplayName("��a��f��f��f��f��a��3");
	    gui3.setItemMeta(gui3Meta);
	    
	    ItemMeta gui4Meta = gui4.getItemMeta();
	    gui4Meta.setDisplayName("��7��l[��a��l����ϳɡ�7��l]");
	    gui4.setItemMeta(gui4Meta);
	    
	    ItemMeta gui5Meta = gui5.getItemMeta();
	    gui5Meta.setDisplayName("��7��l[��c��l����رա�7��l]");
	    gui5.setItemMeta(gui5Meta);
	    
	    /*
	    gui.setDurability((short) 7);
	    ItemMeta guiMeta = gui.getItemMeta();
	    guiMeta.setDisplayName("��a��f��f��f��f��a��");
	    gui.setItemMeta(guiMeta);
	     */
	}
	
	// ���úϳ�̨
	public static void openCraftGui(Player player) {
		invGui1 = Bukkit.createInventory(player, 54, "��l�ϳ�̨");
		for ( int s=0; s<11; s++ ) {
			invGui1.setItem(s, gui1);
		}
		for ( int s=14; s<20; s++ ) {
			invGui1.setItem(s, gui1);
		}
		invGui1.setItem(23, gui3);
		for ( int s=25; s<29; s++ ) {
			invGui1.setItem(s, gui1);
		}
		for ( int s=32; s<48; s++ ) {
			invGui1.setItem(s, gui1);
		}
		for ( int s=51; s<54; s++ ) {
			invGui1.setItem(s, gui1);
		}
		invGui1.setItem(48, gui2);
		invGui1.setItem(49, gui4);
		invGui1.setItem(50, gui5);
	}

}
