package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.ComplainDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.AlreadyExistsException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.ComplainAlreadyClosedException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.NotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.Complain;
import iit.uni.miskolc.hu.softwaretesting.model.Complain.ComplainStatus;

import java.util.ArrayList;
import java.util.Collection;

public class ComplainDAOImpl implements ComplainDAO {

    private ArrayList<Complain> complains = new ArrayList<>();

    public ComplainDAOImpl() throws Exception {
        complains.add(new Complain(1, "leiras1", 1));
        complains.add(new Complain(2, "leiras2", 2));
    }

    @Override
    public void createComplain(Complain complain) throws AlreadyExistsException {
        int id = complain.getId();

        for(Complain c : complains) {
            if(id == c.getId()) throw new AlreadyExistsException("Ezzel az azonosítóval már létezik panasz");
        }
        complains.add(complain);
    }

    @Override
    public void modifyComplain(Complain complain) throws NotFoundException {
        int id = complain.getId();
        boolean found = false;

        for(int i=0; i<complains.size();i++) {
            if(id == complains.get(i).getId()) {
                found = true;
                complains.set(i, complain);
                break;
            }
        }
        if(!found) throw new NotFoundException("Nem létezik a panasz");
    }

    @Override
    public void removeComplain(Complain complain) throws NotFoundException {
        int id = complain.getId();
        boolean found = false;

        for(int i=0; i<complains.size();i++){
            if(id == complains.get(i).getId()){
                found = true;
                complains.remove(i);
                break;
            }
        }
        if(!found) throw new NotFoundException("Nem létezik a panasz");
    }

    @Override
    public void acceptComplain(Complain complain) throws ComplainAlreadyClosedException, NotFoundException {
        int id = complain.getId();
        boolean found = false;

        for(Complain c : complains) {
            if(id == c.getId()) {
                found = true;
                if(c.getComplainStatus() == ComplainStatus.REJECTED || c.getComplainStatus() == ComplainStatus.ACCEPTED)
                    throw new ComplainAlreadyClosedException("Ez a panasz már lezárult");
                else c.setComplainStatus(ComplainStatus.ACCEPTED);
            }
        }
        if(!found) throw new NotFoundException("Ilyen panasz nem létezik");
    }

    @Override
    public void rejectComplain(Complain complain) throws ComplainAlreadyClosedException, NotFoundException {
        int id = complain.getId();
        boolean found = false;

        for(Complain c : complains) {
            if(id == c.getId()) {
                found = true;
                if(c.getComplainStatus() == ComplainStatus.REJECTED || c.getComplainStatus() == ComplainStatus.ACCEPTED)
                    throw new ComplainAlreadyClosedException("Ez a panasz már lezárult");
                else c.setComplainStatus(ComplainStatus.REJECTED);
            }
        }
        if(!found) throw new NotFoundException("Ilyen panasz nem létezik");
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
