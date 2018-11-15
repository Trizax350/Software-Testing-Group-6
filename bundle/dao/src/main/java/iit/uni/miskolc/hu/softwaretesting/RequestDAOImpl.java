package iit.uni.miskolc.hu.softwaretesting;

import iit.uni.miskolc.hu.softwaretesting.dao.RequestDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.CourseNotFoundException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.UserNotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.Request;

import java.util.ArrayList;
import java.util.Collection;

public class RequestDAOImpl implements RequestDAO {

    private ArrayList<Request> requests = new ArrayList<>();

    public RequestDAOImpl() throws Exception {
        requests.add(new Request(1, "low", "Kurzus felvétel", "desc", "Fizika",2, "Open"));
        requests.add(new Request(2, "medium", " Kurzus leadás", "desc", "Java programozás",2, "Closed"));
    }

    @Override
    public void makeRequest(Request request) {
        requests.add(request);
    }

    @Override
    public void modifyRequest(Request request) {
        int id = request.getId();
        for(int i = 0; i < requests.size(); i++) {
            if(id == requests.get(i).getId()) {
                requests.set(i, request);
            }
        }
    }

    @Override
    public void removeRequest(Request request) {
        int id = request.getId();
        for(int i = 0; i < requests.size(); i++) {
            if(id == requests.get(i).getId()) {
                requests.remove(i);
            }
        }
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
    public Collection<Request> searchAllRequestByStatus(String status) {
        ArrayList<Request> results = new ArrayList<>();
        for(int i = 0; i < requests.size(); i++) {
            if(status.equals(requests.get(i).getStatus())) {
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
