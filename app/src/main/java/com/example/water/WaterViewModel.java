package com.example.water;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WaterViewModel extends AndroidViewModel { //connects app to database

    private WaterRepository repository;

    private LiveData<List<WaterRecord>> allRecords;

    public WaterViewModel(@NonNull Application application){ //creates repository, retrieves data from database into variable list
        super(application);
        repository = new WaterRepository(application);
        allRecords = repository.getAllRecords();
    }

    public LiveData<List<WaterRecord>> getAllRecords(){
        return allRecords;
    }

    public LiveData<WaterRecord> getRecordForDay(String day){
        return repository.getRecordForDay(day);
    }

    public void insert(WaterRecord record){
        repository.insert(record);
    }

    public void update(WaterRecord record){
        repository.update(record);
    }
}
