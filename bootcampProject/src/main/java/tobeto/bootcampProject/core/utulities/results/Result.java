package tobeto.bootcampProject.core.utulities.results;

public class Result {

    private boolean success;
    private  String massage;

    public Result (boolean success){
        this.success=success;
    }

    public Result (boolean success, String message){
        this(success);
        this.massage=message;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage(){
        return massage;
    }

}
