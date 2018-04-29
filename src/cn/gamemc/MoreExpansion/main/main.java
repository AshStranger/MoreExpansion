package cn.gamemc.MoreExpansion.main;

import cn.gamemc.MoreExpansion.event.click;
import cn.gamemc.MoreExpansion.event.damage;
import cn.gamemc.MoreExpansion.event.eat;
import cn.gamemc.MoreExpansion.event.place;
import cn.gamemc.MoreExpansion.event.spawn;
import cn.gamemc.MoreExpansion.item.arms;
import cn.gamemc.MoreExpansion.item.blocks;
import cn.gamemc.MoreExpansion.item.food;
import cn.gamemc.MoreExpansion.item.mobs;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;

public class main extends JavaPlugin {
	
	// ��ֵ
	FileConfiguration config = getConfig();
	public static JavaPlugin here;
	public static ProtocolManager pm;
	
	@Override
	public void onEnable() {
		
		// ���������Ϣ
		getLogger().info("[ - [MoreExpansion] ���ڼ�� - ]");
		if ( !Bukkit.getPluginManager().isPluginEnabled("ProtocolLib") ) {
			getLogger().info("  -  δ��װ�����ProtocolLib");
		}else {
			getLogger().info("  -  �Ѱ�װ�����ProtocolLib");
			pm = ProtocolLibrary.getProtocolManager();
		}
		if ( !Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
			getLogger().info("  -  δ��װ�����HolographicDisplays");
			}else {
				getLogger().info("  -  �Ѱ�װ�����HolographicDisplays");
		}
		getLogger().info("  -  �����ǰ�汾��0.0.1");
		getLogger().info("  -  ������Դ���汾��0.0.1");
		getLogger().info("[ - [MoreExpansion] ������ - ]");
		getLogger().info("[ - [MoreExpansion] �������� - ]");
		
		// ��ֵ
		here = this;
		
		// ע��
		getServer().getPluginManager().registerEvents(new damage(), this);
	    getServer().getPluginManager().registerEvents(new spawn(), this);
	    getServer().getPluginManager().registerEvents(new eat(), this);
	    getServer().getPluginManager().registerEvents(new place(), this);
	    getServer().getPluginManager().registerEvents(new click(), this);
	    Bukkit.getPluginCommand("morexhelp").setExecutor(new cmdHelp());
	    Bukkit.getPluginCommand("morexgive").setExecutor(new cmdGive());
	    
	    // ����
	    configBase.yml();
	    configArms.yml();
	    configMobs.yml();
	    configFood.yml();
	    configBlocks.yml();
	    arms.arm();
	    mobs.mob();
	    food.allFood();
	    blocks.block();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("[MoreExpansion] �ѹر�");
	}
	
}
