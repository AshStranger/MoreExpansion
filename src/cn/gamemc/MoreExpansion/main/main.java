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
	
	// 赋值
	FileConfiguration config = getConfig();
	public static JavaPlugin instance;
	public static ProtocolManager pm;
	
	@Override
	public void onEnable() {
		
		// 插件加载信息
		getLogger().severe("[ - [MoreExpansion] 正在检查 - ]");
		if ( !Bukkit.getPluginManager().isPluginEnabled("ProtocolLib") ) {
			getLogger().severe("  -  未安装插件：ProtocolLib");
		}else {
			getLogger().severe("  -  已安装插件：ProtocolLib");
			pm = ProtocolLibrary.getProtocolManager();
		}
		if ( !Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
			getLogger().severe("  -  未安装插件：HolographicDisplays");
			}else {
				getLogger().severe("  -  已安装插件：HolographicDisplays");
		}
		getLogger().severe("  -  插件当前版本：0.0.1");
		getLogger().severe("  -  搭配资源包版本：0.0.1");
		getLogger().severe("[ - [MoreExpansion] 检查完毕 - ]");
		getLogger().severe("[ - [MoreExpansion] 正常运行 - ]");
		
		// 赋值
		instance = this;
		
		// 注册
		getServer().getPluginManager().registerEvents(new damage(), this);
	    getServer().getPluginManager().registerEvents(new spawn(), this);
	    Bukkit.getPluginCommand("morexhelp").setExecutor(new cmdHelp());
	    Bukkit.getPluginCommand("morexgive").setExecutor(new cmdGive());
	    
	    // 加载
	    configMain.base();
	    configMain.reloadItem();
	    arms.arm();
	    mobs.mob();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("[MoreExpansion] 已关闭");
	}
	
}
