package code.name.monkey.retromusic.util;

import android.text.TextUtils;

import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationPayload;
import com.onesignal.OSNotificationReceivedResult;

import org.json.JSONObject;


public class NotificationExtender extends NotificationExtenderService {



    @Override
    protected boolean onNotificationProcessing(OSNotificationReceivedResult receivedResult) {
        // Read properties from result.
        OSNotificationPayload payload = receivedResult.payload;
        JSONObject data = payload.additionalData;



        String title = data == null ? payload.title : payload.body;
        String message = data == null ? payload.body : data.optString("message");
        if(payload.launchURL==null || TextUtils.isEmpty(payload.launchURL)){
          //  saveNotification(title, message);
        }
        else {

        //    saveNotification(title, payload.body + " " + payload.launchURL);
        }

      //  makeNotification(getApplicationContext(), title,payload.body, payload.additionalData,payload.launchURL);



        return false;
    }


}