package cn.gamemc.MoreExpansion.main;

import cn.gamemc.MoreExpansion.item.arms;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cmdGive implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("morexgive")) {
			if ( !(sender instanceof Player) ) {
				sender.sendMessage("�����ڿ���̨ʹ��");
				return true;
		}
			Player p = (Player) sender;
			if ( args.length == 0 ) {
				p.sendMessage("��f");
		        p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
		        p.sendMessage("��f   ��c��l�������");
		        p.sendMessage("��7      ��ȷ��ʽ����f/morexgive ��ƷID ���ID ����");
		        p.sendMessage("��f");
		        return true;
		    }
			if ( args.length > 4 ) {
		        p.sendMessage("��f");
		        p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
		        p.sendMessage("��f   ��c��l�������");
		        p.sendMessage("��7      ��ȷ��ʽ����f/morexgive ��ƷID ���ID ����");
		        p.sendMessage("��f");
		        return true;
		    }
			if ( args.length == 0 ) {
		        p.sendMessage("��f");
		        p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
		        p.sendMessage("��f   ��c��l�������");
		        p.sendMessage("��7      ��ȷ��ʽ����f/morexgive ��ƷID ���ID ����");
		        p.sendMessage("��f");
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
			            p.sendMessage("��f");
			            p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
			            p.sendMessage("��f   ��c���������ֲ���ȷ");
			            p.sendMessage("��f");
			            return true;
			        }
					if ( giveInt > 0 ) {
						if ( args[0].equalsIgnoreCase("arm1") ) {
							if ( configArms.armsYml.getBoolean("arms.arm1.enable")!=false ) {
								for ( int x=0; x<giveInt; x++ ) {
									p.getInventory().addItem(arms.arm1);
								}
								return true;
							}
				              p.sendMessage("��f");
				              p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
				              p.sendMessage("��f   ��c����Ʒ�ѱ�����");
				              p.sendMessage("��f");
				              return true;
				        }
						if ( args[0].equalsIgnoreCase("arm2") ) {
							if ( configArms.armsYml.getBoolean("arms.arm2.enable")!=false ) {
								for ( int x=0; x<giveInt; x++ ) {
									p.getInventory().addItem(arms.arm2);
								}
								return true;
							}
				              p.sendMessage("��f");
				              p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
				              p.sendMessage("��f   ��c����Ʒ�ѱ�����");
				              p.sendMessage("��f");
				              return true;
				        }
						if ( args[0].equalsIgnoreCase("arm3") ) {
							if ( configArms.armsYml.getBoolean("arms.arm3.enable")!=false ) {
								for ( int x=0; x<giveInt; x++ ) {
									p.getInventory().addItem(arms.arm3);
								}
								return true;
							}
				              p.sendMessage("��f");
				              p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
				              p.sendMessage("��f   ��c����Ʒ�ѱ�����");
				              p.sendMessage("��f");
				              return true;
				        }
						if ( args[0].equalsIgnoreCase("arm4") ) {
							if ( configArms.armsYml.getBoolean("arms.arm4.enable")!=false ) {
								for ( int x=0; x<giveInt; x++ ) {
									p.getInventory().addItem(arms.arm4);
								}
								return true;
							}
							p.sendMessage("��f");
							p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
							p.sendMessage("��f   ��c����Ʒ�ѱ�����");
				              p.sendMessage("��f");
				              return true;
				        }
						if ( args[0].equalsIgnoreCase("arm5") ) {
							if ( configArms.armsYml.getBoolean("arms.arm5.enable")!=false ) {
								for ( int x=0; x<giveInt; x++ ) {
									p.getInventory().addItem(arms.arm5);
								}
								return true;
							}
							p.sendMessage("��f");
							p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
							p.sendMessage("��f   ��c����Ʒ�ѱ�����");
				              p.sendMessage("��f");
				              return true;
				        }
			            p.sendMessage("��f");
			            p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
			            p.sendMessage("��f   ��c��ƷID������");
			            p.sendMessage("��f");
			            return true;
			       }
			          p.sendMessage("��f");
			          p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
			          p.sendMessage("��f   ��c���������ֲ���ȷ");
			          p.sendMessage("��f");
			          return true;
				}
		        p.sendMessage("��f");
		        p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
		        p.sendMessage("��f   ��cĿ����Ҳ�����");
		        p.sendMessage("��f");
		        return true;
			}
		      p.sendMessage("��f");
		      p.sendMessage("��f   ��7��l[��6��lMoreExpansion��7��l]");
		      p.sendMessage("��f   ��c��l�������");
		      p.sendMessage("��7      ��ȷ��ʽ����f/morexgive ��ƷID ���ID ����");
		      p.sendMessage("��f");
		      return true;
		}
		return false;
	}
}
