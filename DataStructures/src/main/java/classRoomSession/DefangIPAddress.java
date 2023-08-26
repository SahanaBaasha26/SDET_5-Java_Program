package classRoomSession;

public class DefangIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String defanged = defangIP(address);
        System.out.println(defanged);
    }

    public static String defangIP(String address) {
                
        String defangedAddress = "";

                  
        for (char c : address.toCharArray()) {
                 
            if (c == '.') {
                    
                defangedAddress += "[.]";
            } else {
                      
                defangedAddress += c;
            }
        }

        return defangedAddress;
    }
}