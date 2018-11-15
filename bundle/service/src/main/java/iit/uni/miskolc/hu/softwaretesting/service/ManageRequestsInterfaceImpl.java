package iit.uni.miskolc.hu.softwaretesting.service;

import iit.uni.miskolc.hu.softwaretesting.dao.RequestDAO;
import iit.uni.miskolc.hu.softwaretesting.exceptions.*;
import iit.uni.miskolc.hu.softwaretesting.model.Request;

import java.util.Collection;

public class ManageRequestsInterfaceImpl implements ManageRequestsInterface{

    private RequestDAO requestDAO;

    public ManageRequestsInterfaceImpl(RequestDAO requestDAO) {
        this.requestDAO = requestDAO;
    }

    @Override
    public void sendRequest(Request request) throws RequestAlreadyExistsException {
        requestDAO.makeRequest(request);
    }

    @Override
    public void updateRequest(Request request) throws NotFoundException {
        requestDAO.modifyRequest(request);
    }

    @Override
    public void deleteRequest(Request request) throws NotFoundException {
        requestDAO.removeRequest(request);
    }

    @Override
    public Collection<Request> getAllRequest() {
        return requestDAO.searchAllRequest();
    }

    @Override
    public Collection<Request> getAllRequestByType(String type) {
        return requestDAO.searchAllRequestByType(type);
    }

    @Override
    public Collection<Request> getAllRequestByStatus(String status) {
        return requestDAO.searchAllRequestByStatus(status);
    }

    @Override
    public Collection<Request> getAllRequestWithComplain() {
        return requestDAO.searchAllRequestWithComplain();
    }

    @Override
    public Collection<Request> getAllRequestByCourse(String referenceToCourse) throws CourseNotFoundException {
        return requestDAO.searchAllRequestByCourse(referenceToCourse);
    }

    @Override
    public Collection<Request> getAllRequestByUser(int referenceToUser) throws UserNotFoundException {
        return requestDAO.searchAllRequestByUser(referenceToUser);
    }

    @Override
    public Collection<Request> findRequestById(int id) throws InvalidIDValueException {
        return requestDAO.searchRequestById(id);
    }

}
