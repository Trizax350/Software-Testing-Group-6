package iit.uni.miskolc.hu.softwaretesting.dao;

import iit.uni.miskolc.hu.softwaretesting.exceptions.CourseNotFoundException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.InvalidIDValueException;
import iit.uni.miskolc.hu.softwaretesting.exceptions.UserNotFoundException;
import iit.uni.miskolc.hu.softwaretesting.model.Request;

import java.util.Collection;

public interface RequestDAO {

    void makeRequest(Request request);
    void modifyRequest(Request request);
    void removeRequest(Request request);
    Collection<Request> searchAllRequest();
    Collection<Request> searchAllRequestByType(String type);
    Collection<Request> searchAllRequestByStatus(String status);
    Collection<Request> searchAllRequestWithComplain();
    Collection<Request> searchAllRequestByCourse(String reference_to_the_Course) throws CourseNotFoundException;
    Collection<Request> searchAllRequestByUser(int referenceToUser) throws UserNotFoundException;
    Collection<Request> searchRequestById(int id) throws InvalidIDValueException;

}
