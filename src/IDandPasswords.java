import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<>();

    IDandPasswords(){
        logininfo.put("Bro","pizza");
        logininfo.put("Jitesh","Jitesh@2001");
        logininfo.put("Kamesh","Kamesh@1999");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }


}
