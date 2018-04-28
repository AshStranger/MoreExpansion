package cn.gamemc.MoreExpansion.main;

import cn.gamemc.MoreExpansion.event.damage;
import cn.gamemc.MoreExpansion.event.eat;
import cn.gamemc.MoreExpansion.event.spawn;
import cn.gamemc.MoreExpansion.item.arms;
import cn.gamemc.MoreExpansion.item.food;
import cn.gamemc.MoreExpansion.item.mobs;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;

public class main extends JavaPlugin {
	
	// 赋值
	FileConfiguration config = getConfig();
	public static JavaPlugin here;
	public static ProtocolManager pm;
	
	@Override
	public void onEnable() {
		
		// 插件加载信息
		getLogger().info("[ - [MoreExpansion] 正在检查 - ]");
		if ( !Bukkit.getPluginManager().isPluginEnabled("ProtocolLib") ) {
			getLogger().info("  -  未安装插件：ProtocolLib");
		}else {
			getLogger().info("  -  已安装插件：ProtocolLib");
			pm = ProtocolLibrary.getProtocolManager();
		}
		if ( !Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays") ) {
			getLogger().info("  -  未安装插件：HolographicDisplays");
			}else {
				getLogger().info("  -  已安装插件：HolographicDisplays");
		}
		getLogger().info("  -  插件当前版本：0.0.1");
		getLogger().info("  -  搭配资源包版本：0.0.1");
		getLogger().info("[ - [MoreExpansion] 检查完毕 - ]");
		getLogger().info("[ - [MoreExpansion] 正常运行 - ]");
		
		// 赋值
		here = this;
		
		// 注册
		getServer().getPluginManager().registerEvents(new damage(), this);
	    getServer().getPluginManager().registerEvents(new spawn(), this);
	    getServer().getPluginManager().registerEvents(new eat(), this);
	    Bukkit.getPluginCommand("morexhelp").setExecutor(new cmdHelp());
	    Bukkit.getPluginCommand("morexgive").setExecutor(new cmdGive());
	    
	    // 加载
	    configBase.yml();
	    configArms.yml();
	    configMobs.yml();
	    configFood.yml();
	    arms.arm();
	    mobs.mob();
	    food.allFood();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("[MoreExpansion] 已关闭");
	}
	
}
