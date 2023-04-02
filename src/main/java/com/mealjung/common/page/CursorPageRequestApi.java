package com.mealjung.common.page;

import lombok.Getter;
import org.springframework.data.domain.Sort;

import static org.springframework.data.domain.Sort.Direction;

@Getter
public class CursorPageRequestApi {
    private int size = 10;
    private Sort.Direction direction = Direction.DESC;
    private Object lastId;

    public void setSize(int size) {
        int default_size = 10;
        int max_size = 50;
        this.size = size > max_size ? default_size : size;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setLastId(Object lastId) {
        this.lastId = lastId;
    }

    public org.springframework.data.domain.PageRequest of() {
        Sort.Order order = Sort.Order.by("regDate").with(direction);
        if (lastId != null) {
            order = Sort.Order.by("id").with(Direction.DESC);
        }
        return org.springframework.data.domain.PageRequest.of(0, size, Sort.by(order));
    }
}
