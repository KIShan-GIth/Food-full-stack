package in.Kishan.foodiesapi.service;

import in.Kishan.foodiesapi.io.UserRequest;
import in.Kishan.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
