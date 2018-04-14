package cn.gamemc.MoreExpansion.main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cmdHelp implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) { 
	if ( cmd.getName().equalsIgnoreCase("morexhelp") ) {
		if ( !(sender instanceof Player) ) {
			sender.sendMessage("不能在控制台使用");
			return true;
	    }
		Player p = (Player) sender;
		if ( args.length == 0 ) {
	      p.sendMessage("§f");
	      p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
	      p.sendMessage("§f   §a§l命令帮助 §71/1页");
	      p.sendMessage("§f      /morexhelp 页数   §7查看帮助");
	      p.sendMessage("§f      /morexgive 物品ID 玩家ID 数量    §7给予物品");
	      p.sendMessage("§f");
	      return true;
	    }
	    if ( args.length > 1 ) {
	    	p.sendMessage("§f");
	    	p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
		    p.sendMessage("§f   §c§l命令错误");
		    p.sendMessage("§7      正确格式：§f/morexhelp 页数");
		    p.sendMessage("§f");
		    return true;
	    }
	    if ( args.length == 1 ) {
	      int helpInt = 0;
	      try {
	        helpInt = Integer.parseInt(args[0]);
	      }catch (NumberFormatException er)
	      {
	    	  p.sendMessage("§f");
		      p.sendMessage("§f  §7§l[§6§lMoreExpansion§7§l]");
		      p.sendMessage("§f  §c§l命令错误");
		      p.sendMessage("§7    正确格式：§f/mion help 页数");
		      p.sendMessage("§f");
		      return true;
		  }
	      if ( helpInt > 0 ) {
	    	  if ( args[0].equalsIgnoreCase("1") ) {
	          p.sendMessage("§f");
	          p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
	          p.sendMessage("§f   §a§l命令帮助 §71/1页");
	          p.sendMessage("§f      /morexhelp 页数   §7查看帮助");
	          p.sendMessage("§f      /morexgive 物品ID 玩家ID 数量    §7给予物品");
	          p.sendMessage("§f");
	          return true;
	      }
	    	  if ( args[0].equalsIgnoreCase("2") ) {
	    	  return true;
	    	  }
	    	  return true;
	    	  }
	      p.sendMessage("§f");
	      p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
	      p.sendMessage("§f   §a§l命令帮助 §71/1页");
	      p.sendMessage("§f      /morexhelp 页数   §7查看帮助");
	      p.sendMessage("§f      /morexgive 物品ID 玩家ID 数量    §7给予物品");
	      p.sendMessage("§f");
	      return true;
	      }
	    }
	return false;
	}
}
