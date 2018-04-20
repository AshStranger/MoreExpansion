package cn.gamemc.MoreExpansion.main;

import cn.gamemc.MoreExpansion.event.damage;
import cn.gamemc.MoreExpansion.event.spawn;
import cn.gamemc.MoreExpansion.item.arms;
import cn.gamemc.MoreExpansion.item.mobs;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;

public class main extends JavaPlugin {
	
	// ��ֵ
	FileConfiguration config = getConfig();
	public static JavaPlugin instance;
	public static ProtocolManager pm;
	
	@Override
	public void onEnable() {
		
		// ���������Ϣ
		getLogger().severe("[ - [MoreExpansion] ���ڼ�� - ]");
		if ( !Bukkit.getPluginManager().isPluginEnabled("ProtocolLib") ) {
			getLogger().severe("  -  δ��װ�����ProtocolLib");
		}else {
			getLogger().severe("  -  �Ѱ�װ�����ProtocolLib");
			pm = ProtocolLibrary.getProtocolManager();
		}
		if ( !Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
			getLogger().severe("  -  δ��װ�����HolographicDisplays");
			}else {
				getLogger().severe("  -  �Ѱ�װ�����HolographicDisplays");
		}
		getLogger().severe("  -  �����ǰ�汾��0.0.1");
		getLogger().severe("  -  ������Դ���汾��0.0.1");
		getLogger().severe("[ - [MoreExpansion] ������ - ]");
		getLogger().severe("[ - [MoreExpansion] �������� - ]");
		
		// ��ֵ
		instance = this;
		
		// ע��
		getServer().getPluginManager().registerEvents(new damage(), this);
	    getServer().getPluginManager().registerEvents(new spawn(), this);
	    Bukkit.getPluginCommand("morexhelp").setExecutor(new cmdHelp());
	    Bukkit.getPluginCommand("morexgive").setExecutor(new cmdGive());
	    
	    // ����
	    configMain.base();
	    configMain.reloadItem();
	    arms.arm();
	    mobs.mob();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("[MoreExpansion] �ѹر�");
	}
	
}
