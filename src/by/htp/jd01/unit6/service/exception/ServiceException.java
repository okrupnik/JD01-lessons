package by.htp.jd01.unit6.service.exception;

/**
 * Created by Fisher on 03.03.2018.
 */
public class ServiceException extends Exception {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Exception cause) {
        super(message, cause);
    }

    public ServiceException(Exception cause) {
        super(cause);
    }
}
