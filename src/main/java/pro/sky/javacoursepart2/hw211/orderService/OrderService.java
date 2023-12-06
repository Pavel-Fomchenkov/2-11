package pro.sky.javacoursepart2.hw211.orderService;

import org.springframework.stereotype.Service;
import pro.sky.javacoursepart2.hw211.orderModel.Item;

import java.util.List;

@Service
public interface OrderService {
    void addItem(int ... itemId);

    List<Item> getItems();

}
