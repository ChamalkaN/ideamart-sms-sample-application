package com.ideamart.sms.sample.operations;

import com.ideamart.sms.sample.db.dbClass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class is created for do operations for messages.
 */
public class Operations {

    private String message;

    public Operations(String message) {
        this.message = message;
    }

    public void passToDatabase() {
        String [] messageParts = message.split(" ");
        HashMap map = dbClass.map;
        map.put(messageParts[1], messageParts[2]);
    }
}
