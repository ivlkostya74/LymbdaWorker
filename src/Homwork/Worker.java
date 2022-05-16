package Homwork;

public class Worker implements OnTaskDoneListener, OnTaskErrorListener {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback,OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
        this.callback = callback;
    }



//    public Worker() {
//
//    }

    public void start() {
        for (int i = 0; i < 100; i++) {

                if (i != 33) {

                    callback.onDone("Task " + i + " is done");
                } else {
                    errorCallback.onError("Task " + i + " is not completed ");
                }

        }
    }

    @Override
    public void onDone(String result) {

    }

    @Override
    public void onError(String error) {

    }

}

