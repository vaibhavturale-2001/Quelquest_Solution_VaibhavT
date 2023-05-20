package service;

import java.util.HashMap;
import java.util.List;

import repo.ARepo;

public class Aservice {



    public HashMap showA1(String a){
        if("A1" == a){
            ARepo repo = new ARepo();
            return repo.Subfolder();
        }
        return null;
    }
    
}
