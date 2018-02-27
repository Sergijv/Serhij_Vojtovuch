import java.util.*;

public class MyMap {
    //2.Create map personMap and add to it ten persons of
    //type <String, String> (lastName, firstName).

    Map<String, String> personMyMap = new HashMap<String, String>();

    public Map<String, String> setPersonMap10() {
        this.personMyMap.put("lastName0","firstName0");
        this.personMyMap.put("lastName1","firstName1");
        this.personMyMap.put("lastName2","firstName0");
        this.personMyMap.put("lastName3","firstName3");
        this.personMyMap.put("lastName4","firstName4");
        this.personMyMap.put("lastName5","firstName5");
        this.personMyMap.put("lastName6","firstName6");
        this.personMyMap.put("lastName7","firstName7");
        this.personMyMap.put("lastName8","firstName8");
        this.personMyMap.put("lastName9","firstName9");
        return (HashMap<String, String>) personMyMap;
    }

    //Output the entities of the map on the screen.
    public void printMyMap(Map<String, String> pirintMap){
        Set<String> kSet = pirintMap.keySet();
        for (String key : kSet) {
            String value = pirintMap.get(key);
            System.out.println(key + "->" + value);
        }
    }
    //There are at less two persons with the same firstName among
    //these 10 people?
    public boolean samefirstName(Map<String, String> samefirstNameMap) {
        HashSet firstName = new HashSet<String>();
           for (String value : samefirstNameMap.values()) {
           firstName.add(value);
        }

    return firstName.size()<samefirstNameMap.size();
    }
    //Remove from the map person whose firstName is ”Orest” (or
    //other). Print result.
    public Map<String, String> removeFirstName(Map<String, String> removeFirstNameMap,String name) {
        Set<String> kSet = removeFirstNameMap.keySet();
        for (String key : kSet) {
            if (removeFirstNameMap.get(key).equals(name))removeFirstNameMap.remove(key);
        }
        return removeFirstNameMap;
    }

}
