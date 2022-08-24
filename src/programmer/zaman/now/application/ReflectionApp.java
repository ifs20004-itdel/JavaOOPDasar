package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();

        ValidationUtil.validationReflection(request);
    }
}
