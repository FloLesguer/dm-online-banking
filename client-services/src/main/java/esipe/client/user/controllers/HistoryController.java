package esipe.client.user.controllers;

import esipe.restutils.RestManagement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * History controller class
 */
@RestController
@RequestMapping(path = "/history")
public class HistoryController {

    private String PATH_ROOT = "/";

    /**
     *
     * @param id
     * @return
     * @throws IOException
     */
    @RequestMapping(path = "/account/{id}", method = RequestMethod.GET)
    public ResponseEntity getAccountHistory(@PathVariable Long id) throws IOException {
        return RestManagement.getResponse(PATH_ROOT + "accounts/history/", id);
    }

    /**
     *
     * @param id
     * @return
     * @throws IOException
     */
    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity getUserHistory(@PathVariable Long id) throws IOException {
        return RestManagement.getResponse(PATH_ROOT + "users/history/", id);
    }
	
}
