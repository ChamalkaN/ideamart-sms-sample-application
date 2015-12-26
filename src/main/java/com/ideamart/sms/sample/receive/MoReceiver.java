/*
 *Copyright 2015 Tharinda Dilshan Ehelepola
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ideamart.sms.sample.receive;

import com.ideamart.sms.sample.operations.Operations;
import hms.kite.samples.api.sms.MoSmsListener;
import hms.kite.samples.api.sms.messages.MoSmsReq;

public class MoReceiver implements MoSmsListener {

    @Override
    public void init() {

    }
    @Override
    public void onReceivedSms(final MoSmsReq moSmsReq) {

        String message = moSmsReq.getMessage();
        Operations operations = new Operations(message);
        operations.passToDatabase(moSmsReq);
    }

}
