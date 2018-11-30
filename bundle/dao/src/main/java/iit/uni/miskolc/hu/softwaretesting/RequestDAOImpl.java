package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.RequestDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import iit.uni.miskolc.hu.softwaretesting.model.Request;
import iit.uni.miskolc.hu.softwaretesting.model.Request.Status;
import iit.uni.miskolc.hu.softwaretesting.model.Request.Forwarded;

import java.util.ArrayList;
import java.util.Collection;

public class RequestDAOImpl implements RequestDAO {

    private ArrayList<Request> requests = new ArrayList<>();

    public RequestDAOImpl() throws Exception {
        requests.add(new Request(1, "low", "Take course", "desc", "Fizika",2));
        requests.add(new Request(2, "medium", "Revise exam", "desc", "Java programozás",2));
    }

    @Override
    public void makeRequest(Request request) throws RequestAlreadyExistsException {
        int id = request.getId();
        for(int i = 0; i < requests.size(); i++) {
            if(id == requests.get(i).getId()) {
                throw new RequestAlreadyExistsException("Ezzel az azonosítóval már létezik kérvény");
            }
        }
        requests.add(request);
    }

    @Override
    public void modifyRequest(Request request) throws NotFoundException {
        boolean found = false;
        int id = request.getId();
        for(int i = 0; i < requests.size(); i++) {
            if(id == requests.get(i).getId()) {
                requests.set(i, request);
                found = true;
            }
        }
        if(!found)
            throw new NotFoundException("Nem létezik ilyen kérvény");
    }

    @Override
    public void removeRequest(Request request) throws NotFoundException {
        boolean found = false;
        int id = request.getId();
        for(int i = 0; i < requests.size(); i++) {
            if(id == requests.get(i).getId()) {
                found = true;
                requests.remove(i);
            }
        }
        if(!found)
            throw new NotFoundException("Nem létezik ilyen kérvény");
    }

    @Override
    public void forwardRequest(Request request) throws RequestAlreadyForwardedException {
        if(request.getForwarded() == Forwarded.FORWARDED)
            throw new RequestAlreadyForwardedException("A kérvény már továbbítva van az adminisztrátoroknak");
        else request.setForwarded(Forwarded.FORWARDED);
    }

    @Override
    public Collection<Request> searchAllRequest() {
        return requests;
    }

    @Override
    public Collection<Request> searchAllRequestByType(String type) {
        ArrayList<Request> results = new ArrayList<>();
        for(int i = 0; i < requests.size(); i++) {
            if(type.equals(requests.get(i).getType())) {
                results.add(requests.get(i));
            }
        }
        return results;
    }

    @Override
    public Collection<Request> searchAllRequestByStatus(Status status) {
        ArrayList<Request> results = new ArrayList<>();
        for(int i = 0; i < requests.size(); i++) {
            if(status == requests.get(i).getStatus()) {
                results.add(requests.get(i));
            }
        }
        return results;
    }

    @Override
    public Collection<Request> searchAllRequestWithComplain() {
        return requests;
    }

    @Override
    public Collection<Request> searchAllRequestByCourse(String reference_to_the_Course) throws CourseNotFoundException {
        ArrayList<Request> results = new ArrayList<>();
        for(int i = 0; i < requests.size(); i++) {
            if(reference_to_the_Course.equals(requests.get(i).getReference_to_the_Course())) {
                results.add(requests.get(i));
            }
        }
        return results;
    }

    @Override
    public Collection<Request> searchAllRequestByUser(int referenceToUser) throws UserNotFoundException {
        ArrayList<Request> results = new ArrayList<>();
        for(int i = 0; i < requests.size(); i++) {
            if(referenceToUser == requests.get(i).getReferenceToUser()) {
                results.add(requests.get(i));
            }
        }
        return results;
    }

    @Override
    public Collection<Request> searchRequestById(int id) throws InvalidIDValueException {
        ArrayList<Request> results = new ArrayList<>();
        for(int i = 0; i < requests.size(); i++) {
            if(id == requests.get(i).getId()) {
                results.add(requests.get(i));
            }
        }
        return results;
    }

}
