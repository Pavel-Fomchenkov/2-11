package pro.sky.javacoursepart2.hw211.orderService;

import com.fasterxml.jackson.databind.ObjectMapper;
import pro.sky.javacoursepart2.hw211.orderModel.Item;

import java.util.ArrayList;
import java.util.List;

//public class OrderServiceImpl implements OrderService{

    private final ObjectMapper objectMapper;

    private Item item;
    private final List<Item> order = new ArrayList<>();

    private OrderServiceImpl(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
    @Override
    public void addItem(int... itemId) {
        for (int id : itemId){
            order.add(id);
        }
    }

    @Override
 //   public List<Item> getItems() {
        return Item.getOrder();
    }
}
