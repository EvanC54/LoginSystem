import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo = new HashMap<>();

    //could change in the future where you could query a database or something
    IDandPasswords(){
        loginInfo.put("Evan", "Password1!");
        loginInfo.put("William", "October24");
        loginInfo.put("Kimberly", "Grizzly2001");
    }

    public HashMap getLoginInfo(){
        return loginInfo;
    }
}
