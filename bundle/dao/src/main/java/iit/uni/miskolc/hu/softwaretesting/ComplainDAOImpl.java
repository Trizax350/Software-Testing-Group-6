package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.ComplainDAO;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;

import java.util.ArrayList;
import java.util.Collection;

public class ComplainDAOImpl implements ComplainDAO {

    private ArrayList<Complain> complains = new ArrayList<>();

    public ComplainDAOImpl() throws Exception {
        complains.add(new Complain(1, "leiras1", 1));
        complains.add(new Complain(2, "leiras2", 2));
    }

    @Override
    public void createComplain(Complain complain){
        complains.add(complain);
    }

    @Override
    public void modifyComplain(Complain complain){
        int id = complain.getId();

        for(int i=0; i<complains.size();i++){
            if(id == complains.get(i).getId()){
                complains.set(i, complain);
                break;
            }
        }
    }

    @Override
    public void removeComplain(Complain complain){
        int id = complain.getId();
        for(int i=0; i<complains.size();i++){
            if(id == complains.get(i).getId()){
                complains.remove(i);
                break;
            }
        }
    }

    @Override
    public Collection<Complain> getAllComplain(){
        return complains;
    }

    @Override
    public Collection<Complain> getAllComplainByRequest(int req_id){
        ArrayList<Complain> results = new ArrayList<>();

        for(Complain c : complains){
            if(req_id == c.getReq_id()) {
                results.add(c);
            }
        }
        return results;
    }

    @Override
    public Collection<Complain> findComplainById(int id){
        ArrayList<Complain> results = new ArrayList<>();
        for(Complain c: complains){
            if(c.getId() == id){
                results.add(c);
            }
        }
        return results;
    }
}
