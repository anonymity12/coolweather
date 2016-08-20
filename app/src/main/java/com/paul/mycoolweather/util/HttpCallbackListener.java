package com.paul.mycoolweather.util;

public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
