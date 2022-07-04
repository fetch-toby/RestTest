package api;

public class StatusApiImpl implements StatusApi{

    @Override
    public String getStatus() {
        return "Hello World! Rest Test is UP";
    }
}
