package programmer.zaman.now.util;

import programmer.zaman.now.annotation.NotBlank;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    // Checked Exception
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if(loginRequest.username()==null){
            throw new NullPointerException("Username can't be null");
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username can't be blank");
        } else if(loginRequest.password()==null){
            throw new NullPointerException("Password can't be null");
        }else if(loginRequest.password().isBlank()){
            throw new ValidationException("Password can't be blank");
        }
    }

    // Runtime Exception, gak wajib memakai keyword throws, tanpa try catch
    public static void validateRuntime(LoginRequest loginRequest)  {
        if(loginRequest.username()==null){
            throw new NullPointerException("Username can't be null");
        }else if(loginRequest.username().isBlank()){
            throw new BlankException("Username can't be blank");
        } else if(loginRequest.password()==null){
            throw new NullPointerException("Password can't be null");
        }else if(loginRequest.password().isBlank()){
            throw new BlankException("Password can't be blank");
        }
    }

    public static void validationReflection(Object object)  {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(Field field: fields){
            field.setAccessible(true);
            if(field.getAnnotation(NotBlank.class)!=null){
                try{
                    String value =  (String)field.get(object);
                    if(value == null || value.isBlank()){
                        throw new BlankException("Field "+ field.getName() + " is blank");
                    }
                }
                catch (IllegalAccessException ex){
                    System.out.println("Tidak bisa mengakses field "+ field.getName());
                }

            }
        }
    }
}
