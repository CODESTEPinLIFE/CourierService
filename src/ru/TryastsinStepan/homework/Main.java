package ru.TryastsinStepan.homework;

import ru.TryastsinStepan.homework.courier.Courier;
import ru.TryastsinStepan.homework.order.Order;
import ru.TryastsinStepan.homework.point.Point;
import ru.TryastsinStepan.homework.purpose.Purpose;
import ru.TryastsinStepan.homework.reader.PurposeReader;
import ru.TryastsinStepan.homework.schedule.Schedule;
import ru.TryastsinStepan.homework.timemoment.TimeMoment;
import ru.TryastsinStepan.homework.writer.PurposeWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Courier courier[] = new Courier[2];
        Purpose purposes[] = new Purpose[1];
        Purpose purposes1[] = new Purpose[1];
        Schedule schedule = new Schedule(purposes);
        Schedule schedule1 = new Schedule(purposes1);
        Order order = new Order( 1, new Point(0,0), new TimeMoment(4,6), purposes[0], new Point(10,10));
        Order order1 = new Order( 2, new Point(6,4), new TimeMoment(1,8), purposes1[0], new Point(20,20));
        courier[0] = new Courier("Jax", 534, 8, new Point(4,2));
        courier[1] = new Courier("Ser", 534, 2, new Point(5,1));


        Purpose[] purpose=  {
                  new Purpose(courier[0],order,new Point(6,4),new TimeMoment(4,6),567),
                  new Purpose( courier[1] ,order1,new Point(6,6),new TimeMoment(2,6),234)
        };

        PurposeWriter purposeWriter = new PurposeWriter();
        File file1 = new File("qwer.txt");
        try {
            purposeWriter.write(file1,purpose);
        } catch (IOException e) {
            e.printStackTrace();
        }


        PurposeReader purposeReader = new PurposeReader();
        File file2 = new File("Courier.txt");
        try {
            Courier [] couriers = purposeReader.readCouriers(file2);
            for(Courier courier1:couriers){
                System.out.println(courier1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}