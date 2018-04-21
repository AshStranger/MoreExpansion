package cn.gamemc.MoreExpansion.main;

import java.io.File;

public class configMain {
	
	public static void base() {
		// 加载文件夹
		if ( !new File(main.instance.getDataFolder(), "config.yml").exists() ) {
			main.instance.saveDefaultConfig();
	    }
		// 基础读取载入
		main.instance.getConfig().set("Settings.damageTitle", Boolean.valueOf(main.instance.getConfig().getBoolean("Settings.damageTitle")));
		main.instance.getConfig().set("Settings.damageHologram", Boolean.valueOf(main.instance.getConfig().getBoolean("Settings.damageHologram")));
	}
	
	public static void reloadItem() {
		// 武器读取载入
		main.instance.getConfig().set("arms.arm1.enable", Boolean.valueOf(main.instance.getConfig().getBoolean("arms.arm1.enable")));
	    main.instance.getConfig().set("arms.arm1.damage", Integer.valueOf(main.instance.getConfig().getInt("arms.arm1.damage")));
	    main.instance.getConfig().set("arms.arm2.enable", Boolean.valueOf(main.instance.getConfig().getBoolean("arms.arm2.enable")));
	    main.instance.getConfig().set("arms.arm2.damage", Integer.valueOf(main.instance.getConfig().getInt("arms.arm2.damage")));
	    main.instance.getConfig().set("arms.arm3.enable", Boolean.valueOf(main.instance.getConfig().getBoolean("arms.arm3.enable")));
	    main.instance.getConfig().set("arms.arm3.damage", Integer.valueOf(main.instance.getConfig().getInt("arms.arm3.damage")));
	    main.instance.getConfig().set("arms.arm4.enable", Boolean.valueOf(main.instance.getConfig().getBoolean("arms.arm4.enable")));
	    main.instance.getConfig().set("arms.arm4.damage", Integer.valueOf(main.instance.getConfig().getInt("arms.arm4.damage")));
	    // 生物读取载入
	    main.instance.getConfig().set("mobs.mob1.name", main.instance.getConfig().getString("mobs.mob1.name"));
	    // 保存
	    main.instance.saveConfig();
	}
	
}