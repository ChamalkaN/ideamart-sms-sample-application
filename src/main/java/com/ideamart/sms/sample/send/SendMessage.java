package com.ideamart.sms.sample.send;

import hms.kite.samples.api.SdpException;
import hms.kite.samples.api.sms.SmsRequestSender;
import hms.kite.samples.api.sms.messages.MtSmsReq;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

/**
 * This class is created for send messages.
 */
public class SendMessage {

    private SmsRequestSender requestSender;

    public void SendMessage(String message, String ApplicationID, String address, String password, String url) {

        MtSmsReq mtSmsReq = new MtSmsReq();
        mtSmsReq.setMessage(message);
        mtSmsReq.setApplicationId(ApplicationID);
        //:TODO: password should be replaced with your IdeaMart password
        mtSmsReq.setPassword(password);
        mtSmsReq.setDestinationAddresses(Arrays.asList(address));

        try {
            //:TODO: URL should be replaced with below url when you host this application
            requestSender = new SmsRequestSender(new URL(url));
            requestSender.sendSmsRequest(mtSmsReq);
        }
        catch (SdpException e) {
            e.printStackTrace();
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
