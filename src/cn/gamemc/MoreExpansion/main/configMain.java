package cn.gamemc.MoreExpansion.main;

import java.io.File;

public class configMain {
	
	public static void base() {
		// �����ļ���
		if ( !new File(main.instance.getDataFolder(), "config.yml").exists() ) {
			main.instance.saveDefaultConfig();
	    }
		// ������ȡ����
		main.instance.getConfig().set("Settings.damageTitle", main.instance.getConfig().getBoolean("Settings.damageTitle"));
		main.instance.getConfig().set("Settings.damageHologram", main.instance.getConfig().getBoolean("Settings.damageHologram"));
		main.instance.getConfig().set("Settings.addFoodTitle", main.instance.getConfig().getBoolean("Settings.addFoodTitle"));
	}
	
	public static void reloadItem() {
		// ������ȡ����
		// arm1
		main.instance.getConfig().set("arms.arm1.enable", main.instance.getConfig().getBoolean("arms.arm1.enable"));
		main.instance.getConfig().set("arms.arm1.name", main.instance.getConfig().getString("arms.arm1.name"));
	    main.instance.getConfig().set("arms.arm1.damage", main.instance.getConfig().getInt("arms.arm1.damage"));
	    // arm2
	    main.instance.getConfig().set("arms.arm2.enable", main.instance.getConfig().getBoolean("arms.arm2.enable"));
	    main.instance.getConfig().set("arms.arm2.name", main.instance.getConfig().getString("arms.arm2.name"));
	    main.instance.getConfig().set("arms.arm2.damage", main.instance.getConfig().getInt("arms.arm2.damage"));
	    // arm3
	    main.instance.getConfig().set("arms.arm3.enable", main.instance.getConfig().getBoolean("arms.arm3.enable"));
	    main.instance.getConfig().set("arms.arm3.name", main.instance.getConfig().getString("arms.arm3.name"));
	    main.instance.getConfig().set("arms.arm3.damage", main.instance.getConfig().getInt("arms.arm3.damage"));
	    // arm4
	    main.instance.getConfig().set("arms.arm4.enable", main.instance.getConfig().getBoolean("arms.arm4.enable"));
	    main.instance.getConfig().set("arms.arm4.name", main.instance.getConfig().getString("arms.arm4.name"));
	    main.instance.getConfig().set("arms.arm4.damage", main.instance.getConfig().getInt("arms.arm4.damage"));
	    // arm5
	    main.instance.getConfig().set("arms.arm5.enable", main.instance.getConfig().getBoolean("arms.arm5.enable"));
	    main.instance.getConfig().set("arms.arm5.name", main.instance.getConfig().getString("arms.arm5.name"));
	    main.instance.getConfig().set("arms.arm5.damage", main.instance.getConfig().getInt("arms.arm5.damage"));
	    // ʳ���ȡ����
	    // food1
	    main.instance.getConfig().set("food.food1.enable", main.instance.getConfig().getBoolean("food.food1.enable"));
	    main.instance.getConfig().set("food.food1.name", main.instance.getConfig().getString("food.food1.name"));
	    main.instance.getConfig().set("food.food1.addFood", main.instance.getConfig().getInt("food.food1.addFood"));
	    // �����ȡ����
	    // mob1
	    main.instance.getConfig().set("mobs.mob1.name", main.instance.getConfig().getString("mobs.mob1.name"));
	    // mob2
	    main.instance.getConfig().set("mobs.mob2.name", main.instance.getConfig().getString("mobs.mob2.name"));
	    // ����
	    main.instance.saveConfig();
	}
	
}