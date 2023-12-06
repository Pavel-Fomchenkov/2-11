package pro.sky.javacoursepart2.hw211.orderController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.javacoursepart2.hw211.orderService.OrderService;

@Controller // нужно добавить перевод в json, т.к. это не @RestController который сам переводит в json
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ResponseBody
    @GetMapping("/add")
    public void addItem(@RequestParam(value = "id") int... id) {
        orderService.addItem(id);
    }

    @ResponseBody
    @GetMapping("/get")
    public String getItems() {
        return orderService.getItems();
    }

}
