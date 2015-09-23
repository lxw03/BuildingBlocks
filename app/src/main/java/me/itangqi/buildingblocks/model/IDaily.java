package me.itangqi.buildingblocks.model;

import java.util.List;

import me.itangqi.buildingblocks.model.entity.DailyHttp;

/**
 * Created by Troy on 2015/9/21.
 */
public interface IDaily {
    void getFromNet(String date);

    void getFromCache(String date);

    void saveDailies(List<DailyHttp> dailies, String date);

}
