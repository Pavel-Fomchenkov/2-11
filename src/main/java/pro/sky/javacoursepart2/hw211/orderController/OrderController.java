package pro.sky.javacoursepart2.hw211.orderController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pro.sky.javacoursepart2.hw211.orderService.OrderService;

@Controller // @ResponceBody added to methods (can be applied to class) for correct browser representation
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
