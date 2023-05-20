package repo;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entity.BSubfolder;
import entity.Constants;

public class BRepo {

    HashMap<Constants, List> BRepo = new HashMap<>(); 

    
    
    public HashMap storageB(){
        List <BSubfolder> bList = new ArrayList<BSubfolder>();
        bList.add(new BSubfolder("B1"));
        bList.add(new BSubfolder("B2"));
        BRepo.put(Constants.B, bList);
        return BRepo;
    }

    public HashMap ToStoreB(List foldername){
        // List <BSubfolder> bList = new ArrayList<>();
        // bList.add(new BSubfolder(foldername));
        BRepo.put(Constants.B, foldername);
        return BRepo;
    }

    @Override
    public String toString() {
        return "BRepo [BRepo=" + BRepo + "]";
    }

   
    
    

}
