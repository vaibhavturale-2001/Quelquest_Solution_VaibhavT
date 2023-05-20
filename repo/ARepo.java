package repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entity.Constants;
import entity.Subfolder;

public class ARepo {

    HashMap <Constants , List> Arepo = new HashMap<>();

    public HashMap Subfolder(){
        List <Subfolder> aList = new ArrayList<>();
        aList.add(new Subfolder("A1"));
        aList.add(new Subfolder("A2"));
        aList.add(new Subfolder("A3"));
        Arepo.put(Constants.A, aList);
        return Arepo;
    }

    @Override
    public String toString() {
        return "ARepo [Arepo=" + Arepo + "]";
    }



}
