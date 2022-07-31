import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("11","11");
        map.put("22","22");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            entry.setValue("33");
        }

        System.out.println(map.get("11"));
    }


    class Modal1{
        private boolean isXXX;

    }

}
