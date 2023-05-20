
package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import entity.BSubfolder;
import entity.Constants;
import repo.BRepo;

public class Bservice{
    // BRepo bRepo;


    public HashMap AllBfolder(String b){
        if("A3" == b){
            System.out.println(Constants.A);
            System.out.println("A3");
            BRepo bRepo = new BRepo();
            return bRepo.storageB();
        }
        return null;
    }

    public BRepo addB(String b){
        List <BSubfolder> bSubfolders = new ArrayList<>();
        bSubfolders.add(new BSubfolder(b));
        BRepo bRepo = new BRepo();
        bRepo.ToStoreB(bSubfolders);
        return bRepo;

    }
}