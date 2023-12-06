package pro.sky.javacoursepart2.hw211.orderModel;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@ConditionalOnProperty("id")
public class Item {
    private int id;


//    public List<Item> getOrder() {
//        return order;
//    }
//
//    private List<Item> order = new ArrayList<Item>();

    public Item(int id) {
        this.id = id;
    }
}
