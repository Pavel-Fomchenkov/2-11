package pro.sky.javacoursepart2.hw211.orderService;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import pro.sky.javacoursepart2.hw211.orderModel.IdBasket;

import java.io.IOException;

@Service
public class OrderServiceImpl implements OrderService {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private IdBasket basket;

    public OrderServiceImpl(IdBasket basket) {
        this.basket = basket;
    }

    @Override
    public void addItem(int... itemId) {
        for (int id : itemId) {
            basket.getBasket().add(id);
            System.out.println("Product " + id + " added to your basket.");
        }
    }

    // ObjectMapper is redundant here. @ResponceBody or @RestController allows Spring to convert objects to json.
    // Without @ResponceBody or @RestController browser will show errors outputting String or List object
    @Override
    public String getItems() {
        try {
            return objectMapper.writeValueAsString(basket.getBasket());
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
