//package com.example.androidfinal.models;
//
//import android.app.Application;
//
//import androidx.annotation.NonNull;
//import androidx.lifecycle.AndroidViewModel;
//import androidx.lifecycle.LiveData;
//
//import com.example.androidfinal.repositories.OrdersRepository;
//
//import java.util.List;
//
//public class OrdersViewModel extends AndroidViewModel {
//
//
//    private OrdersRepository repository;
//    private LiveData<List<Order>> allOrders;
//    public OrdersViewModel(@NonNull Application application) {
//        super(application);
//        repository = new OrdersRepository(application);
//        allOrders = repository.getAllOrders();
//    }
//
//    public void insert(Order order)
//    {
//        repository.insert(order);
//    }
//
//    public  LiveData<List<Order>> getAllOrders ()
//    {
//        return allOrders;
//    }
//}
