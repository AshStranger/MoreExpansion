package cn.gamemc.MoreExpansion.build;

public class loreBuff {
	
	  public static String blank() {
		  String blank = "��f                                        ";
		  return blank;
	  }
	  
	  public static String loreAttb() {
		  String loreAttb = "��f ��3��l���� ��f��l>";
		  return loreAttb;
	  }
	  
	  public static String loreInfo() {
		  String loreInfo = "��f ��3��l��Ϣ ��f��l>";
		  return loreInfo;
	  }
	  
	  public static String loreAttack(int damage) {
		    String loreAttack = "��f       ��7��l[��f��l-��7��l]��f ��6�˺� ��f" + damage;
		    return loreAttack;
	  }
	  
	  public static String loreAddFood(int addFood) {
		    String loreAddFood = "��f       ��7��l[��f��l-��7��l]��f ��6��ʳ ��f" + addFood;
		    return loreAddFood;
	  }
	  
}
