package in.Kishan.foodiesapi.service;

import in.Kishan.foodiesapi.io.CartRequest;
import in.Kishan.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
