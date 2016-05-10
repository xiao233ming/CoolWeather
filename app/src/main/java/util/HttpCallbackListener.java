package util;

/**
 * Created by mingming on 2016/5/9.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
