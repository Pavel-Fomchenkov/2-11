package pro.sky.javacoursepart2.hw211.orderModel;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class IdBasket {
    private List<Integer> basket = new ArrayList<>();

    public List<Integer> getBasket() {
        return basket;
    }
}
