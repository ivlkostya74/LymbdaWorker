package Homwork;

public class Worker implements OnTaskDoneListener, OnTaskErrorListener {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            try {
                if (i != 33) {

                    callback.onDone("Task " + i + " is done");
                } else {
                    errorCallback.onError("Task " + i + " is not completed ");
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
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

