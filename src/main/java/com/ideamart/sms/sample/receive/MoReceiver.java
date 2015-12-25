/*
 * FILENAME
 *     MoReceiver.java
 *
 * FILE LOCATION
 *     $Source$
 *
 * VERSION
 *     $Id$
 *         @version       $Revision$
 *         Check-Out Tag: $Name$
 *         Locked By:     $Lockers$
 *
 * FORMATTING NOTES
 *     * Lines should be limited to 78 characters.
 *     * Files should contain no tabs.
 *     * Indent code using four-character increments.
 *
 * COPYRIGHT
 *     Copyright (C) 2007 Genix Ventures Pty. Ltd. All rights reserved.
 *     This software is the confidential and proprietary information of
 *     Genix Ventures ("Confidential Information"). You shall not
 *     disclose such Confidential Information and shall use it only in
 *     accordance with the terms of the licence agreement you entered into
 *     with Genix Ventures.
 */

package com.ideamart.sms.sample.receive;

import com.ideamart.sms.sample.operations.Operations;
import com.ideamart.sms.sample.send.SendMessage;
import hms.kite.samples.api.sms.MoSmsListener;
import hms.kite.samples.api.sms.SmsRequestSender;
import hms.kite.samples.api.sms.messages.MoSmsReq;

public class MoReceiver implements MoSmsListener {

    @Override
    public void init() {

    }
    @Override
    public void onReceivedSms(final MoSmsReq moSmsReq) {

        String message = moSmsReq.getMessage();
        Operations operations = new Operations(message);
        operations.passToDatabase();
        SendMessage sendMessage = new SendMessage();
        sendMessage.SendMessage("Your Message Saved",moSmsReq.getApplicationId(),moSmsReq.getSourceAddress()
        ,"psasword","http://127.0.0.1:7000/sms/send");
    }

}
