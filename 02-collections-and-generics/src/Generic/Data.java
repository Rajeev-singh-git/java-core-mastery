package Generic;

public class Data<T> implements IData<T>{


    //T means anything, type of Data can be anything String, Integer etc
    private T data;

    public Data(T data){
        this.data = data;
    }
    @Override
    public T getData(){
        return data;
    }

    @Override
    public void setData(T data){
        this.data = data;
    }

    @Override
    public String toString(){
        return "data is: " + data;
    }


}
