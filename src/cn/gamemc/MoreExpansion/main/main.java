package cn.gamemc.MoreExpansion.main;

import cn.gamemc.MoreExpansion.event.damage;
import cn.gamemc.MoreExpansion.event.spawn;
import cn.gamemc.MoreExpansion.item.arms;
import cn.gamemc.MoreExpansion.item.mobs;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class main
  extends JavaPlugin
{
  FileConfiguration config = getConfig();
  public static JavaPlugin instance;
  
  public void onEnable()
  {
    if (!Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays"))
    {
      getLogger().severe("û���ҵ�HolographicDisplays���");
      getLogger().severe("[MoreExpansion] �ѹر�");
      setEnabled(false);
      return;
    }else {
    	getLogger().info("[MoreExpansion] �Ѽ���");
    }
    instance = this;
    

    getServer().getPluginManager().registerEvents(new damage(), this);
    getServer().getPluginManager().registerEvents(new spawn(), this);
    Bukkit.getPluginCommand("morexhelp").setExecutor(new cmdHelp());
    Bukkit.getPluginCommand("morexgive").setExecutor(new cmdGive());
    

    configMain.base();
    configMain.reloadItem();
    arms.arm();
    mobs.mob();
  }
  
  public void onDisable()
  {
    getLogger().info("[MoreExpansion] �ѹر�");
  }
}
