package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PageBank {

    private List<Object> pagesList;

    public PageBank() {
        pagesList = new ArrayList<>();
    }

    public <T> void addPage(T t) {
        pagesList.add(t);
    }

    public <T> T getPage(Class<T> tClass) {
        Optional<Object> object = pagesList.stream().filter(obj -> obj.getClass()==tClass).findFirst();
        return (T) object.get();
    }
}
