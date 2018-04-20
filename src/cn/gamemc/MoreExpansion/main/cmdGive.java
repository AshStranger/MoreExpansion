package cn.gamemc.MoreExpansion.main;

import cn.gamemc.MoreExpansion.item.arms;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class cmdGive implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("morexgive")) {
			if ( !(sender instanceof Player) ) {
				sender.sendMessage("不能在控制台使用");
				return true;
		}
			Player p = (Player) sender;
			if ( args.length == 0 ) {
				p.sendMessage("§f");
		        p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
		        p.sendMessage("§f   §c§l命令错误");
		        p.sendMessage("§7      正确格式：§f/morexgive 物品ID 玩家ID 数量");
		        p.sendMessage("§f");
		        return true;
		    }
			if ( args.length > 4 ) {
		        p.sendMessage("§f");
		        p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
		        p.sendMessage("§f   §c§l命令错误");
		        p.sendMessage("§7      正确格式：§f/morexgive 物品ID 玩家ID 数量");
		        p.sendMessage("§f");
		        return true;
		    }
			if ( args.length == 0 ) {
		        p.sendMessage("§f");
		        p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
		        p.sendMessage("§f   §c§l命令错误");
		        p.sendMessage("§7      正确格式：§f/morexgive 物品ID 玩家ID 数量");
		        p.sendMessage("§f");
		        return true;
		    }
			if ( args.length == 3 ) {
				Player per = Bukkit.getPlayer(args[1]);
				if ( per != null ) {
					int giveInt = 0;
					try {
						giveInt = Integer.parseInt(args[2]);
					}
					catch (NumberFormatException er)
					{
			            p.sendMessage("§f");
			            p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
			            p.sendMessage("§f   §c数量的数字不正确");
			            p.sendMessage("§f");
			            return true;
			        }
					if ( giveInt > 0 ) {
						if ( args[0].equalsIgnoreCase("arm1") ) {
							if (main.instance.getConfig().getBoolean("arms.arm1.enable")) {
								p.getInventory().addItem(new ItemStack[] { arms.arm1 });
								return true;
							}
				              p.sendMessage("§f");
				              p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
				              p.sendMessage("§f   §c该物品已被禁用");
				              p.sendMessage("§f");
				              return true;
				        }
						if ( args[0].equalsIgnoreCase("arm2") ) {
							if ( main.instance.getConfig().getBoolean("arms.arm2.enable") ) {
								p.getInventory().addItem(new ItemStack[] { arms.arm2 });
								return true;
							}
				              p.sendMessage("§f");
				              p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
				              p.sendMessage("§f   §c该物品已被禁用");
				              p.sendMessage("§f");
				              return true;
				        }
						if ( args[0].equalsIgnoreCase("arm3") ) {
							if ( main.instance.getConfig().getBoolean("arms.arm3.enable") ) {
								p.getInventory().addItem(new ItemStack[] { arms.arm3 });
								return true;
							}
				              p.sendMessage("§f");
				              p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
				              p.sendMessage("§f   §c该物品已被禁用");
				              p.sendMessage("§f");
				              return true;
				        }
						if ( args[0].equalsIgnoreCase("arm4") ) {
							if  (main.instance.getConfig().getBoolean("arms.arm4.enable") ) {
								p.getInventory().addItem(new ItemStack[] { arms.arm4 });
								return true;
							}
							p.sendMessage("§f");
							p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
							p.sendMessage("§f   §c该物品已被禁用");
				              p.sendMessage("§f");
				              return true;
				        }
			            p.sendMessage("§f");
			            p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
			            p.sendMessage("§f   §c物品ID不存在");
			            p.sendMessage("§f");
			            return true;
			       }
			          p.sendMessage("§f");
			          p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
			          p.sendMessage("§f   §c数量的数字不正确");
			          p.sendMessage("§f");
			          return true;
				}
		        p.sendMessage("§f");
		        p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
		        p.sendMessage("§f   §c目标玩家不在线");
		        p.sendMessage("§f");
		        return true;
			}
		      p.sendMessage("§f");
		      p.sendMessage("§f   §7§l[§6§lMoreExpansion§7§l]");
		      p.sendMessage("§f   §c§l命令错误");
		      p.sendMessage("§7      正确格式：§f/morexgive 物品ID 玩家ID 数量");
		      p.sendMessage("§f");
		      return true;
		}
		return false;
	}
}
