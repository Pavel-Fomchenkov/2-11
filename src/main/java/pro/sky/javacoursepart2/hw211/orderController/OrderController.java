package pro.sky.javacoursepart2.hw211.orderController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.javacoursepart2.hw211.orderService.OrderService;

import java.util.Collections;

@Controller // нужно добавить перевод в json, т.к. это не @RestController который сам переводит в json
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/add")
    public void addItem(int...id) {
        System.out.println("method add");
    }

    @GetMapping("/get")
    public List<Item> getItems() {
        System.out.println("method get");
        return OrderService.getItems();
    }


}
