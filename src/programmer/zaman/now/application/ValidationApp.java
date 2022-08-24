package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Sam",null);
        try{
            ValidationUtil.validate(loginRequest);
        }catch (ValidationException | NullPointerException ex){
            System.out.println("Data tidak valid: "+ ex.getMessage());
        } finally{
            System.out.println("Selalu dieksekusi");
        }

//        catch (ValidationException e){
//            System.out.println("Data tidak valid : "+e.getMessage());
//        }catch (NullPointerException e){
//            System.out.println("Data null: "+ e.getMessage());
//        }

        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest);
        System.out.println("Success");

    }
}
