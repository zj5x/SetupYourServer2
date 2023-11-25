import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPasswords(){
		
		logininfo.put("Admin", "M#N@Z*J");
		logininfo.put("User", "SubName$");
		logininfo.put("Any", "nume123");
		
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
