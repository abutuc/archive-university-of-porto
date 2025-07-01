package pt.up.feup.ses.exceptionhandler;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import pt.up.feup.ses.exception.UserNotFoundException;
import pt.up.feup.ses.exception.DirectoryNotFoundException;
import pt.up.feup.ses.exception.FileNotFoundException;
import pt.up.feup.ses.exception.PermissionNotFoundException;

public class ExceptionHandler implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception exception) {

        if (exception instanceof UserNotFoundException) {
        return Response.status(Response.Status.NOT_FOUND)
            .entity(new ErrorResponseBody(exception.getMessage()))
            .build();
        } else if (exception instanceof DirectoryNotFoundException) {
        return Response.status(Response.Status.NOT_FOUND)
            .entity(new ErrorResponseBody(exception.getMessage()))
            .build();
        } else if (exception instanceof FileNotFoundException) {
        return Response.status(Response.Status.NOT_FOUND)
            .entity(new ErrorResponseBody(exception.getMessage()))
            .build();
        } else if (exception instanceof PermissionNotFoundException) {
        return Response.status(Response.Status.NOT_FOUND)
            .entity(new ErrorResponseBody(exception.getMessage()))
            .build();
        }

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
            .entity(new ErrorResponseBody("Something unexpected happened. Please try again later."))
            .build();
    }

    public static final class ErrorResponseBody {

        private final String message;

        public ErrorResponseBody(String message) {
        this.message = message;
        }

        public String getMessage() {
        return message;
        }
    }

}
