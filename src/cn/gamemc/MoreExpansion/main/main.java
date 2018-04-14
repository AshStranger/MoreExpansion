package cn.gamemc.MoreExpansion.main;

import cn.gamemc.MoreExpansion.event.damage;
import cn.gamemc.MoreExpansion.event.spawn;
import cn.gamemc.MoreExpansion.item.arms;
import cn.gamemc.MoreExpansion.item.mobs;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	
	// 赋值
	FileConfiguration config = getConfig();
	public static JavaPlugin instance;
	
	public void onEnable() {
		// 查找HolographicDisplays
		if ( !Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
			getLogger().severe("没有找到HolographicDisplays插件");
			getLogger().severe("[MoreExpansion] 已关闭");
			setEnabled(false);
			return;
			}else {
				getLogger().info("[MoreExpansion] 已加载");
				instance = this;
		}
		
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

	  
	  public void onDisable() {
		  getLogger().info("[MoreExpansion] 已关闭");
	  }
	  
	}
