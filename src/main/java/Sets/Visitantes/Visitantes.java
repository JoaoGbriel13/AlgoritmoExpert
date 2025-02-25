package Sets.Visitantes;

import java.util.HashSet;
import java.util.Set;

public class Visitantes {
    private Set<String> uniqueVisitors;
    public Visitantes() {
        this.uniqueVisitors = new HashSet<>();
    }
    public void insertData(String data){
        String[] dataSplit = data.split(",");
        String name = dataSplit[0].toLowerCase().replace(" ", "");
        uniqueVisitors.add(name);
    }

    public Set<String> getUniqueVisitors() {
        return uniqueVisitors;
    }

}
