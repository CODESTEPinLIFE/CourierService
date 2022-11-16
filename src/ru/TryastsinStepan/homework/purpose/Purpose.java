package ru.TryastsinStepan.homework.purpose;


import ru.TryastsinStepan.homework.courier.Courier;
import ru.TryastsinStepan.homework.order.Order;
import ru.TryastsinStepan.homework.point.Point;
import ru.TryastsinStepan.homework.timemoment.TimeMoment;

public class Purpose {
    private Courier courier;
    private Order order;
    private Point startPoint;
    public TimeMoment timeExecution;
    private double routeLength;

    public Purpose() {
    }

    public Purpose(Courier courier, Order order, Point startPoint, TimeMoment timeMoment, double routeLength) {
        this.courier = courier;
        this.order = order;
        this.startPoint = startPoint;
        this.timeExecution = timeMoment;
        this.routeLength = routeLength;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public TimeMoment getTimeMoment() {
        return timeExecution;
    }

    public void setTimeMoment(TimeMoment timeMoment) {
        this.timeExecution = timeMoment;
    }

    public double getRouteLength() {
        return routeLength;
    }

    public void setRouteLength(double routeLength) {
        this.routeLength = routeLength;
    }

    @Override
    public String toString() {
        return "ФИО : "+ courier.getNameSurnameFatherland() + "\n" +
               "Номер заказа : " + order.getNumberOrder() + "\n" +
               "Время выполнения :" + timeExecution.calculationTime()+ "\n";


    }
}

