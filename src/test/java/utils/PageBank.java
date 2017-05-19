package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PageBank {

    private List<Object> pagesList;

    public PageBank() {
        pagesList = new ArrayList<>();
    }

    public <T> T getPage(T t) {
        try {
            for (Object page : pagesList) {
                if (page.getClass() == t.getClass())
                    return (T) page;
            }
        } catch (Exception e) {}
        pagesList.add(t);
        Optional<Object> object = pagesList.stream().filter(obj -> obj.getClass() == t.getClass()).findFirst();
        return (T) object.get();
    }
}
